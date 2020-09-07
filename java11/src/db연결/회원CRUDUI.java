package db연결;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(81, 118, 62, 34);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(81, 164, 62, 18);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(81, 229, 62, 18);
		f.getContentPane().add(lblName);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setBounds(81, 273, 62, 18);
		f.getContentPane().add(lblTel);
		
		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setBackground(Color.ORANGE);
		t1.setBounds(157, 123, 116, 24);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setBackground(Color.ORANGE);
		t2.setColumns(10);
		t2.setBounds(157, 161, 116, 24);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setForeground(Color.RED);
		t3.setBackground(Color.ORANGE);
		t3.setColumns(10);
		t3.setBounds(157, 226, 116, 24);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setForeground(Color.RED);
		t4.setBackground(Color.ORANGE);
		t4.setColumns(10);
		t4.setBounds(157, 270, 116, 24);
		f.getContentPane().add(t4);
		
		JButton create = new JButton("회원가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입할 정보 4개의 입력값을 가지고 와서,
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//db처리(MemberDAO),create()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id,pw,name,tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		create.setBounds(68, 339, 105, 27);
		f.getContentPane().add(create);
		
		JButton read = new JButton("회원검색");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					int result = dao.read(id); //0이나 1이 되어 리턴되어있음.
					if(result==1) {//검색결과가 있음.
						
					}else {
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						t1.setBackground(Color.BLUE);
						t2.setBackground(Color.BLUE);
						t3.setBackground(Color.BLUE);
						t4.setBackground(Color.BLUE);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		read.setBounds(223, 339, 105, 27);
		f.getContentPane().add(read);
		
		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//db처리(MemberDAO),create()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel,id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		update.setBounds(68, 401, 105, 27);
		f.getContentPane().add(update);
		
		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//db처리(MemberDAO),create()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		delete.setBounds(223, 401, 105, 27);
		f.getContentPane().add(delete);
		f.setVisible(true);
	}
}
