package exam.board07;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import exam.board07.ui.DeleteUI;
import exam.board07.ui.ExitUI;
import exam.board07.ui.IBoardUI;
import exam.board07.ui.RegistUI;
import exam.board07.ui.SearchOneUI;
import exam.board07.ui.SearchUI;
import exam.board07.ui.UpdateUI;

public class BoardService {
	
	Scanner sc = new Scanner(System.in);
	// ������ ���� ó��
	ArrayList<ContentVO> list = new ArrayList<>();
	
	// data/board.txt ������ ������ �о list �� �Է��ϴ� ���
	private void loadingFile() {
		try {
			Scanner sc = new Scanner(new File("data/board.txt"));
			if(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				BoardSequence.setNo(parseInt(line));
			}
			
			while (sc.hasNextLine()) {
				// 1:1:1:2015-12-04-16-43-20
				String line = sc.nextLine();
				// bInfo[0] -> 1(no)
				// bInfo[1] -> 1(writer)
				// bInfo[2] -> 1(title)
				// bInfo[3] -> 2015-12-04-16-43-20
				String[] bInfo = line.split(":");
				
				ContentVO vo = new ContentVO();
				vo.setNo(parseInt(bInfo[0]));
				vo.setWriter(bInfo[1]);
				vo.setTitle (bInfo[2]);
				
				String[] dInfo = bInfo[3].split("-");
				
				Calendar c = Calendar.getInstance();
				c.set(  parseInt(dInfo[0]), 
						parseInt(dInfo[1])-1, 
						parseInt(dInfo[2]), 
						parseInt(dInfo[3]), 
						parseInt(dInfo[4]), 
						parseInt(dInfo[5]));
				// Calendar ��ü�� Date ��ü�� ��ȯ
				vo.setRegDate(c.getTime());
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("���� �ε��� �����߻�");
		}
	}
	
	private int parseInt(String data) {
		return Integer.parseInt(data);
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






