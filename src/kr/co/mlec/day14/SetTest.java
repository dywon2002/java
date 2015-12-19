package kr.co.mlec.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		// 인덱스 값이 없다, 중복이 되지 않는다
		HashSet<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println("크기 : "+set.size());
		// set은 위치 관리하지 않기 때문에 index 접근이 불가능
		set.remove("b");

		// 중복허용을 하지 않기 때문에 d요소는 추가되지 않는다
		set.add("d");
		set.add("e");
		System.out.println("크기 : "+set.size());
		
		boolean result = set.isEmpty();
		System.out.println(result?"요소 비어있음":"요소가 존재함");
		
		set.clear();
		System.out.println("전체 삭제 후 크기 "+set.size());
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		// 요소 출력 방법 
		for(String s : set){
			System.out.println(s);
		}
		// ======================================
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			String s = ite.next();
			System.out.println(s);
		}
		
		// Set 요소를 배열로 얻기
		Object [] oArr = set.toArray();
		System.out.println(Arrays.toString(oArr));
		// 형변환을 해줘야한다
		/*
		for(Object obj : oArr){
			String s = (String)obj;
			System.out.println(s);
		}*/
		// sArr 배열에 set의 내용이 들어감
		String[] sArr = new String[set.size()];
		set.toArray(sArr);
		// rArr 배열에 set의 내용이 들어감
		String[] rArr = set.toArray(new String[set.size()]);
		for(String s : rArr){
			System.out.println(s);
		}
	
	}
}