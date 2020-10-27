package 제너릭프로그래밍;

import java.util.Random;

public class test3 {
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] x = new int[100];
		int sum = 0;
		for(int i=0; i < x.length; i++) {
			  x[i] = r.nextInt(100)+1;
			  if(x[i] % 2 == 1) {
				 sum += x[i];
			 }
		}
		System.out.println(sum);
	}

}
