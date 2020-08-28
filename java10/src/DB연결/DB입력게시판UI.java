package DB연결;

import javax.swing.JOptionPane;

public class DB입력게시판UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String id = JOptionPane.showInputDialog("ID입력");
		String title = JOptionPane.showInputDialog("타이틀입력");
		String content = JOptionPane.showInputDialog("내용입력");
		String writer = JOptionPane.showInputDialog("글쓴이입력");
		DB처리전담 db = new DB처리전담();
		db.create(title,content,writer);

	}

}
