package 배열응용;

public class 점수리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int[] one_score = { 100, 99, 77, 87, 66 };
		int[] two_score = one_score.clone();
		two_score[2] = 44;
		two_score[4] = 55;
		int average1 = 0;
		int average2 = 0;
		int average3 = 0;
		int average4 = 0;
		int count = 0;
		for (String x : names) {
			System.out.print("\t" + x + "\t");
		}
		System.out.println();
		System.out.print("1학기 ");
		for (int x : one_score) {
			System.out.print("\t" + x + "\t");
		}
		System.out.println();
		System.out.print("2학기 ");
		for (int x : two_score) {
			System.out.print("\t" + x + "\t");
		}
		System.out.println();
		for (int i = 0; i < two_score.length; i++) {
			if (one_score[i] != two_score[i]) {
				count++;
			}
		}
		System.out.println("점수가변경된 과목의수: " + count);
		for (int i = 0; i < one_score.length; i++) {
			average1 = average1 + one_score[i];
			average2 = average1 / one_score.length;
			average3 = average3 + two_score[i];
			average4 = average3 / two_score.length;
		}
		if (average3 > average4) {
			System.out.println("평균이 높은학기 :1학기");
		} else {
			System.out.println("평균이 높은학기 :2학기");
		}
		for (int i = 0; i < two_score.length; i++) {
			if (one_score[i] != two_score[i]) {
				System.out.println("변경된 과목명:" + names[i]);
			}
		}

	}

}
