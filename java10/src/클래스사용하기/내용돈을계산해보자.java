package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 내용돈을계산해보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		용돈계산기 cal = new 용돈계산기();
		int money = 100000;
		int month = 6;
		
		int mul = cal.mul(month, money);
		
		if(mul >= 500000) {
			System.out.println("금액: "+mul+"원");
		}
		else {
			System.out.println("금액: "+(mul+150000)+"원");
		}
		
		System.out.println("-----------------------");
		
		int f = 600000;
		int s = 500000;
		int sum = cal.add(f, s);
		System.out.println("일년 동안 받은 용돈: " +sum+"원");
		
		
		
	}

}
