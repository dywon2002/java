package exam.lotto;

import java.util.HashSet;
import java.util.Random;

public class LottoService {
	
	public int[] getLottoNumbers(){
		// 1-45 ������ ��ȣ�� �غ�
		Random r = new Random();
		HashSet<Integer> numbers = new HashSet<>();
		while(numbers.size() < 6){
			numbers.add(r.nextInt(45)+1);
		}
		
		// Set�� �����͸� �迭�� �ű��
		int [] nums = new int[6];
		int index = 0;
		for(Integer val : numbers){
			nums[index++] = val;
		}
		
		// numbers�� ����� ������ �迭�� ����
		
		
		return nums;
		
		
	}
		/* ��� 4
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =0;i<45;i++){
			numbers.add(i+1);
		}
		
		// ���� ���δ�
		Collections.shuffle(numbers);
		int [] lottoNums = new int[6];
		for(int i=0;i<lottoNums.length;i++){
			lottoNums[i] = numbers.get(i);
		}
		
		return lottoNums;
		*/
		
		/*��� 3
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
	
	
//  ��� 2	
//	public int[] getLottoNumbers(){
//		// 1-45 ������ ��ȣ�� �غ�
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
//			// seq�� num �迭�� �ִ� ���� ����
//			int seq = r.nextInt(MAX_NUMBER-i);
//			// ����(��) �迭���� �ϳ��� ����(��)�� ������ ��÷ �迭�� �־��ش�
//			numbers[i] = nums[seq];
//			// seq �ڸ��� ������ ���� ��Ұ��� �ִ´�
//			nums[seq] = nums[MAX_NUMBER-i-1];
//		}
//		
//		return numbers;
//		
//	}
	
	
	
	
	
	/* ��� 1
	public int[] getLottoNumbers(){
		int [] numbers = new int[6];
		
		Random r = new Random();
		outer :
		for(int i = 0;i<numbers.length;i++){
		int num = r.nextInt(45)+1;
		// �ߺ� üũ
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
