package 스레드;

public class ImgThread extends Thread {
	@Override //부모에 있던 run()이라는 기능을 재 정의
	public void run() {
		String[] img = {"1.png","2.png","3.png","4.png","5.png",};
		for (int i = 0; i < img.length; i++) {
			System.out.println("이미지: "+img[i]);
			try {
				Thread.sleep(3000); //3초
			} catch (InterruptedException e) { // 외부자원을 연결할 경우 예외처리를 해야됨 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

