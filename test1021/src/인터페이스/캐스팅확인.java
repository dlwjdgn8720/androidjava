package 인터페이스;

import java.util.ArrayList;

public class 캐스팅확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList list = new ArrayList();
     //Object(큰)<--------String, 맨, 수퍼맨(작)
      //자동형변환(upcasting)
     list.add("등산");
     list.add(new man());
     list.add(new SuperMan());
     
     //Object(큰)----->String(작) 
     //강제형변환(downcasting)
     String l1 = (String) list.get(0);
     man m1 = (man)list.get(1);
     SuperMan m2 = (SuperMan)list.get(2);
     m2.eat();
     m2.run();
     m2.sky();
     
     Object m3 = list.get(2);
     //다운 캐스팅 하지 않으면 ,부모클래스로 접근 할 수 있는
     //메소드가 부모클래스가 상속한 메소드에 제약을 받음
     
     
	}

}
