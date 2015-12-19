package exam.board06.ui;

import exam.board06.ContentVO;

public class SearchUI implements IBoardUI{
	
	private int pos;
	private ContentVO [] list;
	
	public SearchUI() {}
	
	public SearchUI(int pos, ContentVO[] list) {
		this.pos = pos;
		this.list = list;
	}




	// ��ü �Խñ� ��ȸ
	public void execute(){
		System.out.println("��ü : "+pos+"��");
		System.out.println("------------------------");
		System.out.println("��ȣ\t����\t�۾���\t�����");
		System.out.println("------------------------");
		// �ֽ� ��ϵ� �ۺ��� ���
		for(int i=pos-1;i>=0;i--){
			System.out.println(list[i]);
		}
		// ���� �Խñ��� �ϳ��� ��ϵǾ� ���� �ʴٸ�...
		if(pos == 0){
			System.out.println("�Խñ��� �������� �ʽ��ϴ�");
		}
		System.out.println("------------------------");
	}
}
