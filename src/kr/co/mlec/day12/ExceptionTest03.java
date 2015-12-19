package kr.co.mlec.day12;

import java.io.FileReader;

public class ExceptionTest03 {

	public static void main(String[] args) {
		try{
			System.out.println(1);
			FileReader fr = new FileReader("data/member.txt");
			System.out.println(2);
			return; // 메소드를 중단시킨다
		}
		catch(Exception e){
			System.out.println(3);
		}
		// 외부자원(하드디스크 파일, 데이터베이스 연동, 네트워크 연동)에 대한 정리 작업을 진행시 주로 사용
		// 외부자원 정리(닫기 작업)
		finally{
			System.out.println(4); // finally가 있으면 return보다 중요하게 생각하고 꼭 처리하고 종료
		}
		System.out.println(5); // 나머지 부분은 return이 있으면 실행하지 않는다
		}
	
}
// 연관성이 있는 코드는 모두 try로 묶어준다 특별한 경우만 try로 묶기보다는 연관있는 코드는 같이 try문
// 안에 넣어준다(ex: for문)