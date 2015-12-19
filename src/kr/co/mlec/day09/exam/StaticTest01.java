package kr.co.mlec.day09.exam;

class Member {
	String id;
	String password;
	static int count;
	
	// 클래스 정보 로딩시 호출되는 static 블럭을 선언
	static {
		System.out.println("Member 클래스 정보가 Method Area 영역에 로딩되었습니다");
	}
	
	Member(){
		System.out.println("생성자 호출되었습니다");
	}
	
}

public class StaticTest01 {

	public static void main(String[] args) {
		System.out.println("메인 메서드 실행 시작");
		Member m;
		System.out.println("Member 클래스를 사용");
		// static 블럭은 한번만 실행된다
		m = new Member();
		Member m2 = new Member();
		// m, m2의 객체에 접근했다가 MethodArea의 count 값을 변환시킨다
		// static으로 생성된 변수는 클래스 정보로 접근하는것이 옳다 고로 이 방식은 잘못된 접근
		// 올바른 표현은 Member.count = 1;
		m.count = 1;
		m2.count = 2;
		
		System.out.println("count : "+Member.count);
		System.out.println("메인 메서드 실행 종료");
	}
}
