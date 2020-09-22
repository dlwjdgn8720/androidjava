package 스레드;

public class ThreadRun2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusThread plus = new PlusThread();
		MinusThread minus = new MinusThread();
		plus.start();
		minus.start();
	}

}
