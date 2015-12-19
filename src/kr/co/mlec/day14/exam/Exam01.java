/*
 * 1. exam01.txt 파일의 내용을 읽어서 리스트에 입력한다
 * 2. 리스트에 입력된 내용을 참고해서 아래와 같은 결과를 출력함
 * 		
 * 		결과
 * 		--------
 * 		점수
 *		--------
 *		95
		27
		85
		55
		70
		--------
		총점 : ...
		평균 : ...
 */
package kr.co.mlec.day14.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("data\\Exam01.txt"));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int sum=0;
		
		while (sc.hasNextLine()) {
			list.add(sc.nextInt());
		}
		
		System.out.println("결과");
		System.out.println("--------");
		System.out.println("점수");
		System.out.println("--------");
		
		for(int i = 0;i<list.size();i++){
			Integer nums = list.get(i);
			System.out.println(nums);
			sum+=nums;
		}
		System.out.println("--------");
		System.out.println("총점 : "+sum);
		System.out.println("총점 : "+(float)sum/list.size());
}
	
}
