package 배열응용;

public class 최대값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 55, 11, 22, 99, 33 };
		// 해당 인덱스까지의 최댓값을 저장해두기로함.
		int max = num[0];
		int min = num[4];
		for (int i = 1; i < num.length; i++) { // 이전까지의 최댓값은 max에 들어있음.
												// 배열의 인덱스의 값을 하나씩 꺼내서 이전까지의
												// 최댓값보다 큰지 비교
			if (max < num[i]) { // 해당 인덱스의 값이 이전까지의 최댓값보다 더 크면
				max = num[i]; // 해당 인덱스의 값을 최대값 변수에 저장
			}
			if( min > num[i]) {
				min = num[i];
			}

		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
