package kr.co.mlec.day10;

class Member {
	private String id;
	private int age;
	
	// 클래스 = 변수 + 메서드, 변수 변경이 불가능하면 메서드로 해결해야한다
	// 값을 설정하는 메서드 : setter , 메서드 이름이 set으로 시작
	// set필드명
	// 낙타처럼 소문자로 가다가 변수를 만나면 대문자로 표기 (camel 표기법)
	// 코딩할때 접근제한자는 다 닫아놓고 하나씩 열어주는 것이 좋다
	
	public void setId(String id){
		this.id = id;
	}
	public void setAge(int age){
		this.age = age;
	}
	// 값을 추출하는 메서드 : getter , 메서드 이름이 get으로 시작
	public String getId(){
		return id;
	}
	public int getAge(){
		return age;
	}
	
	
	Member(){}
	
	Member(String id, int age){
		this.id = id;
		if(age<1){
			System.out.println("잘못된 나이값을 입력하셨습니다");
			System.out.println("나이는 1살부터 가능합니다");
		} else {
		this.age = age;
		}
	}
}

public class PrivateTest {
	public static void main(String[] args) {
		Member m = new Member("hong",-15);
	}
}
