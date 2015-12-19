/*
 * 사용자 정의 타입 구현
 * - class를 활용
 */

package co.kr.mlec.day06;

import java.util.Scanner;

// 클래스의 첫글자는 항상 대문자로 시작한다
class Student{
	String name;
	int age;
	// true : 전공, false : 비전공
	// boolean isMajor = true;
	int major; // 1:전공, 2:비전공
	// char majorYn; // 'Y':전공, 'N':비전공
	// 성별
	int gender; // 1:남자, 2:여자
}

public class ClassTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 입력되는 학생 정보를 담기 위해 배열을 선언
		// 단, 학생 입력정보는 최대 20명으로 설정함
		
		Student [] list = new Student[20];
		// 배열에 입력되는 위치 관리 변수 선언
		int loc = 0;
		
		System.out.println("학생 정보를 등록합니다. ");
		while(true){
			
			Student s2 = new Student();
			
			System.out.print("이름 : ");
			/* 변수가 한번만 사용된다면 변수를 선언하지 않고 처리한다
			 * String name = sc.next(); // 문자열을 받을때
			s2.name = name;
			*/
			s2.name = sc.next();
			
			System.out.print("나이 : ");
			s2.age = sc.nextInt();
			
			System.out.print("전공여부(1. 전공, 2. 비전공) : ");
			s2.major = sc.nextInt(); 
			
			System.out.print("성별(1. 남자, 2. 여자) : ");
			s2.gender = sc.nextInt();
			
			// 학생 정보가 입력이 된 후 배열에 추가
			
//			list[loc] = s2;
//			loc++;
			list[loc++] = s2;
			
			System.out.print("계속 입력(Y: 입력, N: 종료) : ");
			String isCon = sc.next();
			if(isCon.equals("N")){
				break;
			}	
		}
		 // loc: 실제 입력된 교육생의 카운트 수를 나타냄
		System.out.println("---------------------------");
		System.out.println("총 "+loc+"명");
        System.out.println("이름\t나이\t성별\t전공");
		System.out.println("---------------------------");
		for(int i = 0 ; i<loc ; i++){
			Student s = list[i];
			System.out.println(
					s.name+"\t"+s.age+"\t"+(s.gender==1?"남자":"여자")+"\t"+(s.major==1?"전공":"비전공"));
			
		}
		System.out.println("---------------------------");
				
	}

}

// 총 몇명 이름,나이,성별,전공