/*
 * Date 자바가 처음 나왔을때부터 있던 기능
 * Calendar jdk 1.2버전부터 사용 가능
 * SimpleDateFormat 
 */


package kr.co.mlec.day13;

import java.util.Date;
public class DateTest {
	public static void main(String[] args) {
//		Date d = new Date(215,10,11); // 오류는 아니지만 이클립스에서 권장하지 않음
		// 현재 시간 정보 가져오기
		Date d = new Date();
		System.out.println(d);
		// 시간을 설정 : 1970.01.01 00:00:00 GMT
		Date d2 = new Date(1000);
		System.out.println(d2);

		// 현재 시간을 밀리세컨드 단위로 반환 : 1970년 기준으로 이후 시간을 반환
		long time = System.currentTimeMillis();
		System.out.println("time :"+time);
		Date d3 = new Date(time);
		System.out.println(d3);
		
		Date d4 = new Date();
		// 시간 정보를 long 값으로 반환 : 1970년 기준 , 새롭게 만드는것
		time = d4.getTime();
		System.out.println("getTime :"+time);
		
		// time 값에 해당하는 날짜로 설정, 기존에 있던것을 바꾼다
		d4.setTime(time);
		System.out.println("setTime :"+d4);
		
	}
	
}
