/*
* 출력형식 > 
* 도메인 주소를 입력하세요 : http://www.naver.com
* 도메인 주소는 www로 시작해야 합니다.
* 
* 도메인 주소를 입력하세요 : www.naver.com
* www.naver.com 에서 사용하는 주소정보
* ---------------------------------------
* 220.189.20.111 
* 220.189.20.64 
* ---------------------------------------
* 
* 도메인 주소를 입력하세요 : www.aidfjeijf.com
* 존재하지 않는 도메인 주소 입니다.
* 
* 도메인 주소를 입력하세요 : quit
* 프로그램을 종료합니다.
* 
* 도메인 주소가 없을 경우 예외 발생
*/

package kr.co.mlec.day19.exam;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exam01 {
public static void main(String[] args) {
	while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("도메인 주소를 입력하세요.");
		String s = sc.nextLine();
		if(s.startsWith("www")){
	InetAddress[] addrs;
	try {
		addrs = InetAddress.getAllByName(s);
		System.out.println(s+"에서 사용하는 주소 정보");
		System.out.println("---------------");
		for(InetAddress addr : addrs){
			System.out.println(addr.getHostAddress());
	}
		System.out.println("---------------");
	}catch (UnknownHostException e) {
		System.out.println("존재하지 않는 도메인 주소입니다.");
	}}
		else if(s.equalsIgnoreCase("quit")){
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		else{
			System.out.println("도메인 주소는 www로 시작해야 합니다.");
		}
	
	}
}
}
