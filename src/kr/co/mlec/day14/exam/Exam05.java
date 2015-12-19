package kr.co.mlec.day14.exam;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Score{
	private String name;
	private String sub;
	private int score;
	private String result;

	public void setResult(String result) {
		this.result = result;
	}

	public Score(){}
	
	public Score(String name, String sub, int score) {
		this.name = name;
		this.sub = sub;
		this.score = score;
	}

	public String toString() {
		return "이름:"+name + ", "+sub+":"+score+"("+result+")";
	}
}

public class Exam05 {
	public static void main(String args[]) throws Exception{
		try{
			ArrayList<Score> scores = getScoreList("data/list.txt");
			for(Score s:scores){
				System.out.println(s);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// 코드 작성
	public static ArrayList<Score> getScoreList(String fileName)
	throws Exception{
		ArrayList<Score> list = new ArrayList<>();
		Scanner sc = new Scanner(new File(fileName));
		while(sc.hasNextLine()){
			Score score = new Score();
			String str = sc.nextLine();
			String [] sArr = str.split("/");
			score=new Score(sArr[0],sArr[1],Integer.parseInt(sArr[2]));
			if((sArr[1].equalsIgnoreCase("java")&&Integer.parseInt(sArr[2])<70)
					|sArr[1].equalsIgnoreCase("sql")&&Integer.parseInt(sArr[2])<85){
				score.setResult("미수료");
			}else{
				score.setResult("수료");
			}
			list.add(score);
		}
		return list;
	}
}
