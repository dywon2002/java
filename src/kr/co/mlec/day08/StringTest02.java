package kr.co.mlec.day08;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// 생성자 : new 다음에만 올 수 있음
		// 클래스 이름과 동일하다

		String str = new String();
		System.out.println("str : " + str);
		byte[] bytes = { 97, 98, 99 }; // byte 배열 97은 아스키 코드값 a 98은 b 99는 c
		String str2 = new String(bytes);
		System.out.println("str2 : " + str2);

		try {
			String str3 = new String(bytes, "utf-8");
			System.out.println("str3 : " + str3);
		} catch (UnsupportedEncodingException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}

		// String(String another)
		String str4 = new String("abc");
		System.out.println("str4 : " + str4);

		// String(char [] cArr)
		// char [] cArr = {'a','b','c'};
		// String str5 = new String(cArr); // 문자열로 변환

		String str5 = new String(new char[] { 'a', 'b', 'c' });
		System.out.println("str5 : " + str5);

		// String(StringBuffer buffer)
		StringBuffer buffer = new StringBuffer("abc");
		// buffer.append("b");
		// buffer.append("c");
		String str6 = new String(buffer);
		System.out.println("str6 : " + str6);

		Random r = new Random();
		// String str7 = new String(r);
		// System.out.println("str7 :"+str7);

	}

}
