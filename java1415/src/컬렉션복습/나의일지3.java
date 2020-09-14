package 컬렉션복습;

import 컬렉션복습.나의일지;

public class 나의일지3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		나의일지 day1 = new 나의일지("자바공부", 10, "강남");
		System.out.println(day1.count + "개 생성됨.");
		System.out.println(나의일지.sum + "시간 누적됨");
		나의일지 day2 = new 나의일지("여행", 15, "울산");
		System.out.println(day2.count + "개 생성됨.");
		System.out.println(나의일지.sum + "시간 누적됨");
		나의일지 day3 = new 나의일지("운동", 11, "경기");
		System.out.println(day3.count + "개 생성됨.");
		System.out.println(나의일지.sum + "시간 누적됨");

		System.out.println("평균시간은" +나의일지.sum/나의일지.count+"시간");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);

	}

}
