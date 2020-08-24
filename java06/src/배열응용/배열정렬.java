package 배열응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		// 파괴함수(0),비파괴함수
		int[] age = { 99, 10, 100, 88, 33, 24, 10, 77 };
		// 비파괴함수
		int[] age2 = age.clone(); // 배열 복사할때는 clone()함수 사용!
		//깊은복사,배열은 깊은 복사를 해야한다.
		//깊은복사를 해야 배열은 따로 따로 만들어진다.
		
		for(int x:age) {
			System.out.print(x+"\t");
		}
		System.out.println();
		age2[0] = 999;
		for(int x:age2) {
			System.out.print(x+"\t");
		}
		System.out.println("\n------------------------------");

		Arrays.sort(age); // 부품 (오름차순 정렬),파괴함수
		
		for (int x : age) {
			System.out.print(x + " ");
		}

	}

}
