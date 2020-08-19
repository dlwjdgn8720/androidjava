package 조건문;

import javax.swing.JOptionPane;

public class IfTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,count2=0,count3=0;
    while(true) {
    	String str = JOptionPane.showInputDialog("1:아이유 , 2:유재석, 3:방탄 ,4:종료");
    	if(str.equals("4")) {
    		System.out.println("투표종료");
    		break;
    	}
    	else if(str.equals("1")) {
    		System.out.println("아이유");
    		count++;
    	}
    	else if(str.equals("2")) {
    		System.out.println("유재석");
    		count2++;
    	}
    	else if(str.equals("3")) {
    		System.out.println("방탄");
    		count3++;
    	}
    }
    System.out.println("아이유표: "+count);
    System.out.println("유재석표: "+count2);
    System.out.println("방탄표: "+count3);
	}

}
