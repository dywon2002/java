package exam.board04;

public class ContentVO {
	// 추후 추가 항목
	// 글번호, 등록일
	
	private String title;
	private String writer;
	private int no;

	
	// 생성자 만들기(멤버변수) : alt + shift + s, o
	public ContentVO(String title, String writer, int no) {
		super();
		this.title = title;
		this.writer = writer;
		this.no = no;
	}

	// 생성자 만들기 : alt + shift + s, c
	
	public ContentVO() {
		super();
		// TODO 자동 생성된 생성자 스텁
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
