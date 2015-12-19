package kr.co.mlec.day17.ui;

import java.util.Scanner;

public class ExitUI implements IProductUI {
	
	
	@Override
	public void execute() {
		System.out.print("종료하시겠습니까? (취소 : N, 종료 : 엔터) : ");
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		if(c.equals("N")){
		}
		else if(c.equals("")){
			System.out.print("종료되었습니다");
			System.exit(0);
		}
	}

}
