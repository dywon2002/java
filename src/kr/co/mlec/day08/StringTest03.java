package kr.co.mlec.day08;

import java.util.Arrays;

class MyUtil {
	void test() {
	};

	static void test2() {
	};
}

public class StringTest03 {

	public static void main(String[] args) throws Exception {

		String str = "Hello";
		str = "자바";

		// boolean bool = str.contains("ell");
		// System.out.println(bool);

		// 문자열의 내용을 바이트 배열로 변환
		byte[] arr = str.getBytes(); // 바이트 배열로 받을수 있다, 기본형은 EUC-KR
		System.out.println(Arrays.toString(arr));

		arr = str.getBytes("EUC-KR"); // 한글은 2바이트
		System.out.println(Arrays.toString(arr));

		arr = str.getBytes("UTF-8"); // 한글은 3바이트
		System.out.println(Arrays.toString(arr));

		// char charAt(int index) - String
		// MyUtil.test();

		// String s = 100+"";
		//
		// String s2 = String.valueOf(100);
		//
		//
		// MyUtil mu = new MyUtil();
		// mu.test();
		//
		// MyUtil.test2(); // 스태틱이 있으면 클래스 이름으로 직접 접근할 수 있다
		//
		// String str = "Hello Java";
		//
		// String name = "홍길동";
		// int age = 33;
		// String email = "hong@hong.com";
		//
		// System.out.println("이름 : "+name+", 나이 : "+age+", 이메일 : "+email);

		// format 문자
		// %s : 문자열
		// %c : 문자
		// %d : 정수
		// System.out.printf("이름 : %s , 나이 : %d , 이메일 : %s\n"
		// , name, age, email);
		//
		//
		// // 메서드 선언부에 static이 있다면 클래스이름.메서드명 접근
		// String result = String.format("이름 : %s , 나이 : %d , 이메일 : %s\n"
		// , name, age, email); // 클래스 이름으로 접근, 제약조건이 있는데 메소드에 static
		// //
		// System.out.println(result);

		// boolean flag = str.isEmpty(); // 문자열이 0이 맞는지 true false로 판단
		// System.out.println(flag?"비어있음":"내용있음");

		// str= " Hello Java ";
		// System.out.println(str.length());
		// System.out.println(str);
		//
		// // 문자열의 양쪽 공백을 제거(다른 언어에도 사용)
		// str = str.trim();
		//
		// str = str.replace(" ","");
		// System.out.println(str.length());
		// System.out.println(str);

		// String result = str.toUpperCase();
		// System.out.println(result);
		//
		// result = str.toLowerCase();
		// System.out.println(result);

		//
		// int index = str.indexOf("l"); // 인덱스의 번호
		// System.out.println(index);
		//
		// index = str.indexOf("l",index + 1); // 처음 찾은 글자의 인덱스 +1부터 찾아라
		// System.out.println(index);
		//
		// index = str.lastIndexOf("l"); // 뒤에서부터 검색
		// System.out.println(index);
		//
		// String result = str.substring(1,4);
		// System.out.println("str.substring(1,4) : "+result); // 끝에는 +1을 해줘야한다
		//
		// result = str.substring(1,str.length());
		// System.out.println("str.substring(1,str.length()) : "+result);
		//
		// result = str.substring(1); // 마지막까지 한번에 자를수 있다
		// System.out.println("str.substring(1) : "+result);
		//
		/*
		 * 화면에는 이렇게 보이도록 하세요 이름 : 홍길동 나이 : 33 이메일 : hong@hong.com
		 */

		String pInfo = "홍길동:33:hong@hong.com";

		// String [] pArr = pInfo.split(":"); // 배열로 넘겨준다
		// for (String data : pArr){ // 오른쪽 배열 끝까지 왼쪽 타입으로 넘겨준다
		// System.out.println(data);
		// }

		// result = str.replaceAll("[0-9]", ""); // 정규표현식 문법을 공부하기!!!
		// System.out.println(result);

		// int index = pInfo.indexOf("[0-9]");
		// System.out.println(index);

		// for(int i = 0; i<pInfo.length();i++){
		// int b = 0;
		// String s = "";
		// s+=pInfo.charAt(i);
		// System.out.print(s);
		// if(pInfo.charAt(i)==':'){
		// b = i;
		// for(int k=b+1;k<pInfo.length();k++){
		// s="";
		// s+=pInfo.charAt(i);
		// System.out.println(s);
		// }
		// }

		// String[] arr = {"", "", ""};
		// int loc = 0;
		// while (true) { int search = pInfo.indexOf(":", 0);
		// if (search == -1) {
		// break;
		// }
		// arr[loc++] = pInfo.substring(0, search);
		// pInfo = pInfo.substring(search + 1);
		// } arr[loc++] = pInfo;
		// System.out.println("이름 : " + arr[0]);
		// System.out.println("나이 : " + arr[1]);
		// System.out.println("이메일 : " + arr[2]);

		// String temp = "";
		// int count = 0;
		// for (int i = 0; i < pInfo.length(); i++) {
		// char ch = pInfo.charAt(i);
		// if (ch != ':') temp += ch;
		// else { String msg = "";
		// switch (count) {
		// case 0: msg += "이름 : " + temp;
		// break;
		// case 1: msg += "나이 : " + temp;
		// break;
		// }
		// System.out.println(msg);
		// temp = "";
		// count++;
		// }
		// }
		// System.out.println("이메일 : " + temp);

	}

	// char s = pInfo.charAt(1);
	// System.out.println(s);

	// str = "Hello";
	// if(str.equals("hello")){
	// }
	//
	// if (str.equalsIgnoreCase("hello")){ // 대소문자를 구별하지 않는다
	// System.out.println("equalsIgnoreCase : ");
	// }
	// String result = str.replaceAll("l", "k"); // replaceAll 같은 경우에는
	// // 첫번째 인자 정규표현식
	// // regular expression
	// // 문자열의 특별한 패턴을 걸어서(따로공부)
	// System.out.println("replaceAll : "+result);
	// result = str.replace("l", "k");
	// System.out.println("replace : "+result);
	//
	// str = "Hello 123 Java";
	//
	// result = str.replaceAll("[0-9]", ""); // 정규표현식 문법을 공부하기!!!
	// System.out.println(result);
	//
	// result = str.replaceAll("0","");
	// System.out.println("replaceAll : "+result);

	/*
	 * System.out.println(str);
	 * 
	 * char ch = str.charAt(1); System.out.println(ch);
	 * 
	 * //int length()
	 * 
	 * int len =str.length(); 
	 * System.out.println(str+"의 문자열 길이는 "+len+"입니다.");
	 * 
	 * // for (int i = str.length()-1; i>=0; i--){ //
	 * System.out.println(str.charAt(i)); // }
	 * 
	 * // avaJ olleH // for (int i = str.length()-1; i>=0; i--){ //
	 * System.out.print(str.charAt(i)); // }
	 * 
	 * // Hello Java -> Hello Jv //removeChar(str, 'l');
	 * 
	 * String result = removeChar2(str,'a'); System.out.println();
	 * System.out.println(result);
	 * 
	 * str.replace('l', 'k' ); // =으로 대입받지 않는 이상 str 자체는 안 바뀐다
	 * System.out.println(str);
	 * 
	 * str = str.replace('l', 'k' ); // =으로 대입받지 않는 이상 str 자체는 안 바뀐다
	 * System.out.println(str);
	 * 
	 * }
	 * 
	 * 
	 * static String removeChar2(String str, char ch){ String result = "";
	 * for(int i = 0;i<str.length();i++){ if(str.charAt(i)!=ch){
	 * result+=str.charAt(i); } } return result; }
	 * 
	 * 
	 * // static void removeChar(String str, char ch){ // for(int i =
	 * 0;i<str.length();i++){ // if(str.charAt(i)!=ch){ //
	 * System.out.print(str.charAt(i)); // } // } // }
	 * 
	 * 
	 * // 강사님 방식 // static void removeChar(String str, char ch){ // for(int i =
	 * 0;i<str.length();i++){ // char c = str.charAt(i); // if(c==ch) //
	 * continue; // System.out.print(str.charAt(i)); // } // }
	 */
}
