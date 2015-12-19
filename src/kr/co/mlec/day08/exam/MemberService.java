/*
 * 	data/member.txt 파일의 내용을 읽어서 회원에 대한 서비스를 제공
 */

package kr.co.mlec.day08.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MemberService {

	Scanner sc = new Scanner(System.in);
	MemberVO[] list = new MemberVO[10];
	int pos = 0;

	// 회원정보 서비스 준비를 위한 메서드 호출
	void execute() {
		load();
		while (true) {
			int choice = menu();
			switch (choice) {
			case 1:
				listAll();
				break;
			case 2:
				viewByAge();
				break;
			case 3:
				System.out.println("시스템을 종료합니다");
				System.exit(0);
			}
		}
	}

	void viewByAge() {
		System.out.println("연령별 회원 보기");
		System.out.println("---------------");
		System.out.println("1. 10대");
		System.out.println("2. 20대");
		System.out.println("3. 30대");
		System.out.println("4. 40대");
		System.out.println("5. 기타");
		System.out.print("연령대를 선택하세요 : ");
		int choice = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < pos; i++) {

			MemberVO member = list[i];
			switch (choice) {

			case 1:
				if (member.age > 10 & member.age < 20)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 2:
				if (member.age > 20 & member.age < 30)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 3:
				if (member.age > 30 & member.age < 40)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 4:
				if (member.age > 40 & member.age < 50)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 5:
				if (member.age < 10 & member.age > 50)
					System.out.println(member.name + "\t" + member.age);
				if (i == 0) {
					System.out.println("기타 연령대의 회원이 없습니다");
				}
				break;
			default:
				break;
			}
		}
	}

	void listAll() {
		System.out.println("---------------");
		System.out.println("전체 : " + pos + "명");
		System.out.println("---------------");
		for (int i = 0; i < pos; i++) {
			MemberVO member = list[i];
			System.out.println(member.name + "\t" + member.age);
		}
		System.out.println("---------------");
	}

	int menu() {
		System.out.println("---------------");
		System.out.println("1. 회원 정보 보기");
		System.out.println("2. 연령별 회원 보기");
		System.out.println("3. 종료");
		System.out.println("---------------");
		System.out.print("메뉴를 선택하세요 : ");
		int choice = Integer.parseInt(sc.nextLine()); // nextLine은 문자열을 반환
														// 정수형으로 받기위해 parseInt사용
		return choice;
	}

	// String[] split(String data) {
	// return new String[2];
	// }

	// 회원 서비스를 하기 위해서 파일의 내용을 읽어서 메모리에 올리는 역할
	void load() {

		// String[] arr = split("배수지:25");

		try {
			Scanner sc = new Scanner(new File("data/member.txt"));
			while (sc.hasNextLine()) {
				// 배수지:25
				String line = sc.nextLine();
				// split로 :를 기준으로 나뉘어진 배열의 개수가 들어간다

				String[] infoArr = line.split(":");

				MemberVO member = new MemberVO();
				member.name = infoArr[0];
				// "25" 문자열을 숫자 25로 변환
				// Integer.parseInt(문자열)
				member.age = Integer.parseInt(infoArr[1]);
				list[pos++] = member;
			}
			System.out.println("회원 정보 로딩 성공!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
