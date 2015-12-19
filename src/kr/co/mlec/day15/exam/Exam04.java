package kr.co.mlec.day15.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam04 {
	
	private static String showInfoByCity(String city) throws FileNotFoundException{
		
		String totalResult = "";
		
			int cnt = 0;
			String result = "";
			Scanner sc = new Scanner(new File("data/person.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(":");
				if(arr[1].contains(city)){
					result = result+"이름 : "+arr[0]+", 거주지 : "+arr[1]+"\n";
					cnt++;
				}
		}
			totalResult = city+" 검색된 결과 : "+cnt+"명\n"+result;
			System.out.print(totalResult);
			return totalResult;
	}
	private static String showInfoByName(String name) throws FileNotFoundException{
		
		String totalResult = "";
		
			int cnt = 0;
			String result = "";
			Scanner sc = new Scanner(new File("data/person.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(":");
				if(arr[0].startsWith(name)){
					result = result+"이름 : "+arr[0]+", 거주지 : "+arr[1]+"\n";
					cnt++;
				}
		}
			totalResult = name+"로 시작하는 사람 : "+cnt+"명\n"+result;
			System.out.print(totalResult);
			return totalResult;
	}
		
	
	public static void main(String[] args) throws IOException {

		
		String result = "";
		while(true){
			
			FileWriter fw = new FileWriter("data/searchResult.txt");
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("항목을 선택하세요(1.지역명 2.이름 3.종료)");
			
			int i = sc.nextInt();
			switch(i){
			case 1:
				System.out.print("지역명을 입력하세요:");
				String city = sc.next();
				result = result + showInfoByCity(city);
				break;
			case 2:
				System.out.print("이름을 입력하세요:");
				String name = sc.next();
				result = result + showInfoByName(name);
				break;
			case 3:
				System.out.print("검색된 결과를 저장 후 종료하시겠습니까?(Y/N) ");
				String s = sc.next();
				if(s.equals("Y")){
					fw.write(result);
					fw.close();
					System.out.println("검색 결과가 저장되었습니다");
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}else if(s.equals("N")){
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
					break;
				}
				else{
					System.out.println("항목을 다시 선택하세요");
					continue;
				}
			default:
				System.out.println("항목을 다시 선택하세요");
				break;
				
			}
		}
		
		
	}

}
