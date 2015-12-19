package kr.co.mlec.day17;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		try{
			searchEmployeeInfo("data/employee.txt","김");
			searchEmployeeInfo("data/employee.txt","다");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception{
		List<saVO> list = new ArrayList<>();
		
		Scanner sc = new Scanner(new File(readFileName));
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String [] sInfo = line.split(":");
			int i=Integer.parseInt(sInfo[1]);
			int j=Integer.parseInt(sInfo[3]);
			saVO stu = new saVO(sInfo[0],i,sInfo[2],j);
			list.add(stu);
		}
		int cnt = 0;
		System.out.println("==============================================");
		for(saVO s : list){
			if(s.getName().startsWith(lastName)){
				System.out.print("이름 : "+s.getName()+"\t");
				System.out.print("나이 : "+s.getAge()+"\t");
				System.out.print("부서 : "+s.getDep()+"\t");
				System.out.println("월급 : "+s.getSal());
				cnt++;
			}
		}
		System.out.println("==============================================");
		System.out.println(lastName+"씨성을 가진 회원은 총 "+cnt+"명입니다.");
		System.out.println("==============================================");
		System.out.println();
	}
}
class saVO{
	String name;
	int age;
	String dep;
	int sal;
	public saVO() {
	}
	public saVO(String name, int age, String dep, int sal) {
		this.name = name;
		this.age = age;
		this.dep = dep;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}