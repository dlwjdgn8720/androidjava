package 조건문;

import javax.swing.JOptionPane;

public class IfTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s_t = 0, n_t = 0, count_s = 0, count_n = 0;

		while (true) {
			String str = JOptionPane.showInputDialog("스티커 or 노트를 입력하시오,다 선택하시면 종료를 입력하시오");
			if (str.equals("스티커")) {
				count_s++;
				s_t = count_s * 3000; // 스티커 총 금액
				
			} else if (str.equals("노트")) {
				count_n++;
				n_t = count_n * 5000; // 노트 총 금액
				
            }
             else if (str.equals("종료")) {
				break;
			}
			
		}
        int total = s_t + n_t; // 스티커금액 + 노트 금액
		if (total >= 25000) { // 총 금액이 25000원 넘길 시 
			total = total - 3000;
		}
		System.out.println("스티커 금액 :" + s_t);
		System.out.println("노트 금액 :" + n_t);
		System.out.println("총 결제금액: " + total);
	}

}
