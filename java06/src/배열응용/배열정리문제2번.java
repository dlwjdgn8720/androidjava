package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] str = new String[3];
       for (int i = 0; i < str.length; i++) {
		   String str2 = JOptionPane.showInputDialog("과목을 입력");
		   str[i] = str2;
	}
       System.out.println(str[0]+"보다는"+str[1]);
      
	}

}
