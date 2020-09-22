package 스레드;

public class ThreadRun3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterThread counter = new CounterThread();
		TimerThread timer = new TimerThread();
		ImgThread img = new ImgThread();
		counter.start();
		timer.start();
		img.start();

	}

}
