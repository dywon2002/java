package exam.board07.ui;

import java.util.ArrayList;

import exam.board07.ContentVO;

public class UpdateUI extends BaseUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	
	public UpdateUI() {}
	public UpdateUI(ArrayList<ContentVO> list) {
		this.list = list;
	}

	// �Խñ� ���� ó��
	public void execute() {

		int no = inputInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title = inputStr("������ ������ �Է��ϼ��� : ");

		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			ContentVO content = list.get(i);
			if (no == content.getNo()) {
				content.setTitle(title);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("�Խñ��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�Խñ��� �����Ǿ����ϴ�.");
		}
	}
}
