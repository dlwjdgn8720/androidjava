package 제어문;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //조건이 여러개일때 if~else if ....~ else
		        //조건이 연관되자않고 여러조건을 쓰고싶을때  if if if if
		int jumsu = 65;
		
	    if(jumsu >= 90) {
			System.out.println("A");
		}
		else if(jumsu >= 80) {
			System.out.println("B");
		}
		else if(jumsu >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}

}
