package DB연결;

import java.util.Date;
import java.util.Random;

public class 반환값사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     반환값연습 cal = new 반환값연습();
     int x = cal.add(1, 2);
     double y = cal.add(1.2, 2);
     int[] z = cal.add(1);
     String k = cal.add("hi", 1);
     Date o = cal.add();
     boolean r = cal.add(true);
     
     System.out.println(x);
     System.out.println(y);
     for(int u:z) {
     System.out.println(u);
     }
     System.out.println(k);
     System.out.println(o);
     System.out.println(r);
	}

}
