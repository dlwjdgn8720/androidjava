package 배열의응용;

import java.util.Scanner;

public class 신체검사등급 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_not = 0;
		int count_yes = 0;
		int score = 0;
		while(true) {
	    Scanner scan = new Scanner(System.in);
	    
	    
	    System.out.print("주민번호:");
		String jumin = scan.next();

		System.out.print("키:");
		double tall = scan.nextDouble();

		System.out.print("몸무게:");
		double weight = scan.nextDouble();

		System.out.print("시력:");
		double eye = scan.nextDouble();

		System.out.print("병명:1)없음 2)평발 3)고혈압");
		int sick = scan.nextInt();
		double BMI = weight / ((tall / 100) * (tall / 100));

		if (tall < 150 || tall > 190 || BMI >= 30 || eye <= 0.0) {
			System.out.println(jumin + "는 면제입니다");
			count_not++;
		} else {
			if (tall >= 150 && tall <= 190) {
				score = score + 20;
			}
			if (weight >= 35 && weight <= 100) {
				score = score + 20;
			}
			if (eye == 1.0) {
				score = score + 30;
			} else if (eye == 0.5) {
				score = score + 20;
			} else if (eye == 0.1) {
				score = score + 10;
			}
			if (sick == 1) {
				score = score + 30;
			} else if (sick == 2) {
				score = score + 20;
			} else if (sick == 3) {
				score = score + 10;
			}
			count_yes++;
			System.out.println("해당스코어가 40점 이상이므로"+jumin+"는 현역입니다.");
			System.out.println("점수:" +score);
			System.out.println("현역 대상자:"+count_yes+"명");
			System.out.println("면제 대상자:"+count_not+"명");
			System.out.println("대상자들의 총 평균점수:"+(score)/(count_yes+count_not)+"점");
			System.out.print("시스템을 종료를 하실라면 종료를 입력하시거나 시스템을 더 하실경우 아무거나 입력하시오");
		    String quit = scan.next();
		    if(quit.equals("종료")) {
		    	System.out.println("시스템을 종료합니다");
		    	break;
		    }
		}
		}
		

	}

}
