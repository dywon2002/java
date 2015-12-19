package kr.co.mlec.day15;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Exam01 {
	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		System.out.print("입력 : ");
		try{
		while(true){
			int ch = isr.read();
			System.out.print((char)ch); // 역슬래시 r 역슬래시 n 엔터값이 추가
		}
			
			
			/*
		int ch = in.read();
		System.out.println("읽은 값 : "+ch);
		ch = in.read();
		System.out.println("읽은 값 : "+ch);
		ch = in.read();
		System.out.println("읽은 값 : "+ch);
		*/
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
