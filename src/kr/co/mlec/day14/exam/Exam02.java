/*
 * 
 * 김우리,80
 * 홍연우,70
 * 나일우,90
 * 강효자,100
 * 
 * 프로그램 작성 조건
 * 1. 파일의 있는 내용을 읽어서 리스트에 담는다
 * 		- 리스트의 파라미터 타입을 StudentVO로 설정한다
 * 2. 출력형식을 다음과 같이 나오도록 작성한다
 * 
 * 총 4명
 * --------------------
 * 이름         점수
 * --------------------
 * 김우리       80
 * 홍연우       70
 * 나일우       90
 * 강효자      100
 * --------------------
 * 1등 : 강효자
 * 
 */

package kr.co.mlec.day14.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



class StudentVO{
	String name;
	int scr;
	public StudentVO(){
		
	}
	public StudentVO(String name, int scr) {
		this.name = name;
		this.scr = scr;
	}
	
}


public class Exam02 {

	public static void main(String[] args) {
		
		ArrayList<StudentVO> list = new ArrayList<>();	
		
		try {
			Scanner sc = new Scanner(new File("data\\exam02.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] Arr = str.split(",");
				StudentVO student = new StudentVO(Arr[0],Integer.parseInt(Arr[1]));
				list.add(student);
			}
			System.out.println("총 "+list.size()+"명");
			System.out.println("---------------");
			System.out.println("이름\t점수");
			System.out.println("---------------");
			int max = -1;
			int j = 0;
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i).name+"\t"+list.get(i).scr);
				if(list.get(i).scr<max){
					continue;
				}
				max=list.get(i).scr;
				j=i;
			}
			System.out.println("---------------");
			System.out.println("1등 : "+list.get(j).name);
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
