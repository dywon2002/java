package kr.co.mlec.day10.testa;

import kr.co.mlec.day10.testb.*;

public class ExtendsClass extends StringUtil{
	public void test(){
		
		// 외부 패키지에서 관계없이(상속) 접근 가능한 것은 public
		// 위치에 상관없이 상속관계 클래스에 접근 허용 protected
		// 무조건 같은 패키지만 접근 허용 default
		// 무조건 나만 직접 접근 허용 private
		
		// API에서 만든 클래스와 멤버변수, 메소드는 모두 public이다
		// 클래스 이름으로 바로 접근하는 것은 static
		System.out.println(data);
//		System.out.println(magicNumber); // 접근 불가
//		System.out.println(name); // 접근 불가
		System.out.println(exStr);
	}
}
