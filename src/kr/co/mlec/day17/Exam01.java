package kr.co.mlec.day17;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {
	
	public static void dataCheck(String file1, String file2) throws Exception{
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		Scanner sc1 = new Scanner(new File(file1));
		Scanner sc2 = new Scanner(new File(file2));
		
		while(sc1.hasNextLine()){
			String str = sc1.nextLine();
			list.add(str);
		}
		while(sc2.hasNextLine()){
			String str = sc2.nextLine();
			list2.add(str);
		}
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list2.size();j++){
				if(i==j){
					if(list.get(i).equalsIgnoreCase(list2.get(j))){
						System.out.println("LINE : "+(i+1)+" Equal");
					}else{
						System.out.println("LINE : "+(i+1)+" Not Equal");
					}
					
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {
	try{
		dataCheck("data/data1.txt","data/data2.txt");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}
