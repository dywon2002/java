/*
 * 문제점
 * 1. 내가 원하는 타입만 담게 만들 수 없다
 * 	- 요소를 담는 부분을 Object 배열을 활용했기 때문에 여러개의 데이터 타입을 담을 수 있다
 * 2. 코딩이 형변환을 해야하기 때문에 지저분해진다
 * 
 * 위의 문제점을 해결하기 위해서 JDK1.5 버전부터 제너릭(Generic) 문법 제공
 * 형식 : 클래스명<타입(파라미터)>
 */
package kr.co.mlec.day14;

public class MyGenericTest {

	public static void main(String[] args) {
		// JDK 1.7 Generic <> 표현 가능해짐
		MyGenericList<String> list = new MyGenericList<>(5);
		
		list.add("1"); // String 타입만 받을 수 있다
		
		String s = list.get(0); // 형변환 필요 없이 바로 받을 수 있다
		
		
		/* Generic 사용 전
		MyGenericList list = new MyGenericList(5);
		list.add("a");
		list.add(100);
	
		// SearchUI
		for (int i =0;i<list.size();i++){
			String data = (String)list.get(i);
			System.out.println(i+"번째 요소 : "+data);
		}
		*/
	}
	
}
