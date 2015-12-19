package kr.co.mlec.day10.testa;

import kr.co.mlec.day10.testb.*;

/*
 * public은 어디에서나 가져다쓸수 있지만 위에 import로 패키지 위치를 적어줘야한다
 * default는 동일 패키지 내에서만 접근할수 있고 변수도 마찬가지이다
 */

public class AccessTest {
	public static void main(String[] args) {
	StringUtil su = new StringUtil();
	su.data = "테스트입니다";
	}
}
