package 컬렉션;

import java.util.LinkedList;

public class 시험일정큐형태 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.println("전체 시험볼 과목: "+subject);
		for (int i = 0; i <= subject.size(); i++) {
			subject.remove();
			System.out.println(i+1+"일차 시험본 후 남은 과목: "+subject);
		}
	}

}
