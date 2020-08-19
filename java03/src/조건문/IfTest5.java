package 조건문;

import javax.swing.JOptionPane;

public class IfTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 0,money2=0; // 입금
		int out_money = 0 ,out_money2=0; // 출금
		int re_money = 0; // 잔고

		while (true) {
			String str = JOptionPane.showInputDialog("1)입금 2)출금 3)잔고 4)종료");

			if (str.equals("1")) { // 입금 
				String x = JOptionPane.showInputDialog("입금액 입력");
				int x2 = Integer.parseInt(x);
				money2 = x2;
				money = money2 + money; // 입금 합산
				System.out.println("입금액입력:" + money);
			} else if (str.equals("2")) { // 출금
				String y = JOptionPane.showInputDialog("출금액 입력");
				int y2 = Integer.parseInt(y);
                out_money2 = y2;
                out_money = out_money2 + out_money; // 출금 합산
				System.out.println("출금액입력:" + out_money);
			} else if (str.equals("3")) { // 잔고
			
				re_money = money - out_money; // 총 잔고
				System.out.println("잔고:" + re_money);

			} else if (str.equals("4")) { // 종료
				System.out.println("시스템을 종료합니다");
				System.exit(0);
				}
             }
		}

}
