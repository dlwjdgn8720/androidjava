package 컬렉션;

import java.util.HashSet;

public class 중복제거목록 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet bag = new HashSet(); //중복제거
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("휴지");
	    System.out.println(bag.size());
	    System.out.println(bag);
	}

}
