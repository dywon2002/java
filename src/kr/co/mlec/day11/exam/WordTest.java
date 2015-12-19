package kr.co.mlec.day11.exam;

import java.io.File;
import java.util.Scanner;

class Words{
	String a=null;
	int c=0;
}

public class WordTest {

	public static void main(String[] args) throws Exception {

		
		Scanner sc = new Scanner(new File("data/word.txt"));
		while(sc.hasNextLine()){
		String s = sc.nextLine();
		System.out.println(s);
		}
		
		
//		Scanner sc = new Scanner(new File("data/word.txt"));
//		int cnt = 0;
//		int check = 0;
//		while (sc.hasNext()) {
//			String line = sc.next();
//			cnt++;
//		}
//		Words w = new Words();
//
//		String [] line = new String [1000];
//		
//		sc = new Scanner(new File("data/word.txt"));
//
//				for(int i = 0; i<cnt;i++){
//			line[i] = sc.next();
//			if(line[i].contains(".")==true){
//				line[i]=line[i].replace(".", "");
//			}
//			else if(line[i].contains(",")==true){
//				line[i]=line[i].replace(",","");
//			}
//			else if(line[i].contains(":")==true){
//				line[i]=line[i].replace(":","");
//			}
//		}
		

		
//        for(int i = 0; i < line.length; i++) {
//            
//            for(int j = i+1; j < line.length; j++) {
//                
//                if(line[i].compareTo(line[j]) > 0 ) {
//                    String temp = line[i];
//                    line[i] = line[j];
//                    line[j] = temp;
//                }
//            }
//            if ( i>0 && line[i].equals(line[i-1])){
//            // 만약 line 배열의 index가 0보다 크고 현재index의 스트링과
//            // 그전index의 스트링이 동일하다면 카운트추가.
//            // index가 0일경우부터 따진다면 outofboundexception 나옵니다.
//
//                count++;
//                
//            }else if(i!=0){
//            // 만약 그전의 index와 같지않고 현재의 index가 0이 아니라면
//            // 지금까지 누적한 카운트(단어의 갯수) 를 출력하고 초기화
//                System.out.println(line[i-1] + " " + count);
//                count = 1;
//            }
//            
//            if (i == line.length - 1){
//                // 만약 지금이 배열의 마지막 index라면 현재 단어의 갯수 출력.
//                    System.out.println(line[i] + " " + count);
//                }
		

	}
}





