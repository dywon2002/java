package co.kr.mlec.day06;

/*
 * for, while, do~while(거의 사용하지 않음)
 */

// for문은 반복이 몇번 되는지 정해져있을때 편리하고 while은 언제 끝날지 모를때 편리하다

public class LoopTest {
	public static void main(String [] args){
		
		int i = 0;
		for( ; i<10 ; i++){ //int i = 0 변수는 이 for문 안에서만 쓰인다
			
		}
		System.out.println(i); // for문을 빠져나올수 없으므로 무한loop
		
		i = 0;
		for( ; i<10 ; i++){
			System.out.println(i);
		}
		
		int k = 0;
		while(k<10){
			System.out.println(k);
			k++;
		}
		
		k = 0;
		while(k<10){
			System.out.println(k);
			k++;
		}
		
	}
}
