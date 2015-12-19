package kr.co.mlec.day14.exam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student77 {
	private String name;
	private String cityName;
	private String phoneNo;
	public Student77(String name, String cityName, String phoneNo) {
		this.name = name;
		this.cityName = cityName;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public String getCityName() {
		return cityName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
}


public class Exam03 {

	public static void main(String[] args) {
		List<Student77> list = new ArrayList<>();
		
		try{
		Scanner sc = new Scanner(new File("data/exam03.txt"));
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String [] stuInfo = line.split(":");
			Student77 stu = new Student77(stuInfo[0],stuInfo[1],stuInfo[2]);
			list.add(stu);
		}

		for(Student77 s : list){
			if(s.getName().contains("¿µ")){
				System.out.println(s.getName()+"\t");
				System.out.println(s.getCityName()+"\t");
				System.out.println(s.getPhoneNo()+"\t");
			}
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
