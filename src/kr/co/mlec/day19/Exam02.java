package kr.co.mlec.day19;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.daum.net");
			InputStream in = url.openStream();
			Scanner sc = new Scanner(in,"utf-8");
			while(sc.hasNextLine()){
				System.out.println(sc.next());
			}
			
			/*
			InputStreamReader isr = new InputStreamReader(in,"utf-8");
			while(true){
				int ch = isr.read();
				if(ch == -1) 
					break;
				System.out.print((char)ch);
				}
			 */
			}
		catch(Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
}
