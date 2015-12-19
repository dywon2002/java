package kr.co.mlec.day08;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {

	public static void main(String[] args) throws Exception {

		// System.in -> 콘솔
		// File -> 디스크에 저장된 파일 읽기
		// c:/member.txt -> c 드라이브 밑에 member.txt
		// member.txt -> 이클립스에서 실행시에는 파일 찾을때
		// 현재 프로젝트 폴더에서 찾는다, 이클립에서 실행하면 현재 폴더 Java-basic
		Scanner sc = new Scanner(new File("data/member.txt"));

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
	}

}