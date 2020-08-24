package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력을 받아서, 저장공간에 넣어두었다가
		// 나중에 꺼내서, 연산이나 출력을 하고자 하는 경우
		//String data = null; //참조형은 초기화를 null로 초기화시켜줘라
		//String data2 = null, data3 = null;
		int[] data = new int[3];
		
		for(int i = 0; i<3; i++) {
			//변수 선언의 위치가 변수를 사용할수 있는 범위(지역)을 결정!
			String s = JOptionPane.showInputDialog("숫자입력");
			data[i] = Integer.parseInt(s);
			
		}
		for (int x : data) {
			System.out.println(x);
		}
			
		}
		

}
