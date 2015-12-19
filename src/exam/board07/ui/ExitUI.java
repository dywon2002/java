package exam.board07.ui;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import exam.board07.BoardSequence;
import exam.board07.ContentVO;

public class ExitUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	public ExitUI(ArrayList<ContentVO> list) {
		this.list = list;
	}
	
	@Override
	public void execute() {
		// list �� �� �ִ� ContentVO ��ü�� ������ ���Ͽ� ������
//		private String title;
//		private String writer;
//		private int no;
//		private Date regDate;
		try (
			// data/board.txt ���Ͽ� ������ ����
			FileWriter fw = new FileWriter("data/board.txt");
		) {
			// �۹�ȣ ����
			fw.write(BoardSequence.getCurrentNo() + "\n");
			
			// ���Ͽ� �����ϴ� ����
			// no:writer:title:regDate
			SimpleDateFormat sdf = 
					new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			for (ContentVO vo : list) {
				String data = vo.getNo() + ":" + vo.getWriter() + ":" + 
						      vo.getTitle() + ":" + sdf.format(vo.getRegDate());
				fw.write(data + "\n");
			}
		} catch (Exception e) {
			System.out.println("���� ����� ���� �߻�");
			e.printStackTrace();
		}
		// �Խ��� ���α׷� ����
		System.out.println("�Խ��� ���α׷��� �����մϴ�.\n");
		System.exit(0);
	}
}



















