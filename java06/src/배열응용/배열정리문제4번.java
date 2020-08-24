package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제4번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] num = new int[5];
       for (int i = 0; i < num.length; i++) {
		String str = JOptionPane.showInputDialog("숫자입력");
		int num2 = Integer.parseInt(str);
		num[i] = num2;
		System.out.println(i+"번쨰의값은 "+num2);
	}
	}

}
