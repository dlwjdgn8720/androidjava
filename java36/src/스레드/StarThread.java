package 스레드;

public class StarThread extends Thread {
//멤버변수,멤버메서드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("★");
		}
	}
}
