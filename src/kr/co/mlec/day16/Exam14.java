package kr.co.mlec.day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("data/ioexam14.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			bw.write("이름 : " + name + ", 나이 : " + age);
			pw.printf("이름 : %s, 나이: %d", name, age);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
