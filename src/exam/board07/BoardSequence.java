package exam.board07;

public class BoardSequence {
	// �Խù���ȣ�� ���� : �����ؼ� ���� ����ϱ� ���ؼ� static
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
