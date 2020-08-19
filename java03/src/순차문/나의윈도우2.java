package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 나의윈도우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          JFrame j = new JFrame();
          j.setSize(500, 500);
          
          JButton btnNewButton = new JButton("나를 눌러요");
          btnNewButton.setBackground(Color.RED);
          btnNewButton.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		JOptionPane.showMessageDialog(j, "나를 눌러줘");
          	}
          });
          j.getContentPane().add(btnNewButton, BorderLayout.CENTER);
          
          JButton btnNewButton_1 = new JButton("나를 눌러요");
          btnNewButton_1.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		JOptionPane.showMessageDialog(j, "나를 눌러줘");
          		
          	}
          });
          j.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
          
          JButton btnNewButton_2 = new JButton("나를 눌러요");
          btnNewButton_2.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		JOptionPane.showMessageDialog(j, "나를 눌러줘");
          	}
          });
          j.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
          
          JButton btnNewButton_3 = new JButton("나를 눌러줘요");
          btnNewButton_3.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		JOptionPane.showMessageDialog(j, "나를 눌러줘");
          	}
          });
          j.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
          
          JButton btnNewButton_4 = new JButton("나를 눌러요");
          btnNewButton_4.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		JOptionPane.showMessageDialog(j, "나를 눌러줘");
          	}
          });
          j.getContentPane().add(btnNewButton_4, BorderLayout.NORTH);
          j.setVisible(true);
          
     
	}

}
