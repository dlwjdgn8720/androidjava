package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //게속 반복하고자하는 경우
		
		 while(true) { 
			 System.out.println("내가 계속 돌아간다");
			 String choice = JOptionPane.showInputDialog("계속하실래요 yes or no");//외부입력은 모두 String
			 if(choice.equals("n") || choice.equals("no")) { // String은 클래스이므로 .equals 사용
				 System.out.println("프로그램을 종료합니다.");
				 System.exit(0); // 프로그램 종결
				 //break; // while 반복문을 종료, while아래에 있는 것들은 계속 실행
			 }
			 
		 }
		 //System.out.println("내가 실행될까요...");
		 
		
		 
		 // 제한된 횟수를 반복하고자 하는 경우
		
		
		/*
		 * int i = 0; // 시작값 while(i<10) { //조건식 System.out.println("내가 10번 돌아요."); //
		 * 실행내용 i++;
		 * 
		 * }
		 */
	}

}
