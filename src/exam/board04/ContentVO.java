package exam.board04;

public class ContentVO {
	// ���� �߰� �׸�
	// �۹�ȣ, �����
	
	private String title;
	private String writer;
	private int no;

	
	// ������ �����(�������) : alt + shift + s, o
	public ContentVO(String title, String writer, int no) {
		super();
		this.title = title;
		this.writer = writer;
		this.no = no;
	}

	// ������ ����� : alt + shift + s, c
	
	public ContentVO() {
		super();
		// TODO �ڵ� ������ ������ ����
	}
	
	// setter, getter : alt + shift + s, r
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String toString(){
		return no + "\t" + title + "\t" + writer;
	}
	
	
	
}
