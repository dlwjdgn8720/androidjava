package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ok = 0 , no = 0 , etc = 0; // 누적 시키는 변수는 반복문 안에 넣어주면 안된다.
		                               // 반복할때마다 누적하지 않고, 초기화 되기 때문에!
		                               // 무한루프로 수정해보세요 , 입력을 긍정,부정,기타,종료 중 선택!
		
		for (int i = 0; i < 5; i++) {
			
			String data = JOptionPane.showInputDialog("ok)긍정,no)부정,etc)기타");
			if (data.equals("ok")) {
				System.out.println("긍정");
				ok++; //증감연산자
				//ok = ok + 1;
				
			} else if (data.equals("no")) {
				System.out.println("부정");
				no++;
				//no = no + 1;

			} else {
				System.out.println("잘모르겠어요");
				etc++;
				//etc = etc + 1;
			}
		}
		System.out.println("긍정횟수: "+ok+"회");
		System.out.println("부정횟수: "+no+"회");
		System.out.println("잘모르겠음횟수: "+etc+"회");

	}

}
