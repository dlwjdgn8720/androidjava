package db연결;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsCrudUI {
	private static JTextField tno;
	private static JTextField tcontent;
	private static JTextField twritter;
	private static JTextField ttitle;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700,700);
		f.getContentPane().setLayout(null);
		
		tno = new JTextField();
		tno.setBounds(97, 94, 116, 24);
		f.getContentPane().add(tno);
		tno.setColumns(10);
		
		tcontent = new JTextField();
		tcontent.setBounds(97, 191, 521, 251);
		f.getContentPane().add(tcontent);
		tcontent.setColumns(10);
		
		twritter = new JTextField();
		twritter.setBounds(502, 497, 116, 24);
		f.getContentPane().add(twritter);
		twritter.setColumns(10);
		
		ttitle = new JTextField();
		ttitle.setBounds(231, 94, 116, 24);
		f.getContentPane().add(ttitle);
		ttitle.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("게시판");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 36));
		lblNewLabel.setBounds(55, 12, 174, 68);
		f.getContentPane().add(lblNewLabel);
		
		JButton btncomp = new JButton("작성완료");
		btncomp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //String strno = tno.getText();
			    String writter = twritter.getText();
				String content = tcontent.getText();
				String title = ttitle.getText();
				BbsVO bag = new BbsVO();
				//int no = Integer.parseInt(strno);
				
				//bag.setNo(no);
				bag.setWritter(writter);
				bag.setContent(content);
				bag.setTitle(title);
				BbsDAO dao = new BbsDAO();
				try {
					dao.create(bag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btncomp.setBounds(279, 538, 105, 27);
		f.getContentPane().add(btncomp);
		f.setVisible(true);
	}
}
