package exam.board07;

public class BoardSequence {
	// 게시물번호를 관리 : 공유해서 같이 사용하기 위해서 static
	private static int no = 0;

	public static int getNo() {
		return ++no;
	}
	public static int getCurrentNo() {
		return no;
	}
	public static void setNo(int no) {
		BoardSequence.no = no;
	}
	
}
