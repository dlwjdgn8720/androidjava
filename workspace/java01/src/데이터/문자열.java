package 데이터;

public class 문자열 {
	//코드 자동 정리 : ctrl + shift + f
	public static void main(String[] args) {
          //기본데이터는 아닌데, 사람이 워낙 많이쓰는 데이터의 형태이므로 
		  //기본데이터처럼 쓰게 해놓은 문자열을 나타내는 키워드 : String
		String name = "홍길동"; //String은 name 이라는 변수에 들어갈 데이터의 유형
		                      //data type(자료형)
		String company = "메가더조은";
		int age = 100;
		String subject; //선언! =>메모리가 할당
		subject="자바"; // 값을 넣음,대입연산자,할당연산자(=)
		String day = "월요일";
		
		
		System.out.println(name + "은" + company + "소속이다");
		// + : 하나라도 String 이면 모두다 String 결합의의미
		System.out.println(name + "의 나이는"+ age);
		System.out.println("내 과목은"+ subject);
		
		
		
		System.out.println(day); //쓰레기값 상태인 경우,연산도 안되고,출력도 안됨.
		
		
	}
}
