package exam.board06;

import java.util.Scanner;

import exam.board06.ui.DeleteUI;
import exam.board06.ui.ExitUI;
import exam.board06.ui.IBoardUI;
import exam.board06.ui.RegistUI;
import exam.board06.ui.SearchOneUI;
import exam.board06.ui.SearchUI;
import exam.board06.ui.UpdateUI;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	
	ContentVO [] list = new ContentVO[10]; // ����ƮVO�� �迭�� ������ش�
	
	public int pos = 0; // �迭 contentVO�� �ε��� �ʱⰪ
	
	int i,x = 0;
	

	// ���� �޼ҵ�
	void execute(){	// �޼ҵ�� �ּ����� ��ɸ� ǥ���ϴ� ���� ����
		while(true){
			System.out.println("------------------------");
			System.out.println("1. ��ü �Խù� ��ȸ");
			System.out.println("2. �۹�ȣ ��ȸ");
			System.out.println("3. �۵��");
			System.out.println("4. �ۼ���");
			System.out.println("5. �ۻ���");
			System.out.println("0. ����");
			System.out.println("------------------------");
			System.out.print("�޴� �� ó���� �׸��� �Է��ϼ��� : ");
			i = sc.nextInt();
			IBoardUI ui = null;
			
			if(i==1){
				ui = new SearchUI(pos,list);
			}
			else if(i==2){
				ui = new SearchOneUI(pos, list);
			}
			else if(i==3){
				ui = new RegistUI(this, list);
			}
			else if(i==4){
				ui = new UpdateUI(list, pos);
			}
			else if(i==5){
				ui = new DeleteUI(list,this);
			}
			else if(i==0){
				ui = new ExitUI();
			}
			ui.execute();
		}	
	}
}
