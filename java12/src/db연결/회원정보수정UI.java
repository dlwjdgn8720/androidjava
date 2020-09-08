package db연결;

import javax.swing.JOptionPane;

public class 회원정보수정UI {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("검색할 id입력");
		String tel = JOptionPane.showInputDialog("수정할 tel입력");
		DB연결전담클래스 db = new DB연결전담클래스();
		db.update(tel,id);
	}

}
