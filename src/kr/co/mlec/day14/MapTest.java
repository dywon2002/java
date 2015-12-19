package kr.co.mlec.day14;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class MapTest {
	
	private static HashMap<String, String> makeMap(){
		HashMap<String, String> temp = new HashMap<> ();
		
		Random r = new Random();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0;i<10;i++){
			char ch = alpha.charAt(r.nextInt(alpha.length()));
			temp.put(String.valueOf(ch), ch+""+i);
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		HashMap<String, String> map = makeMap();
		System.out.println(map);
				
		// 맵에 들어간 키값을 모를 경우 맵의 데이터를 추출하는 방법
		// 1. 맵의 키값을 모두 가져온다
		// 2. 키값의 크기만큼 반복돌면서 키에 해당하는 값을 추출
		
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.print("key : "+key+"\t");
			System.out.print("value : "+map.get(key)+"\n");
		}
		
		/*
		HashMap<String, String> map = new HashMap<> ();
		
		// map.put (K,V) : 데이터 입력
		map.put("name", "마크 주크버그");
		map.put("id", "mark");
		map.put("email", "mark@facebook.com");
		
		// map.get(K) : 데이터 추출
		String id = map.get("id");
		System.out.println("id : "+id);
		
		// 키의 중복을 허용하지 않는다, 중복된 키로 값이 입력되면 기존 값을 덮어쓴다
		map.put("name","빌");
		String name = map.get("name");
		System.out.println(name);
		
		*/
	}

}
