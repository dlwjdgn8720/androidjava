package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바는 부품조립식코드 => 객체지향프로그래밍(OOP)
		// ctrl + shift + o : 자동import
		JFrame fr = new JFrame(); // new는 복사의 의미
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "안녕하세요");
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "안녕");
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "사진입니다");
			}
		});
		
		// String img = "sky.png";
		ImageIcon img = new ImageIcon("sky.png");
		b1.setText("나를 눌러요");
		b2.setText("나도 눌러요");
		b3.setIcon(img);
		fr.getContentPane().add(b1);
		fr.getContentPane().add(b2);
		fr.getContentPane().add(b3);
		fr.setSize(1000, 700);
		FlowLayout flow = new FlowLayout();
		fr.getContentPane().setLayout(flow);
		fr.setVisible(true);// 맨 아래에 두어야한다.

	}

}
