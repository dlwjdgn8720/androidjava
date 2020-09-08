package db연결;

import javax.swing.JOptionPane;

public class 회원가입UI {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("id입력");
		//String pw = JOptionPane.showInputDialog("pw입력");
		//String name = JOptionPane.showInputDialog("name입력");
		//String tel = JOptionPane.showInputDialog("tel입력");
		DB연결전담클래스 db = new DB연결전담클래스();
		//db.create(id,pw,name,tel);
	}

}
