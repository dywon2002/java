/*
 * OutputStream은 write(int)시 int를 구성하는 4바이트 중에서 하위 1바이트만 처리
 * Writer은 write(int)시 int를 구성하는 4바이트 중에서 하위 2바이트만 처리
 * 
 * 기본형을 구성하는 모든 바이트를 출력하고 싶다면
 * DataOutputStream 클래스를 활용한다
 */

package kr.co.mlec.day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam12 {

	public static void main(String[] args) {
//		write();
		read();
	}
	/*
	 * ioexam12.txt에 쓰여진 파일의 내용 읽기
	 * - DataOutputStream에 의해서 쓰여진 내용을 읽을 때는
	 *   반드시 쓰여진 규칙 순서대로 읽어야 한다
	 */
	private static void read(){
		try(
				FileInputStream fis = new FileInputStream("data/ioexam12.txt");
				DataInputStream dis = new DataInputStream(fis);
				){
				// 읽을때 순서가 중요하다
				double d = dis.readDouble();
				int i = dis.readInt();
				char c = dis.readChar();
				String str = dis.readUTF();
				
				System.out.println("int : "+i);
				System.out.println("double : "+d);
				System.out.println("char : "+c);
				System.out.println("String : "+str);
				
				
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void write() {
		try ( // try 문안에 넣으면 close를 안 써줘도 된다
				FileOutputStream fos = new FileOutputStream("data/ioexam12.txt");
				DataOutputStream dos = new DataOutputStream(fos); // 기본형값을 출력할거
																	// 안쪽에 넣어준다

		) {
			// 1001.1가 -> 8바이트(이렇게 생각하면 안된다)

			dos.writeInt(100); // 4바이트 출력
			dos.writeDouble(1.1); // 8바이트 출력
			dos.writeChar('가'); // 2바이트 출력
			// 14 바이트

			// 문자열 출력
			// dos.write("안녕하세요".getBytes("UTF-8")); // 문자열은 바로 가져올수 없으므로
			// getBytes()를 써준다
			dos.writeUTF("안녕하세요"); // 위의 것을 편하게 사용하는 방법

			System.out.println("파일 쓰기 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
