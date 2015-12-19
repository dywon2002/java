/*
 * 카피 프로그램 만들기
 *  - 복사한 파일 (Penguins.jpg)을 읽어서 Penguins1.jpg로 저장하는 프로그램 작성
 *  - 화면에 복사 완료여부를 출력
 *    예) 파일 복사가 완료되었습니다
 */
package kr.co.mlec.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam06 {

	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis=new FileInputStream("data/Calendar1.avi");
			fos=new FileOutputStream("data/Calendar2.avi");
			
			
			long s = System.currentTimeMillis();
			
			while(true){
				int c = fis.read();
				if(c==-1)break;
				fos.write(c);
			}
			long e = System.currentTimeMillis();
			double time = (e - s)/1000d;
			System.out.println("파일 복사 시간 : "+time+"초");
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
