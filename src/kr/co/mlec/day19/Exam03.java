/*
 * ¿ÀÇÂ API È°¿ë(´ÙÀ½)
 */


package kr.co.mlec.day19;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		
		try {
			String blogAddr = "https://apis.daum.net/search/blog"
					+ "?apikey=f1fe1ade01115b09c6f078e3f1d1e50b"
					+ "&q="+URLEncoder.encode("ÅÁ¼öÀ°","UTF-8")
					+ "&output=xml";
			URL url = new URL(blogAddr);
			InputStream in = url.openStream();
			Scanner sc = new Scanner(in,"utf-8");
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
