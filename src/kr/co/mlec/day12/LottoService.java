package kr.co.mlec.day12;

import java.util.Random;

public class LottoService {

	// 로또 번호(1-45)의 숫자를 생성한 후 반환한다
	public int[] getNumbers(){
		Random r = new Random();
		int [] numbers = new int[6];
		
		for(int i =0;i<numbers.length;i++){
			numbers[i]=r.nextInt(45);
		}
		
		return numbers;
		
	}
	/*
	 * 1.중복된 숫자가 있는지 체크해야함
	 * 2.숫자 중에 0이 들어가 있는지 체크함
	 */
	public boolean checkNumbers(int[] numbers)
			throws LottoZeroNumberException,LottoDupNumberException{
	
	
		for(int i = 0;i<numbers.length-1;i++){
			//배열에 입력된 요소가 0인 경우
			if(numbers[i]==0){
				throw new LottoZeroNumberException();
			}
			for(int j =i+1;j<numbers.length;j++){
				if(numbers[i]==numbers[j]){
					throw new LottoDupNumberException(numbers[i]);
				}
			}
		}
	
		//배열의 마지막 요소가 0인 경우
		if(numbers[numbers.length-1]==0){
			throw new LottoZeroNumberException();
			
		}
		return true;
	}
}
	
