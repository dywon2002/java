package exam.lotto;

import java.util.HashSet;
import java.util.Random;

public class LottoService {
	
	public int[] getLottoNumbers(){
		// 1-45 사이의 번호를 준비
		Random r = new Random();
		HashSet<Integer> numbers = new HashSet<>();
		while(numbers.size() < 6){
			numbers.add(r.nextInt(45)+1);
		}
		
		// Set의 데이터를 배열에 옮기기
		int [] nums = new int[6];
		int index = 0;
		for(Integer val : numbers){
			nums[index++] = val;
		}
		
		// numbers의 요소의 내용을 배열로 추출
		
		
		return nums;
		
		
	}
		/* 방법 4
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =0;i<45;i++){
			numbers.add(i+1);
		}
		
		// 볼이 섞인다
		Collections.shuffle(numbers);
		int [] lottoNums = new int[6];
		for(int i=0;i<lottoNums.length;i++){
			lottoNums[i] = numbers.get(i);
		}
		
		return lottoNums;
		*/
		
		/*방법 3
		int [] nums = new int[45];
		
		for(int i = 0; i<nums.length;i++){
			nums[i] = i+1;
		}
		
		Random r = new Random();
		for(int i = 1;i<=2000;i++){
			int seq = r.nextInt(nums.length);
			// swap
			int temp = nums[0];
			nums[0] = nums[seq];
			nums[seq] = temp;
		}
		int []numbers = new int[6];
		for(int i =0;i<numbers.length;i++){
			numbers[i] = nums[i];
		}
		return numbers;
	}*/
	
	
//  방법 2	
//	public int[] getLottoNumbers(){
//		// 1-45 사이의 번호를 준비
//		int [] nums = new int[45];
//		
//		for(int i = 0; i<nums.length;i++){
//			nums[i] = i+1;
//		}
//		
//		int[] numbers = new int [6];
//		Random r = new Random();
//		
//		final int MAX_NUMBER = 45;
//		for(int i = 0;i<numbers.length;i++){
//			// seq는 num 배열에 있는 값을 꺼냄
//			int seq = r.nextInt(MAX_NUMBER-i);
//			// 숫자(공) 배열에서 하나의 숫자(공)을 꺼내서 추첨 배열에 넣어준다
//			numbers[i] = nums[seq];
//			// seq 자리에 마지막 숫자 요소값을 넣는다
//			nums[seq] = nums[MAX_NUMBER-i-1];
//		}
//		
//		return numbers;
//		
//	}
	
	
	
	
	
	/* 방법 1
	public int[] getLottoNumbers(){
		int [] numbers = new int[6];
		
		Random r = new Random();
		outer :
		for(int i = 0;i<numbers.length;i++){
		int num = r.nextInt(45)+1;
		// 중복 체크
		// ----------------------------
		for(int k=0;k<i;k++){
		if(num==numbers[k]){
			i--;
			continue outer;
		}
		// ----------------------------
		}
		
		numbers[i] = num;
		}
		
		return numbers;
		
	}*/
}
