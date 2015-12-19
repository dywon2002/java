package exam.baseball;

import java.util.Scanner;

public class GameService {
	Scanner sc = new Scanner(System.in);
	
	void ready(){
	System.out.println("야구게임을 시작하시겠습니까?(시작:Y, 종료:N)");
	String b = sc.next();
	
	if(b.equals("Y")){
		System.out.println("시작합니다.");
		
		start();
	}else if(b.equals("N")){
		System.out.println("종료합니다.");
		}
	}
	
	void start(){
		int cnt = 0;
		for(int i =1;i<=10;i++)
		{
		System.out.println("총 10회 시도 중 "+i+"번째 시도 3개의 정수를 입력하세요(0~9)");
		int [] num = new int[3];
		for (int j=0;j<3;j++){
			num[j] = sc.nextInt();
		}
		result(num[0],num[1],num[2]);
		cnt++;
		}
		if(cnt==10){
			System.out.println("10번만에 성공하지 못하셨습니다");
			System.out.println("게임을 종료합니다");
		}
		
	}
	void result(int a,int b,int c){
		
		int [] ansList={1,3,6};
		
		int strike = 0;
		int ball = 0;
		int [] numList={a,b,c};

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(numList[i]==ansList[j]){
					if(i==j){
						strike++;
					}
					else{
						ball++;
					}
				}
				}
				
			}
		if(strike==3){
			System.out.println("삼진아웃! 게임을 종료합니다");
			System.exit(0);
		}
		System.out.println(strike+"스트라이크,"+ball+"볼");
	}
}


	
	