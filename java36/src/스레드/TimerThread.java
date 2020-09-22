package 스레드;

import java.util.Date;

public class TimerThread extends Thread {
	//@ => hera@naver.com(at,~에)
	//@ => Annotation(표시,표기): 기능없음,지워도됨
	//어노테이션
	//@Component => 기능있음. new! 객체 생성
	
	
	@Override // 상속받은것중에서 재정의(지워도 상관없음) , 대문자로 시작하면 클래스
	public void run() {
		for (int i = 0; i < 300; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
