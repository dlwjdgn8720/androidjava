package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 나의그래픽3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JFrame j = new JFrame();
       ImageIcon img = new ImageIcon("계산기.png");
       
       JLabel l1 = new JLabel();
       JLabel l2 = new JLabel();
       l2.setFont(new Font("Dialog", Font.PLAIN, 49));
       JLabel l3 = new JLabel();
       l3.setFont(new Font("Dialog", Font.PLAIN, 49));
       JLabel result = new JLabel();
       result.setForeground(Color.RED);
       result.setFont(new Font("굴림", Font.PLAIN, 67));
       //이미지 1
       //프레임 1
       //라벨 3
       //텍스트입력2
       JTextField t1 = new JTextField(10);
       t1.setBackground(Color.ORANGE);
       t1.setFont(new Font("Dialog", Font.PLAIN, 53));
       JTextField t2 = new JTextField(10);
       t2.setBackground(Color.ORANGE);
       t2.setFont(new Font("Dialog", Font.PLAIN, 53));
       //레이아웃1
       FlowLayout flow = new FlowLayout();
       
       j.setSize(500,850);
       
       j.getContentPane().setLayout(flow);
       l1.setIcon(img);
       l2.setText("숫자1"); //라벨2에 글자 넣기
       l3.setText("숫자2"); //라벨3에 글자 넣기
       j.getContentPane().add(l1);
       j.getContentPane().add(l2);
       j.getContentPane().add(t1);
       j.getContentPane().add(l3);
       j.getContentPane().add(t2);
       j.getContentPane().add(result);
       
       //버튼1
       JButton plus = new JButton();
       plus.setForeground(Color.RED);
       plus.setBackground(Color.BLUE);
       plus.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		// t1,t2에 입력한 값을 가지고 더해야함
       		// 가지고 온 값의 데이터타입은 무조건 String!
       		String s1 = t1.getText();
       		String s2 = t2.getText();
       		//System.out.println("t1값: " +s1);
       		//System.out.println("t2값: " +s2);
       		//산술연산을 하려면, 숫자로 변환
       		int i1 = Integer.parseInt(s1);
       		int i2 = Integer.parseInt(s2);
       		
       		//숫자로 변환한 값들을 더하자.
       		 int sum = i1+i2;
       		 //JOptionPane.showMessageDialog(j, sum);
       		 
       		 //처리한 결과를 사용자에게 보여줌(출력)
       		 //result.setText(sum +"");
       		 String sum2 = String.valueOf(sum);
       		 result.setText(sum2);
       	}
       });
       plus.setFont(new Font("Dialog", Font.PLAIN, 35));
       plus.setText("+");
      
       
       j.getContentPane().add(plus);
       
       JButton minus = new JButton();
       minus.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		String m1 = t1.getText();
       		String m2 =t2.getText();
       		int m3 = Integer.parseInt(m1);
       		int m4 = Integer.parseInt(m2);
       		int minus2 = m3 - m4;
       	    String minus3 = String.valueOf(minus2);
       	    result.setText(minus3);
       	}
       });
       minus.setText("-");
       minus.setForeground(Color.RED);
       minus.setFont(new Font("Dialog", Font.PLAIN, 35));
       minus.setBackground(Color.BLUE);
       j.getContentPane().add(minus);
       
       JButton mul = new JButton();
       mul.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		String mu1 = t1.getText();
       		String mu2 =t2.getText();
       		int mu3 = Integer.parseInt(mu1);
       		int mu4 = Integer.parseInt(mu2);
       		int mul2 = mu3 * mu4;
       	    String mul3 = String.valueOf(mul2);
       	    result.setText(mul3);
       	}
       });
       mul.setText("*");
       mul.setForeground(Color.RED);
       mul.setFont(new Font("Dialog", Font.PLAIN, 35));
       mul.setBackground(Color.BLUE);
       j.getContentPane().add(mul);
       
       JButton div = new JButton();
       div.setText("/");
       div.setForeground(Color.RED);
       div.setFont(new Font("Dialog", Font.PLAIN, 35));
       div.setBackground(Color.BLUE);
       j.getContentPane().add(div);
       
       
       
       
       j.setVisible(true);
       
	}

}
