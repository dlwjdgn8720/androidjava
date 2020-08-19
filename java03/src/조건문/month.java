package 조건문;

public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 13;
		if (month < 13) {    //정수(byte,short,int)
			switch (month) {

			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "월은 30일까지입니다.");
				break;
			case 2:
				System.out.println(month + "월은 28일까지입니다.");
				break;
			default:
				System.out.println(month + "월은 31일까지입니다.");
				break;
			}
		} else {
			System.out.println("잘못된 숫자입니다.");
		}
	}

}
