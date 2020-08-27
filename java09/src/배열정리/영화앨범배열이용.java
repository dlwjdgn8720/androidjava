package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 영화앨범배열이용 {
	static int now = 2;//현재 위치를 체크할수 있는 변수
	

	public static void main(String[] args) {
		String[] titles = {"다만 악에서","해리포터","테넷","반도","캐리비안의해적"};
		String[] images = {"다만악에서.png","해리포터와 죽음의성물.png","테넷.png","반도.png","캐리비안의해적.png"};
		String[] directors = {"홍원찬","이정후","크리스트퍼 놀란","이정훈","요아킹 롸닝"};
		double[] rates = {7.79,8.64,8.63,6.53,8.53};
		
		
		// TODO Auto-generated method stub
     JFrame j = new JFrame();
     j.getContentPane().setBackground(Color.ORANGE);
     j.getContentPane().setLayout(null);
     j.setSize(800,600);
     j.setTitle("나의 영화 앨범");
     
     JLabel title = new JLabel("테넷");
     title.setBackground(Color.WHITE);
     title.setFont(new Font("굴림", Font.BOLD, 36));
     title.setBounds(323, 10, 773, 58);
     j.getContentPane().add(title);
     
     JLabel lblNewLabel_1 = new JLabel("감독");
     lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 21));
     lblNewLabel_1.setBounds(523, 187, 47, 45);
     j.getContentPane().add(lblNewLabel_1);
     
     JLabel director = new JLabel("크리스트퍼 놀란");
     director.setForeground(Color.RED);
     director.setBackground(Color.WHITE);
     director.setFont(new Font("굴림", Font.PLAIN, 25));
     director.setBounds(533, 242, 220, 45);
     j.getContentPane().add(director);
     
     JLabel img = new JLabel(images[2]+"");
     img.setIcon(new ImageIcon("D:\\leejunghoo\\workspace\\java09\\테넷.PNG"));
     img.setBounds(78, 78, 396, 473);
     j.getContentPane().add(img);
     
     JLabel lblNewLabel_1_1 = new JLabel("평점");
     lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 21));
     lblNewLabel_1_1.setBounds(523, 289, 47, 45);
     j.getContentPane().add(lblNewLabel_1_1);
     
     JLabel rate = new JLabel("8.63");
     rate.setForeground(Color.RED);
     rate.setFont(new Font("굴림", Font.PLAIN, 25));
     rate.setBackground(Color.ORANGE);
     rate.setBounds(533, 329, 122, 45);
     j.getContentPane().add(rate);
     
     JButton btnNewButton = new JButton("<");
     btnNewButton.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		if(now == 0) {
     			now = 5;
     		}
     		now--;//1
     		title.setText(titles[now]);
     		ImageIcon icon = new ImageIcon(images[now]);
     		img.setIcon(icon);
     		director.setText(directors[now]);
     		rate.setText(rates[now]+"");
     		
     	}
     });
     btnNewButton.setBackground(Color.GREEN);
     btnNewButton.setFont(new Font("굴림", Font.PLAIN, 28));
     
     btnNewButton.setBounds(0, 0, 66, 561);
     j.getContentPane().add(btnNewButton);
     
     JButton btnNewButton_1 = new JButton(">");
     btnNewButton_1.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		if(now == 4) {
     			now = -1;
     		}
     		now++;//3
     		title.setText(titles[now]);
     		ImageIcon icon = new ImageIcon(images[now]);
     		img.setIcon(icon);
     		director.setText(directors[now]);
     		rate.setText(rates[now]+"");
     	}
     });
     btnNewButton_1.setBackground(Color.GREEN);
     btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 28));
     btnNewButton_1.setBounds(727, 0, 57, 561);
     j.getContentPane().add(btnNewButton_1);
     j.setVisible(true);
	}
}
