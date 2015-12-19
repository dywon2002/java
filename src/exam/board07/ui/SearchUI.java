package exam.board07.ui;

import java.util.ArrayList;

import exam.board07.ContentVO;

public class SearchUI implements IBoardUI {
	
	private ArrayList<ContentVO> list;

	public SearchUI() {}
	public SearchUI(ArrayList<ContentVO> list) {
		this.list = list;
	}

	// 전체 게시글 조회
	public void execute() {
		System.out.println("전체 : " + list.size() + "개");
		System.out.println("-----------------------");
		System.out.println("번호\t제목\t글쓴이\t등록일");
		System.out.println("-----------------------");
		// 최신 등록된 글부터 출력합니다.
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		// 만약, 게시글이 하나도 등록되어 있지 않다면 ....
		if (list.size() == 0) {
			System.out.println("게시글이 존재하지 않습니다.");
		}
		
		System.out.println("-----------------------");
	}
}











