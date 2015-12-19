/*
 * FileWriter : 파일에 출력하는 스트림(문자)
 * write(int ch)
 * close() : 스트림을 닫을때 사용, 내부적으로 flush()를 호출
 * flush() : 버퍼에 있는 내용을 강제로 내보내기
 */
package kr.co.mlec.day15;

import java.io.FileWriter;
import java.io.IOException;

public class Exam05 {

	public static void main(String[] args) {
		// 파일이 존재하면 덮어쓰고 파일이 없다면 새롭게 생성해서 출력
		// 파일에 내용을 추가하고 싶다면 객체 생성시 append 옵션에 true를 설정
		FileWriter fw = null; 
		try {
//					new FileOutputStream("data/ioexam04.txt");
					fw = new FileWriter("data/ioexam05.txt",true);
			int ch = 'c';
			
			fw.write(97); // write 메소드는 int형 정수값만 들어갈수 있다
			fw.write('b');
			fw.write(ch);
			
			System.out.println("파일에 내용을 출력했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			// 스트림 닫기
			if(fw!=null){
			try {
				fw.close(); // 파일에 내용이 안 올라오면 close()를 꼭 붙여줘야한다
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
				}
			}
		}
	
	}

}
