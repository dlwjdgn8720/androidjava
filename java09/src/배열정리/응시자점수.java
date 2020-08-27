package 배열정리;

public class 응시자점수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[4][];
		int[] kor = { 50, 60, 70, 80, 90 };
		int[] math = { 66, 77, 88 };
		int[] english = { 90, 80, 70, 60 };
		int[] science = { 77, 100 };

		score[0] = kor;
		score[1] = math;
		score[2] = english;
		score[3] = science;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}

	}
}
