package kr.co.mlec.day17;

import java.io.File;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		try {
			searchFileContent("data/find.txt", "System");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void searchFileContent(String readFileName, String findStr) throws Exception {
		Scanner sc = new Scanner(new File(readFileName));
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			if(str.contains(findStr)){
			System.out.println(str);}
		}
	}
}