package 복습;

import javax.swing.JOptionPane;

public class 입력5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = new int[5];
		
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("점수입력");
			jumsu[i] = Integer.parseInt(data);
		}
		int sum = 0;
		int average = 0;
		
		for(int i =0; i<jumsu.length; i++) {
			sum = sum + jumsu[i];
//i=0         10  =  0   +  10
//i=1         30    = 10   +  20
		average = average + jumsu[i] / jumsu.length; 
		    System.out.println(average);
     }

}
}
