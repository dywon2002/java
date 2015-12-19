package co.kr.mlec.day06;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int [] arr = new int[3];  // 배열도 기본형이 아닌 참조형이므로 new를 붙여준다
								   // 배열은 만들때 크기를 항상 정해줘야한다
						           // [] 수는 차원수 [] 1차원 [] [] 2차원 [] [] [] 3차원
		// 기본값 정수 0 실수 0.0
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]); // 0이 된것을 확인할수 있다
//		
		String [] sArr = new String[3];

		
		// 단순하게 배열의 처음부터 마지막까지 값을 확인
//		for(int i=0;i<sArr.length;i++){
//			System.out.println(sArr[i]);
//		}
//		
		// 1.5부터 제공되는 향상된 for
		sArr[0]="java";
		sArr[1]="is";
		sArr[2]="easy";
		for(String temp:sArr){	// 앞에는 뒤의 배열의 데이터타입과 변수명 선언, 뒤는 배열의 크기만큼 돈다
			System.out.println(temp);
		}		
		
		char [] cArr = new char[5];
		// 기본값 공백
		
		boolean [] bArr = new boolean[2];
		// 기본값 false
	
		char[] cArr1 = new char[3];
		cArr1[0]='j';
		cArr1[1]='a';
		cArr1[2]='v';
		
		for(char temp:cArr1){
			System.out.println(temp);
		}
		
		// 배열의 내용만을 확인할 경우 괄호의 요소 내용을 문자열로 넘겨준다
		String str = Arrays.toString(sArr); 
		System.out.println("sArr의 문자열 : "+str);
		
//		System.out.println(Arrays.toString(sArr)); // 변수가 한번만 사용된다면 변수 선언은 낭비이므로
												   // 바로 집어 넣는것을 권장함
	
		int [] arr2 = new int[2];
		arr2[0] = 10;
		arr2[1] = 20;
		
		
		int [] arr3 = {10, 20}; // 선언과 동시에 초기화, 제일 편한 방법, 데이터 선언할때만 가능
		// arr3 = {30, 40}; 이렇게 변경은 불가능하다
		
		// 메서드의 매개변수로 넘길 경우 자주 사용(??)
		int [] arr4 = new int[]{10,20}; // 또 다른 방법
		arr4 = new int[]{30, 40}; //선언 이후에도 접근 해서 변경 가능하다
		
		// 배열 복사
		int [] src = {10, 20, 30, 40, 50};
		
		int [] dest = new int[src.length];
		
		// src 배열의 내용이 dest 배열로 복사, 정말 많이 쓰는 함수
		System.arraycopy(src, 1, dest, 0, 4);
		
		
		// 복사된 결과 배열 출력, Arrays.toString(배열명) 자주 많이 쓰는 함수
		System.out.println(Arrays.toString(dest));
		
	}

}