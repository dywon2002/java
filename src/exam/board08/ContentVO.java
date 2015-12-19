package exam.board08;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContentVO implements Serializable{
	private String title;
	private String writer;
	private int no;
	private Date regDate;
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// 생성자 만들기 : alt + shift + s, c
	public ContentVO() {
		super();
	}
	
	// 생성자 만들기(멤버변수) : alt + shift + s, o
	public ContentVO(String title, String writer, int no) {
		super();
		this.title = title;
		this.writer = writer;
		this.no = no;
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
	
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(regDate);
		return no + "\t" + title + "\t" + writer + "\t" + date;
	}
}
