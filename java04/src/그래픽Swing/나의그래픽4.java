package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame j = new JFrame();
     j.setSize(500, 500);
     FlowLayout flow = new FlowLayout();
     JLabel l1 = new JLabel();
     l1.setFont(new Font("굴림", Font.PLAIN, 42));
     JLabel l2 = new JLabel();
     l2.setFont(new Font("굴림", Font.PLAIN, 42));
     //JLabel result = new JLabel();
     JTextField t1 = new JTextField(10);
     l1.setText("숫자1");
     t1.setFont(new Font("Dialog", Font.PLAIN, 51));
     JTextField t2 = new JTextField(10);
     l2.setText("숫자2");
     t2.setFont(new Font("Dialog", Font.PLAIN, 51));
     JButton compare = new JButton();
     compare.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     	    String s1 = t1.getText();
     	    String s2 = t2.getText();
     	    int c1 = Integer.parseInt(s1);
     	    int c2 = Integer.parseInt(s2);
     	    if(c1 > c2) {
     	    	JOptionPane.showMessageDialog(j, "숫자1이 더 큽니다.");
     	    }
     	    else {
     	    	JOptionPane.showMessageDialog(j, "숫자2가 더 큽니다.");
     	    }
     	}
     });
     compare.setText("비교");
     compare.setFont(new Font("굴림", Font.PLAIN, 41));
     
     
     
     
     
     
     j.getContentPane().setLayout(flow);
     j.getContentPane().add(l1);
     j.getContentPane().add(t1);
     
     
     j.getContentPane().add(l2);
     j.getContentPane().add(t2);
     
     //j.getContentPane().add(result);
     j.getContentPane().add(compare);
     
     j.setVisible(true);
	}

}
