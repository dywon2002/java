/*
 * 수를 입력(종료 : -1) : 3
 * 수를 입력(종료 : -1) : 7
 * 수를 입력(종료 : -1) : 2
 * 수를 입력(종료 : -1) : -1
 * 
 * 결과 : 12
 */

package co.kr.mlec.day06;

import java.util.Scanner;

public class LoopExam01 {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		int sum=0;
		
		while(true){
			System.out.print("수를 입력(종료 : -1) : ");
			int num = sc.nextInt();
			
			
			
			if(num==-1) break;
			
			sum+= num; // sum = sum + num;
			
			
		}
		System.out.println("결과 : "+sum);
		
	}
	
}
