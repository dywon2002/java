/*
 * 객체를 저장하고 읽는 방법
 * 
 * ObjectInputStream, ObjectOutputStream
 * 
 * 객체를 출력 : 직렬화, 객체의 메모리의 내용을 순서있는 바이트 단위로 쓰는것
 * 직렬화 조건 : 대상 클래스는 반드시 Serializable 인터페이스를 상속해야함
 * 
 * 바이트를 원래의 객체로 조합 : 역직렬화
 */

package kr.co.mlec.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 마크 인터페이스, 멤버는 이제 직렬 가능이라는 표시, 기능을 구현시키는 것이 아님
class Member implements Serializable{
	private String id;
	// 이 필드의 값은 제외, 직렬화시 해당값은 제외
	private transient String pass;
	
	
	Member(){}
	Member(String id,String pass){
		this.id = id;
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

public class Exam13 {
	private static void write(){
		Member m = new Member("hong", "1111");
		try(	
			FileOutputStream fos = new FileOutputStream("data/ioexam13.txt");
			
			// 직렬화를 처리하는 클래스
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				){
			
//			String data = m.getId()+":"+m.getPass()+"\n";
//			fos.write(data.getBytes());

			oos.writeObject(m); // 직렬화 메서드
			
			System.out.println("직렬화 성공");
			
		}
		catch(Exception e){
			
		}
	}
	
	private static void read(){
		try(
				FileInputStream fis = new FileInputStream("data/ioexam13.txt");
				
				// 역직렬화 처리 클래스
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				
				){
			// Object 타입으로 반환 -> 형변환 작업 필요
			Member m = (Member)ois.readObject();
			System.out.println("id : "+m.getId());
			System.out.println("pass : "+m.getPass());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		// 직렬화 호출
		write();
		
		// 역직렬화 호출 : 파일의 내용을 원래의 객체로 변환
		read();
		
	}
	
}
