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




	// 전체 게시글 조회
	public void execute(){
		System.out.println("전체 : "+pos+"개");
		System.out.println("------------------------");
		System.out.println("번호\t제목\t글쓴이\t등록일");
		System.out.println("------------------------");
		// 최신 등록된 글부터 출력
		for(int i=pos-1;i>=0;i--){
			System.out.println(list[i]);
		}
		// 만약 게시글이 하나도 등록되어 있지 않다면...
		if(pos == 0){
			System.out.println("게시글이 존재하지 않습니다");
		}
		System.out.println("------------------------");
	}
}
