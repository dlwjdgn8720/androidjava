package 스레드;

public class ThreadRun1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StarThread star = new StarThread();
     AtThread at = new AtThread();
     star.start();
     at.start();//main,start,at 스레드가 동시에 3개 돌아가고있음
	}

}
