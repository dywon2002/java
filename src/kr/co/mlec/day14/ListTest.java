package kr.co.mlec.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest {
	public static void main(String [] args){
//		LinkedList<String> list = new LinkedList<>(); // 삭제는 빠르지만 검색은 느리다
		ArrayList<String> list = new ArrayList<>(); // 검색이 빠르지만 삭제는 느리다
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.remove("b");
		System.out.println(list); // list.toString()
		
		
		System.out.println("리스트의 모든 요소 삭제");
		list.clear();
		System.out.println(list.size());
		
		boolean result = list.isEmpty();
		System.out.println(result?"비어있음":"요소있음");
		
		if(list.contains("c")){
			System.out.println("C 요소 포함");
		}
		
		else {
			System.out.println("C 요소 없음");
		}
		
		// 요소 위치 찾기, 리스트에서 b라는 문자열은 몇번째 위치에 있습니까? 못찾으면 -1 반환 
//		int index = list.indexOf("b"); 
		int index = list.indexOf("e");
		System.out.println("e 요소의 위치 : "+index);
		
		// 리스트의 요소 출력
		// Iterator 순환자 활용 처음부터 끝까지 요소 순환
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()){
			String data = ite.next();
			System.out.println("ite -> "+data);
		}
		
		// 1.5부터
		for(String s : list ){
			System.out.println(s);
		}
		
		
		// 1.4까지
		for(int i = 0;i<list.size();i++){
			String data = list.get(i);
			System.out.println(data);
		}
		
		
		
		/*
		for(int i=0;i<list.size();i++){
			String data = list.get(i);
			System.out.println(data);
		}
		
		list.remove(1);
		for(int i=0;i<list.size();i++){
			String data = list.get(i);
			System.out.println(data);
		}
		*/
	}
}
