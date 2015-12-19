/*
 * Calendar
 * - 추상클래스
 * - 객체 생성이 불가능하다
 * - Calendar.getInstance();
 */


package kr.co.mlec.day13;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		
		
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance(); // 다른 자식 클래스를 생성해서 준다
	
		/*
		System.out.println(c);
		
		//정보를 추출 : get(int field)
		int year = c.get(Calendar.YEAR);   // c.get(1);
		int month = 1+c.get(Calendar.MONTH); // c.get(2);
		
		int date = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일)~7(토)
		
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(date);
//		System.out.println(hour);
//		System.out.println(min);
//		System.out.println(sec);
//		System.out.println(day);
		
//		Calendar를 객체를 Date로 추출할 때 사용
		Date d = c.getTime();
		System.out.println(d);
		
//		1970년 기준으로 반환
		long time = c.getTimeInMillis();
		Date d2 = new Date(time);
		System.out.println(d2);
		
		*/
		
//		Calendar 객체의 날짜 및 시간 정보 변경
		// 월정보 설정 시 : 1월(0) ~ 12월(11)
//		c.set(2015,1,1); // 2월로 들어간다
//		System.out.println((c.get(Calendar.MONTH)+1));
		
//		현재 월의 1일이 무슨 요일인지 화면에 출력
		/*
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		c.set(year, month, 1); // 현재 월의 1일로 설정
		
		// 특정 부분을 변경하기 위해 set(int field, int value)
		c.set(Calendar.DATE, 1);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		String [] days = {"", "일","월","화","수","목","금","토"};
		System.out.println(days[day]+"요일");
		
		
		c.set(2015, 0,1);;
		int lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);

		c.set(2015, 1,1);;
		lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
		c.set(2015, 2,1);;
		lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		*/
		
		
		
	}
}
