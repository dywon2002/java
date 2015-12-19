// �Խñ� �ϳ��� ������ �����ִ� Ŭ����
package exam.board08.ui;

import java.util.ArrayList;

import exam.board08.ContentVO;

public class SearchOneUI extends BaseUI implements IBoardUI {
	
	private ArrayList<ContentVO> list;
	
	public SearchOneUI() {}

	public SearchOneUI(ArrayList<ContentVO> list) {
		this.list = list;
	}

	// �Խñ� �� ��ȸ : �۾��� ��ȸ
	public void execute() {
		// BaseUI�� �����Ǵ� �޼��带 Ȱ��
		String name = inputStr("��ȸ�� �۾��̸� �Է��ϼ��� : ");
		System.out.println("�۾��� ��ȸ�޴� ������");
		
//		hong�� ����
//		-----------------------
//		test	hong
//		test2	hong
//		-----------------------
		for (int i = 0; i < list.size(); i++) {
			ContentVO content = list.get(i);
			if (name.equals(content.getWriter())) {
				System.out.println(
						content.getTitle() + "\t" + content.getWriter());
			}
			
		}
	}
}
