package 스레드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임 extends JFrame {
	public 자동차경주게임() {
		setTitle("자동차 경주");
		setSize(1400,600);
		setLayout(null);//absolute layout
		Car car1 = new Car("car01.png",100,0);
		Car car2 = new Car("car02.png",100,200);
		Car car3 = new Car("car03.png",100,400);
		
		car1.start();
		car2.start();
		car3.start();
		setVisible(true);
	}
	
	//내부 클래스
	public class Car extends Thread{
		int  x,y;
		JLabel label;
		
	   public Car(String file,int x, int y) {
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel(icon);
		this.x = x;
		this.y = y;
		label.setBounds(x, y, 150, 150); //라벨의크기가 150x150
		add(label);

	}
	   @Override
	   public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0 ~ 49
				x += move;
				label.setBounds(x, y, 150, 150);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		자동차경주게임 car = new 자동차경주게임();

	}

}
