package co.kr.mlec.day06.exam;

import java.util.Scanner;

public class Exam01Answer {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 행의 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		System.out.print("출력할 열의 수를 입력하세요 : ");
		int showColumn = sc.nextInt();
				
		while(row >= 1){
			for(int i = 1; i<= showColumn; i++){
				System.out.print(row%2==1?"<":">");
			}
			
			--row;
			System.out.println();
		}
		
	}

}
