package bean;

public class BbsVO {
	private int no;
	private String title;
	private String content;
	private String writter;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	@Override
	public String toString() {
		return "가르키는 값들 [no=" + no + ", title=" + title + ", content=" + content + ", writter=" + writter + "]";
	}

}
