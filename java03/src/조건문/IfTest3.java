package 조건문;

import javax.swing.JOptionPane;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     while(true) {
    	 String str = JOptionPane.showInputDialog("긍정,부정,기타,종료");
    	 if(str.equals("긍정")) {
    		 System.out.println("긍정");
    	 }
    	 if(str.equals("부정")) {
    		 System.out.println("부정");
    	 }if(str.equals("기타")) {
    		 System.out.println("기타");
    	 }
    	 
    	 if(str.equals("종료")) {
    	   break;
    	 }
     }
	}

}
