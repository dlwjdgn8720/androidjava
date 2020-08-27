package 배열정리;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 음식가격 {
	static int count_red = 0;
	static int count_nuddle = 0;
	static int count_black = 0;
	private static JTextField counttxt;

	public static void main(String[] args) {
		String[] images = { "짬뽕.png", "우동.png", "짜장.png" };
		JFrame j = new JFrame();
		j.setSize(800, 500);
		j.getContentPane().setBackground(Color.YELLOW);
		j.setBackground(Color.WHITE);
        j.getContentPane().setLayout(null);
		JLabel imgspace = new JLabel("New label");
		imgspace.setIcon(new ImageIcon("D:\\leejunghoo\\workspace\\java09\\짜장.PNG"));
		imgspace.setBounds(34, 119, 638, 263);
		j.getContentPane().add(imgspace);
		
		JLabel total = new JLabel("");
		total.setFont(new Font("굴림", Font.PLAIN, 29));
		total.setForeground(Color.RED);
		total.setBounds(283, 392, 154, 55);
		j.getContentPane().add(total);

		JButton img1 = new JButton("짬뽕");
		img1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images[0]);
				imgspace.setIcon(icon);
				count_red++;
				int sum = count_black + count_nuddle + count_red;
				int tot = count_black*5000 + count_nuddle*4500 + count_red*4000;
				counttxt.setText(sum + "개");
				total.setText(tot + "원");
				
			}
		});
		img1.setBackground(Color.ORANGE);
		img1.setBounds(37, 30, 97, 61);
		j.getContentPane().add(img1);

		JButton img2 = new JButton("우동");
		img2.setBackground(Color.MAGENTA);
		img2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images[1]);
				imgspace.setIcon(icon);
				count_nuddle++;
				int sum = count_black + count_nuddle + count_red;
				int tot = count_black*5000 + count_nuddle*4500 + count_red*4000;
				counttxt.setText(sum + "개");
				total.setText(tot + "원");
			}
		});
		img2.setBounds(162, 30, 97, 61);
		j.getContentPane().add(img2);

		JButton img3 = new JButton("짜장");
		img3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images[2]);
				imgspace.setIcon(icon);
				count_black++;
				int sum = count_black + count_nuddle + count_red;
				int tot = count_black*5000 + count_nuddle*4500 + count_red*4000;
				counttxt.setText(sum + "개");
				total.setText(tot + "원");

			}
		});
		img3.setBackground(Color.CYAN);
		img3.setBounds(283, 30, 97, 61);
		j.getContentPane().add(img3);

		JLabel lblNewLabel = new JLabel("개수입력");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setBounds(432, 53, 57, 15);
		j.getContentPane().add(lblNewLabel);

		counttxt = new JTextField("개");
		counttxt.setBounds(501, 30, 228, 61);
       j.getContentPane().add(counttxt);
		counttxt.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("지불할 총 금액");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 36));
		lblNewLabel_1.setBounds(22, 392, 271, 47);
		j.getContentPane().add(lblNewLabel_1);

		

		j.setVisible(true);
	}
}
