package exam.board05;

public class BoardSequence {
	// 게시물 번호를 관리 : 번호를 공유해서 다 같이 사용하기 위해서 static을 붙여준다
	private static int no = 0;

	public static int getNo() {
		return ++no;
	}

	
}
