package 배열의응용;

import java.util.Scanner;

public class 극장예매시스템 {

	public static void main(String[] args) {
		int[][] seat = new int[3][10]; // 3행
		Scanner scan = new Scanner(System.in);
		char a = 'A';


		System.out.println("극장 좌석");

		System.out.println("--------------------------");

		while (true) {
			System.out.print("  ");
			for (int i = 0; i < 10; i++) { // 좌석 순번
				System.out.print(i + " ");
			}
			System.out.println();

			for (int i = 0; i < seat.length; i++) { // 좌석 마다 자리 표현
				System.out.print((char)(a + i) + " ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println("--------------------------");
			System.out.print("원하시는 좌석을 입력해주세요(종료하실라면 종료를 입력하세요):");

			String choice = scan.next();
			// System.out.println(choice);

			if (choice.equals("종료")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				int f = Integer.parseInt(choice.substring(0, 1)); 
				int s = Integer.parseInt(choice.substring(1, 2));  
				if (seat[f][s] == 1) {
					System.out.println("이미 예약된 좌석입니다.");  // 1이 채워졌을 경우 예약 방지
				} else if (seat[f][s] == 0) {
					seat[f][s] = 1;
					System.out.println("예약되었습니다.");   // 0일 경우 1을 채워졌을때 예약 
				}
			}
		}

	}

}
