package 배열기본;

public class 값이정해져있는경우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] jumsu = new int[10];//나중에 값을 집어 넣는 경우
     jumsu[0] = 100;
     jumsu[9] = 100;
     
     //저장 공간이 만들어지는 순간 저장할 값이 정해져 있는 경우
     //공간 만들자마자,초깃값을 정해진 값으로 바로 넣을 수 있다.
     int[] jumsu2 = {100,200,300};
//     for(int i=0; i < jumsu.length; i++) {
//    	 System.out.println(i+ ":" + jumsu[i]);
//     }
//     for(int i=0; i < jumsu2.length; i++) {
//    	 System.out.println(i+ ":" + jumsu2[i]);
//     }
     //foreach:배열의 첫위치값으로부터 하나씩 오른쪽 가면서 자동으로
     //꺼내주는 반복문, length보다 작을 때 까지
     //꺼낼때만 쓰고, 배열의 값을 넣을때는 사용 불가
     for (int x : jumsu) { // foreach 100,0,0.......,100 x는 임시변수
		System.out.println(x);
	}
	}

}
