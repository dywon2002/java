package exam.board08.ui;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import exam.board08.BoardSequence;
import exam.board08.ContentVO;

public class ExitUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	public ExitUI(ArrayList<ContentVO> list) {
		this.list = list;
	}
	
	@Override
	public void execute() {
		// list �� �� �ִ� ContentVO ��ü�� ������ ���Ͽ� ������

		try (
			// data/board.txt ���Ͽ� ������ ����
			FileOutputStream fos = new FileOutputStream("data/board.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			// �۹�ȣ ����
			oos.writeInt(BoardSequence.getCurrentNo());
			oos.writeObject(list);
			
		} catch (Exception e) {
			System.out.println("���� ����� ���� �߻�");
			e.printStackTrace();
		}
		// �Խ��� ���α׷� ����
		System.out.println("�Խ��� ���α׷��� �����մϴ�.\n");
		System.exit(0);
	}
}



















