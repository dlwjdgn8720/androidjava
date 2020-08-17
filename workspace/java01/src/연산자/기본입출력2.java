package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 두 수를 입력받아서
		// ctrl + alt + 화살표아래: 한줄복사
		// alt + 화살표방향 : 이동
		// 2. int로 변환한 후,
		// 3. 더한 다음
		// 4. 더한 결과값 출력
	    String x = JOptionPane.showInputDialog("숫자 1");
		String y = JOptionPane.showInputDialog("숫자 2");
		
		
		int x2 = Integer.parseInt(x);
		int y2 = Integer.parseInt(y);
		
		int sum = x2 + y2;
		System.out.println("더한 값="+sum);
	}

}
