package 배열응용;

public class 배열정리문제3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] num = {11,22,33,44};
     int target = 33;
     for (int i = 0; i < num.length; i++) {
		if(num[i] == target) {
			System.out.println(target+"의 위치는 "+i);
		}
	}
     
	}

}
