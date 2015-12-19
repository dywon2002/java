package exam.board07.ui;

import java.util.ArrayList;

import exam.board07.ContentVO;

public class UpdateUI extends BaseUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	
	public UpdateUI() {}
	public UpdateUI(ArrayList<ContentVO> list) {
		this.list = list;
	}

	// 게시글 수정 처리
	public void execute() {

		int no = inputInt("수정할 글번호를 입력하세요 : ");
		String title = inputStr("변경할 제목을 입력하세요 : ");

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
			System.out.println("게시글이 존재하지 않습니다.");
		} else {
			System.out.println("게시글이 수정되었습니다.");
		}
	}
}
