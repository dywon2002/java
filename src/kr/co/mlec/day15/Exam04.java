/*
 * FileOutputStream : 파일에 출력하는 스트림(바이트)
 * write(int ch)
 */
package kr.co.mlec.day15;

import java.io.FileOutputStream;

public class Exam04 {

	public static void main(String[] args) {
		// 파일이 존재하면 덮어쓰고 파일이 없다면 새롭게 생성해서 출력
		// 파일에 내용을 추가하고 싶다면 객체 생성시 append 옵션에 true를 설정
		try {
			FileOutputStream fos = 
//					new FileOutputStream("data/ioexam04.txt");
					new FileOutputStream("data/ioexam04.txt",true);
			int ch = 'c';
			
			fos.write(97); // write 메소드는 int형 정수값만 들어갈수 있다
			fos.write('b');
			fos.write(ch);
			
			System.out.println("파일에 내용을 출력했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
