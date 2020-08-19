package 조건문;

public class 성별판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880115-1056512"; // char 14글자 7번째 자리 추출
		// 프로그램 언어로 문자를 char로 받을수 있는 방법은 없다.
		// String으로 입력을 받아서, 원하는 char만 추출을 함.
		char gender = ssn.charAt(7); // 위치를 가지고 특정한 문자 한개를 추출
										// 위치 = index,인덱스
										// 인덱스 0부터 시작
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못된 입력입니다.");

		}
	}

}
