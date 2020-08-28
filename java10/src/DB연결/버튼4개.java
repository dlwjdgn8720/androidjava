package DB연결;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼4개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame(); // 동서남북 가운데
		f.setSize(500, 500);
		// FlowLayout flow = new FlowLayout();
		// f.setLayout(new FlowLayout());
		DB처리전담 db = new DB처리전담();

		JButton b1 = new JButton();
		b1.setText("Create");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//db.create();
			}
		});

		JButton b2 = new JButton();
		b2.setText("Read");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db.read();
			}
		});

		JButton b3 = new JButton();
		b3.setText("Update"); //입력한 값 가지고 와서 DB처리 전담 클래스에게
		                      // DB에 저장하라고 데이터를 넘김.control역할
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db.update();
			}
		});

		JButton b4 = new JButton();
		b4.setText("Delete");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db.delete();
			}
		});

		f.getContentPane().add(b1, BorderLayout.NORTH);
		f.getContentPane().add(b2, BorderLayout.EAST);
		f.getContentPane().add(b3, BorderLayout.WEST);
		f.getContentPane().add(b4, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
