package 제어문;

import javax.swing.JOptionPane;

public class 조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = JOptionPane.showInputDialog("먹고싶은 음식은?");//입력
        
        
        //처리
        String result = "";
        if(str.equals("아이스크림")) {
        	result= "뚜레주르";
        }
        else if(str.equals("아이스커피")) {
        	result="이디야";
        }
        else {
        	result="물";
        	
        }
        //출력
        System.out.println(result);
	}

}
