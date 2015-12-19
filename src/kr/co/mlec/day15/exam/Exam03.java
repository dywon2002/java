package kr.co.mlec.day15.exam;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Exam03 {

	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		
		try{
		while(true){
			System.out.print("입력 : ");
			int ch = (char)isr.read();
			isr.read();
			isr.read();
			
			if(Character.toUpperCase(ch)=='Q'){
				System.out.println("종료합니다.");
				break;
			}
			System.out.println("입력된 문자는 "+(char)ch+"입니다");
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}

}
}