package 반복문;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //시작 값 , 조건식, 증감 값 
            for(int i=0; i<5; i++) {
            	// 조건이 만족했을때,비교연산자의 결과가 true!일때 
            	// 실행 내용
            	for(int j=0; j<i+1; j++) {
            		System.out.print("*");
            	}
            	
           
            	System.out.println("");
            }
	}

}
