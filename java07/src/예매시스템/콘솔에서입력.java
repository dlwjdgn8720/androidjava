package 예매시스템;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 콘솔에서 입력:Scanner
		Scanner scan = new Scanner(System.in);
//		System.out.print("이름을 입력 >> ");
//		String str = scan.next();
//		System.out.println("이름: "+str);
//		System.out.print("나이를입력>> ");
//		int y = scan.nextInt(); // int <-- String입력
//		System.out.print("내년나이는"+(y+1)+"년");
		
		
//		System.out.print("현재 키 입력:");
//		double z = scan.nextDouble();
//		System.out.println("내년 키는"+(z+20));
		System.out.print("밖에 비가 오나:");
		boolean k = scan.nextBoolean();
		if(k) {
			System.out.println("우산을가지고 가자");
		}
		else {
			System.out.println("우산을 놓고 가자");
		}
		System.out.print("당신의 목표는>>");
		scan.nextLine();
		String life = scan.nextLine();//엔터치기까지의 문장
		System.out.print("목표는" +life);
		
		//현재 키 입력: 150.5
		//내년키는 170.5
		
		//밖에 비가 오나 :true
		//true이면,우산을 가지고 가자
		//false이면,우산을 놓고 가자
	}

}
