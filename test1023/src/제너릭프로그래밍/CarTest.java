package 제너릭프로그래밍;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car<String> c1 = new Car<>("BIG"); //String
		System.out.println(c1.getSize());
		
		Car<Integer> c2 = new Car<>(100); //Integer
		System.out.println(c2.getSize());
		
		Car<VO> c3 = new Car<>(new VO()); //주소값을 넣어야 한다.
		System.out.println(c3.getSize());
		
		ArrayList<VO> list = new ArrayList<>();
		list.add(new VO());
		System.out.println(list);
	}

}
