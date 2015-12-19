/*
 * 	close 개선
 * 	- 1.7 버전부터 try~catch 를 통해서 자동 close()를 지원
 *  BufferedReader
 *  - String ReadLine() : 줄단위로 읽는 메서드, 줄넘김 문제는 제외
 *  					  null (문자열의 끝을 나타냄)
 */



package kr.co.mlec.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exam10 {

	public static void main(String[] args) {
		// 파일 복사를 위한 스트림 선언
//		FileReader fis = null;
//		FileWriter fos = null;
		
		// 속도 향상을 위해 버퍼를 활용한 클래스 선언
//		BufferedReader bis = null;
//		BufferedWriter bos = null;
		
//		BufferedWriter
//		=
		
		
		// 자동 close
		try(
				// 파일을 읽고 쓰기 위한 스트림 생성
				FileReader fis = new FileReader("data/ioexam10.txt");
				FileWriter fos = new FileWriter("data/ioexam10copy.txt");
				
				// 파일 스트림 클래스는 속도가 느리기 때문에
				// 속도 향상을 위해 Buffered 클래스 활용
				
				BufferedReader bis = new BufferedReader(fis);
				BufferedWriter bos = new BufferedWriter(fos);
				){
			
			
			while(true){
				String ch = bis.readLine();
				if(ch==null)break;
				bos.write(ch);
			}
			System.out.println("파일 복사가 완료되었습니다");
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
