/*
 * 파일의 형식 - 제목,개봉년도,주연
 */


package kr.co.mlec.day14.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String movieStar = getMovieStar("왕의 남자");
		System.out.println(movieStar);
		movieStar = getMovieStar("태극기 휘날리며");
		System.out.println(movieStar);
	}

	private static String getMovieStar(String movieName) {
		List<String> list = new ArrayList<>();
		String result = "결과값이 없습니다";
		try {
			Scanner sc = new Scanner(new File("data/exam04.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(",");
				if(movieName.equals(arr[0])){
					return arr[2];
				}
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		return result;		
		
		}
	
	
}
