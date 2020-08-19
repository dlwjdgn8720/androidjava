package 조건문;

import javax.swing.JOptionPane;

public class IfTest4 {

	public static void main(String[] args) {
       //무한루프, 입력을 받아서, 정답이면 축하합니다! 하고 종료
       //정답이 아니면 계속 입력을 받아서 확인
		int again_target=0, target=0 ,total_target=0;
		int target2 = 88;
       
       while(true) {
    	   String str = JOptionPane.showInputDialog("타깃숫자를 맞춰보세요"); //문자 입력
    	   int str2 = Integer.parseInt(str);//문자 정수화
    	   total_target++;//전체 시도 한 횟수 
    	   
    	    if(str2 == target2) { // 맞출때 
    		    System.out.println("축하합니다");
    		    target++; // 맞춘횟수
    		    break;
    		}
    	    else { // 틀릴때
    	    	again_target++; // 틀린 횟수
    	    	System.out.println("정답이 아닙니다!");
    	    	if(str2 > target2) { // 값이 큰지 작은지 구별
    	    		System.out.println("너무커요");
    	    	}
    	    	else {
    	    		System.out.println("너무작아요");
    	    	}
    	   }
        }
       System.out.println("틀린횟수 :"+again_target); // 틀린 횟수 출력
       System.out.println("맞춘횟수 :"+target);// 맞춘 횟수 출력
       System.out.println("시도한 횟수 :"+total_target);// 시도한 횟수 출력
       
   }

}
