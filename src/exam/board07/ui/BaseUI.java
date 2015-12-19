package exam.board07.ui;

import java.util.Scanner;

public class BaseUI {
	private Scanner sc = new Scanner(System.in);
	public String inputStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	public int inputInt(String msg) {
		System.out.print(msg);
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}
}
