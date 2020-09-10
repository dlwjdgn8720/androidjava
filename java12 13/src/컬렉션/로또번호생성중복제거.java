package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호생성중복제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		HashSet set = new HashSet();
//		while(set.size() < 6) {
//		     set.add(r.nextInt(45)+1);
//			
//			
//		}
//		System.out.println(set);
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45)+1;
			System.out.println(num);
			if(set.contains(num)) {
				i--;
			}
			else {
				set.add(num);
			}
		}
		System.out.println(set);
     }

}
