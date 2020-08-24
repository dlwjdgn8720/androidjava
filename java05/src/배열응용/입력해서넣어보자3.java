package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력을 받아서, 저장공간에 넣어두었다가
		// 나중에 꺼내서, 연산이나 출력을 하고자 하는 경우
		//String data = null; //참조형은 초기화를 null로 초기화시켜줘라
		//String data2 = null, data3 = null;
		Random r = new Random(); //아무거나 만들어주는 클래스
		int[] data = new int[1000];
		for(int i = 0; i<1000; i++) {
			//변수 선언의 위치가 변수를 사용할수 있는 범위(지역)을 결정!
			data[i] = r.nextInt(100); //100보다 작은수 랜덤하게 출력
			
		}
		for (int x : data) {
			System.out.println(x);
		}
			
		}
		

}
