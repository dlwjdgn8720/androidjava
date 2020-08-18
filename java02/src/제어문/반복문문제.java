package 제어문;

public class 반복문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //1) 100부터 1까지 프린트
		int start = 100;
		int end = 1;
		//int add = 1;
		while(start >= end) {
			System.out.println(start);
			//start = start - add;
			start--; //증감연산자
		}
		
		//2) 5부터 10까지 프린트
		int start1 = 5;
		int end1 = 10;
		//int add1 = 1;
		while( start1 <= end1) {
			System.out.println(start1);
			//start1 = start1 + add1;
			start1++; // 증감 연산자
		}
		// 3)1부터 100까지 중 2씩 증가하면서 프린트!
		int start2 = 1;
		int end2 = 100;
		int add2 = 2;
		while(start2 <= end2) {
			System.out.println(start2);
			start2 = start2 + add2;
		}

		
	}

}
