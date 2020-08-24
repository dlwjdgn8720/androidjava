package 배열응용;

import java.util.Random;

public class 임의의값100개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random r = new Random();
    int[] num = new int[100];
    for (int i = 0; i < num.length; i++) {
		num[i] = r.nextInt(100);
		
	}
    for (int i : num) {
		System.out.println(i);
	}
    int result = num[0] + num[99];
    System.out.println("더한 값:"+ result);
	}

}
