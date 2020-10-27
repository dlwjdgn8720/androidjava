package 제너릭프로그래밍;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] y = new int[3];
		for(int i =0; i<3; i++) {
		 y[i] = r.nextInt(100) + 1;
		 System.out.print(y[i]+" ");
		}
	}

}
