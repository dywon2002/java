package exam.board07.ui;

import java.util.ArrayList;

import exam.board07.ContentVO;

public class SearchUI implements IBoardUI {
	
	private ArrayList<ContentVO> list;

	public SearchUI() {}
	public SearchUI(ArrayList<ContentVO> list) {
		this.list = list;
	}

	// ��ü �Խñ� ��ȸ
	public void execute() {
		System.out.println("��ü : " + list.size() + "��");
		System.out.println("-----------------------");
		System.out.println("��ȣ\t����\t�۾���\t�����");
		System.out.println("-----------------------");
		// �ֽ� ��ϵ� �ۺ��� ����մϴ�.
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		// ����, �Խñ��� �ϳ��� ��ϵǾ� ���� �ʴٸ� ....
		if (list.size() == 0) {
			System.out.println("�Խñ��� �������� �ʽ��ϴ�.");
		}
		
		System.out.println("-----------------------");
	}
}











