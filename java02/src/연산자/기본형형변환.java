package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		 //큰 <- 작:자동형 변환
       int x = 100; // int는 -21억 ~ 21억 , 4바이트
       byte y = 120; // byte는 -128 ~ 127, 1바이트
       x = y;
       System.out.println("x: " +x);
       int z = 127;
       //작 <-큰 : 강제형변환()를 사용
       //(자르고싶은 데이터형)변수명
       byte w = (byte)z;
       
       int q = 1000;
       byte t = (byte)q;
        
		
		
       
	}

}
