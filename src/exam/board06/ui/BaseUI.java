package exam.board06.ui;

import java.util.Scanner;

public class BaseUI {
	
	
	private Scanner sc = new Scanner(System.in);
	
	public String inputStr(String msg){
		System.out.print(msg);
		return sc.nextLine();
	}
	public int inputInt(String msg){
		System.out.print(msg);
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}
	
	/*public static void main(String[] args) {
		BaseUI ui = new BaseUI();
		String name = ui.inputStr("이름 : ");
		int age = ui.inputInt("나이 : ");
		System.out.println("입력된 이름 : "+name);
		System.out.println("입력된 나이 : "+age);
	}*/
	
}