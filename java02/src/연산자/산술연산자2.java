package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		// 더하기
		int sum = x + y; //자바에서는 int끼리의 계산은 무조건 int(4바이트)
		System.out.println(sum);
		double div = y / x; //double(8바이트) <- 4바이트 int
		System.out.println(div); //자바에서는 하나라도 double 이면 무조건 double!
		//하나만 정수를 실수로 강제로 변환해서 계산 시 사용할 수 있다.
		//강제로 타입을 바꾸는 것 : 타입변환(형변환)
		double div2 = (double)y / x;
		System.out.println(div2);
		
		double div3 = (double)(y / x);
		System.out.println(div3);
		
		
		

	}

}
