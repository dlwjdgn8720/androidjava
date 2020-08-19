package 조건문;

import javax.swing.JOptionPane;

public class 연습문제1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("숫자1");
		String num2 = JOptionPane.showInputDialog("숫자2");
		String operator = JOptionPane.showInputDialog("+,-,*,/");
		int num4 = Integer.parseInt(num1);
		int num5 = Integer.parseInt(num2);

		switch (operator) {
		case "+":
			int sum = num4 + num5;
			System.out.println(sum);
			break;
		case "-":
			int minus = num4 - num5;
			System.out.println(minus);
			break;
		case "*":
			int multi = num4 * num5;
			System.out.println(multi);
			break;
		case "/":
			int div = num4 / num5;
			System.out.println(div);
			break;
		default:
			System.out.println("잘못된 입력입니다.");

		}
	}

}
