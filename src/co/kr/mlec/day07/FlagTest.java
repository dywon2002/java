package co.kr.mlec.day07;



public class FlagTest {

	public static void main(String[] args) {
		
		int [] arr = {4, 9, 1, 6};
		
		int cnt=0;
		  
		for(int i = 0; i<arr.length; i++){
			// 요소가 짝수일 경우 반복 벗어나기
			if(arr[i]%2==0){
				cnt++;
			}
		}
		if(cnt==0){
			System.out.println("배열의 모든 요소가 홀수 입니다.");
		}
		else {
			System.out.println("배열에 짝수가 "+cnt+"개 있습니다.");
		}
		 /* int [] arr = {4, 9, 1, 6};
		
		boolean flag = true;
		
		
		for(int i = 0; i<arr.length; i++){
			// 요소가 짝수일 경우 반복 벗어나기
			if(arr[i]%2==0){
				flag = false;
				break;
			}
		}
		if(flag=true){
			System.out.println("배열의 모든 요소가 홀수 입니다.");
		}
		else {
			System.out.println("배열의 모든 요소는 홀수가 아닙니다.");
		}
		*/
		
	}

}
