package 제어문;

public class 반복문2 {

	public static void main(String[] args) {
		// 정해진 횟수 만큼 반복해보자
		int start = 5; //시작값
		//Ram에 start변수 저장
		int end = 10; //끝값
		//Ram에 end변수 저장
		int add = 1; //증가값
		//Ram에 add변수 저장
		int i;
		int sum = 0;
		
		
		while(start <= end) { // () : 조건문 조건이 true일때까지 게속 돌려줌 ... false일때 while문 밖으로 나감
			System.out.println(start); // 조건이 true 면 start 값 넣어주고 출력
			start = start + add; // start 값에 add값을 더해주고 더한값을 start 변수에 넣어줌
		}
		
		
		
	
	}

}
