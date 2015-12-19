package exam.board08.ui;

import java.util.ArrayList;

import exam.board08.ContentVO;

public class DeleteUI extends BaseUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	
	public DeleteUI() {}
	
	public DeleteUI(ArrayList<ContentVO> list) {
		this.list = list;
	}	
	
	// �Խñ� ���� ó��
	public void execute() {
		int no = inputInt("������ ���� ��ȣ�� �Է��ϼ��� : ");
		for (int i = 0; i < list.size(); i++) {
			ContentVO content = list.get(i);
			if (no == content.getNo()) {
				list.remove(i);
				break;
			}
		}
		System.out.println("�Խñ��� �����Ǿ����ϴ�.\n");
	}
}





