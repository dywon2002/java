package co.kr.mlec.day06.exam;

import java.util.Scanner;

class Student{
String name;
int age;
int isMajor;
int gender;
}

public class Exam02 {
	

	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("학생 정보를 입력하세요");
	int cnt = 0;
	
	Student [] list = new Student [20];

	while(true){
	Student s3 = new Student();
	
	System.out.print("이름 : ");
	s3.name = sc.next();
	System.out.print("나이 : ");
	s3.age = sc.nextInt();
	System.out.print("전공(1.전공, 2.비전공) : ");
	s3.isMajor = sc.nextInt();
	System.out.print("성별(1.남자, 2.여자) : ");
	s3.gender = sc.nextInt();
	
	list[cnt++] = s3;
	
	System.out.print("계속 하시겠습니까? (Y.계속, N.종료): ");
	if(sc.next().equals("N")){
	break;
		}
	}
	
	System.out.println("총 학생수는 "+cnt+"명 입니다.");
	for(int i=0;i<cnt;i++){
	Student s = list[i];
	System.out.println(s.name+"\t"+s.age+"\t"+(s.isMajor==1?"전공":"비전공")+"\t"+(s.gender==1?"남자":"여자"));
}
}


	}



