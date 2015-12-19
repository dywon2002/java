package exam.board08;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import exam.board08.ui.DeleteUI;
import exam.board08.ui.ExitUI;
import exam.board08.ui.IBoardUI;
import exam.board08.ui.RegistUI;
import exam.board08.ui.SearchOneUI;
import exam.board08.ui.SearchUI;
import exam.board08.ui.UpdateUI;

public class BoardService {
	
	Scanner sc = new Scanner(System.in);
	// ������ ���� ó��
	ArrayList<ContentVO> list = new ArrayList<>();
	
	// data/board.txt ������ ������ �о list �� �Է��ϴ� ���
	private void loadingFile() {
		try (
				FileInputStream fis = new FileInputStream("data/board.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				)
		{
			// ���� �۹�ȣ ����
			BoardSequence.setNo(ois.readInt());
			list = (ArrayList<ContentVO>)ois.readObject();
		}
		 catch (Exception e) {
		}
	}
	
	void execute() {
		
		// ���� ������ ����Ʈ�� �ε���Ű��
		loadingFile();
		
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. ��ü�Խù� ��ȸ   ");
			System.out.println("2. �۹�ȣ ��ȸ   ");
			System.out.println("3. �۵��   ");
			System.out.println("4. �ۼ���   ");
			System.out.println("5. �ۻ���   ");
			System.out.println("0. ���� ");
			System.out.println("--------------------------------------------------");
			System.out.print("�޴� �� ó���� �׸��� �����ϼ��� : ");

			IBoardUI ui = null;
			
			int i = sc.nextInt();
			switch(i) {
			case 1 :
				ui = new SearchUI(list);
				break;
			
			case 2 :
				ui = new SearchOneUI(list);
				break;
			
			case 3 :
				ui = new RegistUI(list);
				break;
			
			case 4 :
				ui = new UpdateUI(list);
				break;

			case 5 :
				ui = new DeleteUI(list);
				break;
				
			case 0 :
				// ����Ʈ�� ������ ���Ͽ� �����ϱ� ���� ����Ʈ ��ü�� �ѱ��.
				ui = new ExitUI(list);
			}
			ui.execute();
		}
	}
}






