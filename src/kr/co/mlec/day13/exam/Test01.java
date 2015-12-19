package kr.co.mlec.day13.exam;

import java.util.Calendar;

import java.util.Scanner;
public class Test01 {
public static void main(String[] args) {
	
	Calendar c = Calendar.getInstance(); // 다른 자식 클래스를 생성해서 준다
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH);

	while(true){
		
		c.set(Calendar.DATE, 1);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("\t\t"+year+"년 "+(month+1)+"월");
		int lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int count = 0;
		for(int i = 1;i<day;i++){
			System.out.print("\t");
			count++;
		}
		for(int i=1;i<=lastDate;i++){
			System.out.print(
                    i+((++count % 7==0? "\n":"\t")));
        }
		
	System.out.println("\n항목을 선택하세요(1.현재달보기 2.이전달보기 3.다음달보기 4.종료)");
	
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	switch(i){
	case 1:
		c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_WEEK);
	break;
	case 2:
		if(--month<0){
			--year;
			month=11;
		}
		c.set(year, month, 1);
		break;
	case 3:
		if(++month>11){
			++year;
			month=0;
		}
		c.set(year, month, 1);
		break;
	case 4:
		System.out.println("달력 프로그램을 종료합니다");
		System.exit(0);
	default:
		break;
		
	
}
}
}
}

