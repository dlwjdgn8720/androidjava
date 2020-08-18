package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 2개의 숫자를 입력받아서 사칙연산을 해보세요
		int sum;
		String x = JOptionPane.showInputDialog("숫자1"); // 입력
		String y = JOptionPane.showInputDialog("숫자2"); // 입력
		int z = Integer.parseInt(x); //처리
		int k = Integer.parseInt(y); //처리
		
		sum = z+k; // 처리
		
		JOptionPane.showMessageDialog(null, sum); // 출력
		
		
		//2.숫자 입력을 2개 받아서 시작값 5,종료값 1000이면 5~1000까지 프린트
		
		String num = JOptionPane.showInputDialog("시작값");
		String num2 = JOptionPane.showInputDialog("종료값");
		int num_1 = Integer.parseInt(num);
		int num_2 = Integer.parseInt(num2);
		
		//if(num_1 ==5 && num_2 == 1000) {
		//for(int i = 5; i<=1000; i++) {
			//System.out.println(i);
		 //}
		 //}
		for(int i = num_1; i<=num_2; i++) {
			System.out.println(i);
		}
		
		//3.숫자 1개를 입력을 받고, 문자 1개를 입력받아서 입력한 숫자 개수만큼 문자를 프린트
		
		String num3 = JOptionPane.showInputDialog("숫자");
		String str = JOptionPane.showInputDialog("문자");
		int num_3 = Integer.parseInt(num3);
		
		for(int i =0; i<num_3; i++) {
			System.out.print(str);
		}
		
	    
	
		
		
		
		
		
		
		
		
		

	}

}
