package 예매시스템;

import java.util.Scanner;

public class 무한입력루프 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10];// 좌석마다 예매상황을 저장할 공간들
		int count = 0;

		while (true) {
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "  ");
			}
			System.out.println();
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();

			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1):");
			int choice = scan.nextInt();
			if (choice == -1) {
				System.out.println("프로그램종료!");
				System.out.println("총 예약된 자리:" + count);
				System.out.println("결제금액:" + count * 10000 + "원");
				break;
			}

			if (seat[choice - 1] == 0) { // 선택한 번호의 좌석을 예약처리
				seat[choice - 1] = 1;
				System.out.println("예약되었습니다");
				count++;

			} else {
				System.out.println("이미예약된자리입니다.");
			}

		}
	}
}
