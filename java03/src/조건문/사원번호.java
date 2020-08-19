package 조건문;

import javax.swing.JOptionPane;

public class 사원번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "A100EX";
		char str2 = num.charAt(0);
		String str3 = num.substring(1,4); // 인덱스 1 ~ 3 범위 추출이면 substring(1,4)써줌.
		                                  // endIndex는 3보다 1큰 4를 써줘야함.

		switch (str2) {
		case 'A':
			System.out.println("사원부서는 기획부입니다.");
			break;
		case 'B':
			System.out.println("사원부서는 총무부입니다.");
			break;
		case 'C':
			System.out.println("사원부서는 개발부입니다.");
			break;
		default:
			System.out.println("해당 부서 없음");
		}
		System.out.println("사원고유번호는 "+str3+"입니다.");
		
	}

}
