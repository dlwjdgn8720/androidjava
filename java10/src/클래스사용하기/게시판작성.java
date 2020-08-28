package 클래스사용하기;

import 클래스만들기.Bbs;

public class 게시판작성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bbs b = new Bbs();
      b.mid = 1;
      b.mtitle = "안녕";
      b.mcontent="안녕";
      b.mwriter="이정후";
      System.out.println(b.toString());
	}

}
