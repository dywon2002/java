package kr.co.mlec.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginCheck {
	// member.txt 파일의 내용을 읽어서 
	// 매개변수로 넘어온 login 객체의 아이디와 패스워드 값과
	// 동일한 회원정보가 있는지 판단한다
	// 동일한 회원 정보가 있으면 true, 없으면 false
	public static boolean check(LoginVO login) throws FileNotFoundException{
		
			
			Scanner sc = new Scanner(new File("src/kr/co/mlec/day20/member.txt"));

			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(":");
				if(login.getId().equals(arr[0])&&
						login.getPass().equals(arr[1])){
					return true;
				}
			}
			
			
			
		
		return false;
	}
}
