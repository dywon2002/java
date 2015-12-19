/*
 * 속도를 개선하자
 * - 한번 갔을때 많이 가지고 오고 한꺼번에 많이 출력(버퍼 활용)
 * - 버퍼 공간 만들때 배열을 이용
 * - 1024 byte 단위로
 */
package kr.co.mlec.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam07 {

	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis=new FileInputStream("data/ioexam07.txt");
			fos=new FileOutputStream("data/ioexam07copy.txt");
			
			// 버퍼 공간 만들기
			// byte 처리 스트림(InputStream, OutputStream) : byte 배열
			// char 처리 스트림(Reader, Writer) : char 배열
			
			byte[] arr = new byte[5];
			
			while(true){
				int c = fis.read(arr);
				if(c==-1)break;
				
				// arr 배열의 내용을 출력, 0번째 위치부터 c 크기 만큼 출력
				fos.write(arr,0,c);
			}
			
			System.out.println("파일 복사가 완료되었습니다");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(fis!=null){
				try{
					fis.close();
				}
			catch(Exception e){
				e.printStackTrace();
			}
			}
			if(fos!=null){
				try{
					fos.close();
				}
			catch(Exception e){
				e.printStackTrace();
			}
			}
			
		}
	}

}
