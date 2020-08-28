package 클래스만들기;

public class Bbs {
	public int mid;
	public String mtitle;
	public String mcontent;
	public String mwriter;

	public void write(int id,String title,String content,String writer) {
		mid = id;
		mtitle = title;
		mcontent = content;
		mwriter = writer;
		System.out.println(mid+"\t"+mtitle+"\t"+mcontent+"\t"+mwriter+"\t");
	}

	public void delete() {
		mid = 0;
		mtitle = null;
		mcontent = null;
		mwriter = null;
	}

	public void read() {
		System.out.println("글을 읽다");
	}

	public void update() {
		System.out.println("글을 수정하다");
	}
	
	@Override
	public String toString() {
		return "id=" + mid + ", title=" + mtitle + ", content=" + mcontent + ", writer=" + mwriter;
	}
}
