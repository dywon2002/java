// 게시글 하나의 정보를 보여주는 클래스
package exam.board08.ui;

import java.util.ArrayList;

import exam.board08.ContentVO;

public class SearchOneUI extends BaseUI implements IBoardUI {
	
	private ArrayList<ContentVO> list;
	
	public SearchOneUI() {}

	public SearchOneUI(ArrayList<ContentVO> list) {
		this.list = list;
	}

	// 게시글 상세 조회 : 글쓴이 조회
	public void execute() {
		// BaseUI에 제공되는 메서드를 활용
		String name = inputStr("조회할 글쓴이를 입력하세요 : ");
		System.out.println("글쓴이 조회메뉴 선택함");
		
//		hong이 쓴글
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
