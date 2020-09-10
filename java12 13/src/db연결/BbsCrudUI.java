package db연결;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsCrudUI {
	private static JTextField tno;
	private static JTextField tcontent;
	private static JTextField twritter;
	private static JTextField ttitle;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(900,900);
		f.getContentPane().setLayout(null);
		
		tno = new JTextField();
		tno.setBounds(97, 94, 116, 24);
		f.getContentPane().add(tno);
		tno.setColumns(10);
		
		tcontent = new JTextField();
		tcontent.setBounds(97, 191, 358, 251);
		f.getContentPane().add(tcontent);
		tcontent.setColumns(10);
		
		twritter = new JTextField();
		twritter.setBounds(339, 491, 116, 24);
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
			    String strno = tno.getText();
			    String writter = twritter.getText();
				String content = tcontent.getText();
				String title = ttitle.getText();
				BbsVO bag = new BbsVO();
				int no = Integer.parseInt(strno);
				
				bag.setNo(no);
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
		
		JButton read = new JButton("검색");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String no = tno.getText();
		            BbsDAO dao = new BbsDAO();
		            try {
		               BbsVO bag = dao.one(Integer.parseInt(no));
		               tno.setText(String.valueOf(bag.getNo()));
		               ttitle.setText(bag.getTitle());
		               tcontent.setText(bag.getContent());
		               twritter.setText(bag.getWritter());
		            }catch (Exception e1) {
		            	e1.printStackTrace();
		            }

			}
		});
		read.setBounds(130, 538, 105, 27);
		f.getContentPane().add(read);
		
		JButton update = new JButton("수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strno = tno.getText();
				int no = Integer.parseInt(strno);
				String content = tcontent.getText();
				
				BbsDAO dao = new BbsDAO();
				try {
					dao.update(content,no);
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		update.setBounds(130, 589, 105, 27);
		f.getContentPane().add(update);
		
		JButton deletebtn = new JButton("삭제");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strno = tno.getText();
				int no = Integer.parseInt(strno);
				BbsDAO dao = new BbsDAO();
				try {
					dao.delete(no);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		deletebtn.setBounds(279, 589, 105, 27);
		f.getContentPane().add(deletebtn);
		
		JTextArea all = new JTextArea();
		all.setBounds(544, 118, 206, 341);
		f.getContentPane().add(all);
		
		JButton btnNewButton = new JButton("전체목록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 BbsDAO dao = new BbsDAO();
				        ArrayList<BbsVO> list= dao.all();
				        System.out.println("게시판의개수:"+list.size()+"개");
				        for(int i=0; i<list.size(); i++) {
				        	BbsVO bag=list.get(i);
				        	all.append(bag.getNo()+", "+bag.getTitle()+", "+bag.getContent()+", "+bag.getWritter()+"\n");
				      }
				}catch(Exception e2) {
					
				}
			}
		});
		btnNewButton.setBounds(406, 538, 105, 27);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
	}
}
