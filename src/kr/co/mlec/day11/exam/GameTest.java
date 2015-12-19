package kr.co.mlec.day11.exam;

import java.util.Scanner;

interface Game{
	int startGame(int you);
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
}

class ScissorsRockPaper implements Game{
	
	@Override
	public int startGame(int you) {
		int me = (int)(Math.random()*3+1);
		
		if(me==Game.SCISSOR&you==2){
			System.out.println("You win");
			return 1;
		}
		else if(me==Game.ROCK&you==3){
			System.out.println("You win");
			return 1;
		}
		else if(me==Game.PAPER&you==1){
			System.out.println("You win");
			return 1;
		}
		else if(me==you){
			System.out.println("비겼습니다");
			return 0;
		}
		else{
			System.out.println("You lose");
			return 0;
		}
	}
}
class Dice implements Game{

	@Override
	public int startGame(int you) {
		int me = (int)(Math.random()*6+1);
		if(me==you){
			System.out.println("You win");
			return 1;
		}
		else{
			System.out.println("You lose");
			return 0;
			}
	}
	
}

public class GameTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		Game g1 = new ScissorsRockPaper();
		Game g2 = new Dice();

		int score = 0;
		while(true){
			System.out.println("게임을 선택하세요.");
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값 맞추기");
			System.out.println("C. 종료");
			String s = sc.next();
			if(s.equals("A")){
				System.out.println("A. 가위바위보 : ");
				while(true){
					int you = sc.nextInt();
					if(you!=1&&you!=2&&you!=3){
						System.out.println("입력값이 잘못되었습니다");
						System.out.println("다시 입력하세요(1-3)");
					}
					else{score+= g1.startGame(you);
					break;}
				}
			}
			else if(s.equals("B")){
				System.out.println("B. 주사위 값 맞추기 : ");
				while(true){
					int you = sc.nextInt();
					if(you!=1&&you!=2&&you!=3&&you!=4&&you!=5&&you!=6){
						System.out.println("입력값이 잘못되었습니다");
						System.out.println("다시 입력하세요(1-6)");
					}
				else{
					score+= g2.startGame(you);
					break;
				}
			}
			}
			else if(s.equals("C")){
				System.out.println("게임을 종료합니다");
				System.out.println("당신의 total score는 "+score+"입니다.");
				System.exit(0);
			}
			else {
				System.out.println("다시 입력하세요");
			}
		}
	}

}
