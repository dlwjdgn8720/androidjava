package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 창을 띄워서 입력을 받아보자
		// 창을 띄워서 출력을 해보자
		// 자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
		// 특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할 때 
		// 부품을 지정함.
	    String name = JOptionPane.showInputDialog("당신의 이름은"); //js prompt창
	    // name 이라는 변수에 prompt창을 나타내는 함수를 넣는다.
	    System.out.println("당신의 이름은: "+name);
	    // name 이라는 변수를 출력한다.
	    String age = JOptionPane.showInputDialog("당신의 나이는");
	    // age 이라는 변수에 prompt창을 나타내는 함수를 넣는다.
	    
	    //키보드로 입력한 데이터 타입은 무조건 String
	    //String으로 저장된 데이터를 int/String쓸지는 내가 결정!
	    //계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야함.
	    //숫자로 바꿔보자!!
	    int age2 = Integer.parseInt(age);//문자를 숫자로 바꿔주는 함수(CPU가 처리)
	    //age이라는 String 변수를 정수화 시켜 age2라는 변수로 넣어준다.
	    int lastAge = age2 - 1;
	    //작년나이를 출력하기 위해 -1을해준다.
	    System.out.println("당신의 작년 나이는 "+lastAge);
	    //작년 나이를 출력한다.
             
	}

}






