package 배열응용;

import java.util.Random;

public class 최대값찾기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[1000];
		// 해당 인덱스까지의 최댓값을 저장해두기로함.
		Random r = new Random();

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		int max = num[0];
		int min = num[0];
		int count = 0;
		
		
		
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			} else {
				min = num[i];
			}
		}
		//int target = max;
		    
		for (int i = 0; i < num.length; i++) {
			    if(max == num[i]) {
				System.out.println(max+"의 위치는"+i);
				count++;
			}
		}
		
		
		

		System.out.println("최댓값:" + max);
		System.out.println("최솟값:" + min);
		System.out.println("max의 갯수:" + count);

	}

}
