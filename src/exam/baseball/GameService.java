package exam.baseball;

import java.util.Scanner;

public class GameService {
	Scanner sc = new Scanner(System.in);
	
	void ready(){
	System.out.println("�߱������� �����Ͻðڽ��ϱ�?(����:Y, ����:N)");
	String b = sc.next();
	
	if(b.equals("Y")){
		System.out.println("�����մϴ�.");
		
		start();
	}else if(b.equals("N")){
		System.out.println("�����մϴ�.");
		}
	}
	
	void start(){
		int cnt = 0;
		for(int i =1;i<=10;i++)
		{
		System.out.println("�� 10ȸ �õ� �� "+i+"��° �õ� 3���� ������ �Է��ϼ���(0~9)");
		int [] num = new int[3];
		for (int j=0;j<3;j++){
			num[j] = sc.nextInt();
		}
		result(num[0],num[1],num[2]);
		cnt++;
		}
		if(cnt==10){
			System.out.println("10������ �������� ���ϼ̽��ϴ�");
			System.out.println("������ �����մϴ�");
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
			System.out.println("�����ƿ�! ������ �����մϴ�");
			System.exit(0);
		}
		System.out.println(strike+"��Ʈ����ũ,"+ball+"��");
	}
}


	
	