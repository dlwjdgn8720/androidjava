package 크롤링;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 네이버증권UI1 {
	private static JTextField reslabel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setBackground(Color.WHITE);
		String[] codes = { "005930", "293490", "019170", "253840", "047820" };
		String[] exp = { "회사명:", "회사코드:", "현재가:", "어제와의차이:", "증감비율:" };
		네이버증권크롤링 naver = new 네이버증권크롤링();

//	    for (int i = 0; i < codes.length; i++) {
//	    	String[] result = naver.crawl(codes[i]);
//	    	try {
//				FileWriter file = new FileWriter(result[0]+ ".txt");
//				file.write(result[0]+"\n"); //이름
//				file.write(result[1]+"\n"); //코드
//				file.write(result[2]+"\n"); //현재가
//				file.write(result[3]+"\n"); //어제와의 차이
//				file.write(result[4]+"\n"); //증감비율
//				file.close();
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("파일 저장 중 에러 발생함.!!");
//			}
//		}
		f.setSize(400, 900);
		f.getContentPane().setLayout(null);
		reslabel = new JTextField();
		reslabel.setFont(new Font("굴림", Font.PLAIN, 28));
		reslabel.setBackground(Color.GREEN);
		reslabel.setBounds(81, 460, 202, 61);
		f.getContentPane().add(reslabel);
		reslabel.setColumns(10);

		JTextArea restext = new JTextArea();
		restext.setBounds(60, 612, 260, 195);
		f.getContentPane().add(restext);

		JButton samsungbtn = new JButton("삼성전자");
		samsungbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reslabel.setText(codes[0]);

			}
		});
		samsungbtn.setFont(new Font("Dialog", Font.BOLD, 31));
		samsungbtn.setBackground(Color.ORANGE);
		samsungbtn.setBounds(77, 27, 186, 67);
		f.getContentPane().add(samsungbtn);

		JButton kakaobtn = new JButton("카카오게임즈");
		kakaobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reslabel.setText(codes[1]);

			}
		});
		kakaobtn.setFont(new Font("Dialog", Font.BOLD, 31));
		kakaobtn.setBackground(Color.ORANGE);
		kakaobtn.setBounds(77, 106, 248, 67);
		f.getContentPane().add(kakaobtn);

		JButton sinpungbtn = new JButton("신풍제약");
		sinpungbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reslabel.setText(codes[2]);

			}
		});
		sinpungbtn.setFont(new Font("Dialog", Font.BOLD, 31));
		sinpungbtn.setBackground(Color.ORANGE);
		sinpungbtn.setBounds(77, 185, 186, 67);
		f.getContentPane().add(sinpungbtn);

		JButton sujanbtn = new JButton("수젠텍");
		sujanbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				reslabel.setText(codes[3]);

			}
		});
		sujanbtn.setFont(new Font("Dialog", Font.BOLD, 31));
		sujanbtn.setBackground(Color.ORANGE);
		sujanbtn.setBounds(77, 264, 186, 67);
		f.getContentPane().add(sujanbtn);

		JButton snakebtn = new JButton("초록뱀");
		snakebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reslabel.setText(codes[4]);

			}
		});
		snakebtn.setFont(new Font("Dialog", Font.BOLD, 31));
		snakebtn.setBackground(Color.ORANGE);
		snakebtn.setBounds(77, 342, 186, 67);
		f.getContentPane().add(snakebtn);

		JLabel lblNewLabel = new JLabel("CODE:");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel.setBounds(123, 419, 93, 44);
		f.getContentPane().add(lblNewLabel);

		JButton crawlbtn = new JButton("크롤링시작");
		crawlbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] list = naver.crawl(reslabel.getText());
				for (int i = 0; i < list.length; i++) {
					restext.append(exp[i] + list[i] + "\n");
				}

			}
		});
		crawlbtn.setFont(new Font("Dialog", Font.BOLD, 31));
		crawlbtn.setBackground(Color.ORANGE);
		crawlbtn.setBounds(60, 533, 248, 67);
		f.getContentPane().add(crawlbtn);

		f.setVisible(true);

	}
}
