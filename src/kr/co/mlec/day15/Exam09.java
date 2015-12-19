/*
 * 속도 향상 위해 : buffer - 사용자가 배열을 생성
 * 
 * API에서 제공하는 버퍼를 활용한 클래스를 사용
 * BufferedInputStream
 * BufferedOutputStream
 * 
 * BufferedReader
 * BufferedWriter
 */



package kr.co.mlec.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam09 {

	public static void main(String[] args) {
		// 파일 복사를 위한 스트림 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 속도 향상을 위해 버퍼를 활용한 클래스 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try{
			
			// 파일을 읽고 쓰기 위한 스트림 생성
			fis = new FileInputStream("data/ioexam08.txt");
			fos = new FileOutputStream("data/ioexam08copy.txt");
			
			// 파일 스트림 클래스는 속도가 느리기 때문에
			// 속도 향상을 위해 Buffered 클래스 활용
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true){
				int ch = bis.read();
				if(ch==-1)break;
				bos.write(ch);
			}
			System.out.println("파일 복사가 완료되었습니다");
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(bis!=null){
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
