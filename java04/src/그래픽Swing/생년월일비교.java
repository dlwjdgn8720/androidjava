package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 생년월일비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame j = new JFrame();
     j.setSize(500, 500);
     FlowLayout flow = new FlowLayout();
     
     JLabel l1 = new JLabel();
     l1.setFont(new Font("굴림", Font.PLAIN, 52));
     l1.setText("이름");
     JLabel l2 = new JLabel();
     l2.setFont(new Font("굴림", Font.PLAIN, 52));
     l2.setText("생년월일");
     JTextField t1 = new JTextField(20);
     t1.setFont(new Font("굴림", Font.PLAIN, 23));
     JTextField t2 = new JTextField(20);
     t2.setFont(new Font("굴림", Font.PLAIN, 17));
     JButton compare = new JButton();
     compare.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		String s1 = t1.getText();
     		String s2 = t2.getText();
     		int i1 = Integer.parseInt(s2);
     		int x = 2020-i1+1;
     		if(x >= 18) {
     		JOptionPane.showMessageDialog(j, s1+"는 성인입니다");
     	}
     		else {
     			JOptionPane.showMessageDialog(j, s1+"는 미성년자입니다");
     		}
     	}
     });
     compare.setFont(new Font("굴림", Font.PLAIN, 35));
     compare.setText("비교");
     
     j.getContentPane().setLayout(flow);
     j.getContentPane().add(l1);
     j.getContentPane().add(t1);
     j.getContentPane().add(l2);
     j.getContentPane().add(t2);
     j.getContentPane().add(compare);
     j.setVisible(true);
	}

}
