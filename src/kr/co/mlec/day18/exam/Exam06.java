package kr.co.mlec.day18.exam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class WordsGenerator extends Thread{
	private ArrayList<String> words;
	private String [] dic = {"성시경","한가인","유재석","미나","초아",
			"오연수","박서준","소진","류준열","아이유","장동건","원빈","하니",
			"장기하","손지창","고준희","한지민","김태희","유아인","혜리","배수지","싸이",
			"안젤리나졸리","브래드피트","이브라히모비치"
			};
	
	
	public WordsGenerator(ArrayList<String> words){
		this.words = words;
	}
	
	// 2초마다 데이터를 입력
	public void run(
			){
		Random r = new Random();
		for(int i = 1;i<=100;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			words.add(dic[r.nextInt(dic.length)]);
		}
	}
}


class TajaGame{
	ArrayList<String> words = new ArrayList<>();
	
	public void execute(){
		// 초기 데이터 입력
		words.add("강동원");
		
		WordsGenerator wg = new WordsGenerator(words);
		wg.start();
		Scanner sc = new Scanner(System.in);
		while(true){
			// words.toString() : [리스트 데이터, ...]
			System.out.println(words);
			System.out.print(">>");
			// 탭 또는 스페이스바를 이용한 입력을 처리하기 위해
			
			String input = sc.nextLine().trim();
			int index = words.indexOf(input);
			if(index==-1) continue;
			//단어 제거
			words.remove(index);
		}
	}
}


public class Exam06 {
	public static void main(String[] args) {

		TajaGame tg = new TajaGame();
		tg.execute();
		
	}
}
