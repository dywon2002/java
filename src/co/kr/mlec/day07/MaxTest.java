/*
 * 최대값 찾기
 */

package co.kr.mlec.day07;

public class MaxTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int [] arr = {4, 1, 8, 9, 100, -3, -76, 49};
		int max=0;
		max = arr[0];
		int min = arr[0];
		// 배열의 첫번째 값을 max에 집어넣고 반복문은 배열의 두번째 값부터 첫번째 값과 비교한다
		for (int i = 1 ; i<arr.length; i++){
			if(max<arr[i]){
			 max=arr[i];
			}	
			if(min>arr[i]){
				 min=arr[i];
				}	
		}
		
		System.out.println("최대값은 "+max+" 최소값은 "+min);

	}

}
