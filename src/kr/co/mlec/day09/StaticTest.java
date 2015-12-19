package kr.co.mlec.day09;

class Member {
	String id;
	String password;
	static int count;

	// 클래스 정보 로딩시 호출되는 static 블록을 선언한다.
	static {
		System.out.println("Memeber 클래스 정보가 Method Area 영역에 로딩됨");
	}

	Member() {
		System.out.println("생성자 호출됨");
	}
}

public class StaticTest {
	public static void main(String[] args) {
		System.out.println("메인 메서드 실행 시작");
		Member m;
		System.out.println("Member 클래스를 사용");

		m = new Member();
		Member m2 = new Member();

		// 잘못된 접근
		// m.count = 1; --> Member.count = 1;
		// m2.count = 2;

		System.out.println("count : " + Member.count);
		System.out.println("메인 메서드 실행 종료");

	}
}
