package 그래픽Swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame j = new JFrame();
     j.setSize(300, 500);
     FlowLayout flow = new FlowLayout(); 
     
     
     JButton btn = new JButton();
     btn.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     	   JOptionPane.showMessageDialog(j, "안녕");
     	}
     });
     btn.setForeground(Color.BLUE);
     btn.setFont(new Font("굴림", Font.BOLD, 96));
     btn.setBackground(Color.ORANGE);
     btn.setText("봄");
     j.getContentPane().add(btn);
     
     
     JButton btn_1 = new JButton();
     
     btn_1.setForeground(Color.GREEN);
     btn_1.setFont(new Font("굴림", Font.BOLD, 99));
     btn_1.setBackground(Color.PINK);
     btn_1.setText("여름");
     
     j.getContentPane().add(btn_1);
     j.getContentPane().setLayout(flow);
     j.setVisible(true);
     
	}

}
