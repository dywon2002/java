package kr.co.mlec.day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
public static void main(String[] args) {
	Calendar c = Calendar.getInstance();
	
	// 현재시간 : 2015-12-02 12:03
	
	
	
//	System.out.println("현재시간 : "
//			+c.get(Calendar.YEAR)+"-"+		
//			+(c.get(Calendar.MONTH)+1)+"-"+
//			+c.get(Calendar.DATE)+" "
//			+c.get(Calendar.HOUR_OF_DAY)+":"
//			+c.get(Calendar.MINUTE)
//			);
	
	// 하는일 : 날짜 정보를 지정된 패턴에 맞는 문자열로 변환
	// 누구를(날짜), 어떻게 바꿀지(패턴)
	// y : 년도 
	// M : 월
	// d : 일
	// H : 24시간
	// h : 12시간
	// m : 분
	// s : 초
	// 현재시간 : 2015-12-02 12:03 -> yyyy-MM-dd HH:mm
	// 현재시간 : 2015년 12월 2일 12시 3분 -> yyyy년 MM월 dd일 HH시 mm분
	
	// SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String str = sdf.format(c.getTime());
	System.out.println(str);
	
}
}
