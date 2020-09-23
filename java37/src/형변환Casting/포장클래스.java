package 형변환Casting;

public class 포장클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 포장클래스(Wrapper class)
		// 기본형에 대한 추가적인 기능을 붙여서
		// 클래스로 만들어 놓은 것.
		// int -> Integer(클래스)
		// double -> Double(클래스)
		// char -> Character(클래스)
		// boolean -> Boolean(클래스)
		int x = 100;
		Integer y = new Integer(200);
		x = y; //기본형과 포장클래스간에는 자동으로 변환
		//기본형 <- 참조형 : 오토 언박싱(auto unboxing)
		y = x;
		//참조형 <- 기본형 : 오토 박싱(auto boxing)
		

	}

}
