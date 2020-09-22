package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;

public class ThreadRun4 extends JFrame { // 더 많이 쓰임 (중요)
	JLabel top = new JLabel("1");//전역변수,글로벌변수
	JLabel center = new JLabel();
	JLabel sub = new JLabel("3");

	public ThreadRun4() {
		getContentPane().setBackground(Color.ORANGE); // 생성자
           setTitle("나의 멀티스레드");
           setSize(1000,600);
           getContentPane().setLayout(null);
           
           CounterThread2 count = new CounterThread2();
           count.start();
           TimerThread2 timer = new TimerThread2();
           timer.start();
           ImgThread2 img = new ImgThread2();
           img.start();
           
           
           top.setFont(new Font("굴림", Font.PLAIN, 50));
           top.setBounds(0, 10, 385, 66);
           getContentPane().add(top);
           
           center.setBounds(58, 124, 860, 323);
           getContentPane().add(center);
           
           sub.setFont(new Font("굴림", Font.PLAIN, 50));
           sub.setBounds(0, 485, 984, 66);
           getContentPane().add(sub);
           
           
           
           
           
           setVisible(true);
           
	}
	//내부클래스(inner class)
	//변수를 다른 클래스와 공유할 목적
	//단점:내부클래스는 독립적으로 사용 불가
	public class CounterThread2 extends Thread {
		
		@Override//throws Exception을 못쓴다
		public void run() {
			for(int i = 500; i > 0; i--) {
				top.setText("카운터:"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}
	public class TimerThread2 extends Thread {
		//@ => hera@naver.com(at,~에)
		//@ => Annotation(표시,표기): 기능없음,지워도됨
		//어노테이션
		//@Component => 기능있음. new! 객체 생성
		
		
		@Override // 상속받은것중에서 재정의(지워도 상관없음) , 대문자로 시작하면 클래스
		public void run() {
			for (int i = 0; i < 300; i++) {
				Date date = new Date();
				sub.setText("현재시간:"+date);
				try {
					Thread.sleep(1000); // 1초
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public class ImgThread2 extends Thread {
		@Override //부모에 있던 run()이라는 기능을 재 정의
		public void run() {
			String[] img = {"1.png","2.png","3.png","4.png","5.png"};
			for (int i = 0; i < img.length; i++) {
				try {
					Thread.sleep(1500); //3초
				} catch (InterruptedException e) { // 외부자원을 연결할 경우 예외처리를 해야됨 
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				ImageIcon img2 = new ImageIcon(img[i]);
				center.setIcon(img2);
				if(i==4) {
				   i=-1;
				}
			}
			}
		}

	public static void main(String[] args) {

		ThreadRun4 t = new ThreadRun4();
	}
}
