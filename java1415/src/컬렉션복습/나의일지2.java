package 컬렉션복습;

import java.util.ArrayList;

import 컬렉션복습.파일로저장;

public class 나의일지2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		나의일지 day1 = new 나의일지("자바공부", 10, "강남");
		나의일지 day2 = new 나의일지("여행", 15, "울산");
		나의일지 day3 = new 나의일지("운동", 11, "경기");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	    ArrayList<나의일지> list = new ArrayList<나의일지>();
	    list.add(day1);
	    list.add(day2);
	    list.add(day3);
	    
	    파일로저장 file = new 파일로저장();
	    file.save(list);
	}		


}
