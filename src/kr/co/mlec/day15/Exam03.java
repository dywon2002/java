/*
 * FileReader
 */


package kr.co.mlec.day15;

import java.io.FileReader;

public class Exam03 {

	public static void main(String[] args) {
		try{
		FileReader fis = new FileReader("src/co/kr/mlec/day06/ArrayTest.java");
		// read() 읽은 문자에 대한 아스키코드를 반환
		// 단, 읽은 내용이 없을 경우(스트림 끝인 경우) -1을 반환함
		while(true){
			
		int ch = fis.read();
		// 스트림 끝
		if(ch==-1)break;
		System.out.print((char)ch);
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
