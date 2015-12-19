package kr.co.mlec.day13.exam;

import java.util.Calendar;

public class Test01Answer {
	public static void main(String[] args) {
	
		Calendar c = Calendar.getInstance();
		
	System.out.printf("%d년 %2d월\n",c.get(Calendar.YEAR),c.get(Calendar.MONTH)+1); // 중간에 숫자는 자리수
	System.out.println("일\t월\t화\t수\t목\t금\t토");	
	
	
	// 마지막 날짜
	int lastDate = c.getActualMaximum(Calendar.DATE);
	// 현재 월의 1일로 설정한 다음 요일을 추출
	c.set(Calendar.DATE, 1);
	int day = c.get(Calendar.DAY_OF_WEEK);
	int nlCnt=0;
	for(int i=1;i<day;i++){
		System.out.print("\t");
		nlCnt++;
	}
	
	for(int i=1;i<=lastDate;i++){
		System.out.print(i+((++nlCnt%7==0)?"\n":"\t"));
	}
	}
}
