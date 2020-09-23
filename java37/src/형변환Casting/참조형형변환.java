package 형변환Casting;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
        // 상속관계에서만 형변환(Casting,캐스팅) 가능
		//Car(부모,수퍼),Truck(자식,서브)
		//클래스간의 대소비교할 때는 개념적으로 접근
		//부모클래스가 크고,자식클래스가 작다
		ArrayList list = new ArrayList();
		//모든 타입을 묶을 수 있음. 크기가 유동
		list.add("홍길동");
		//Object(큰) <- String(작) : 자동형변환
		//업캐스팅
		list.add(100); //업캐스팅
		//Object <----- (upcasting) ---- Integer <----(auto boxing)-----int    기참 오토 박싱
		list.add(11.22); //업캐스팅
		list.add(true); //업캐스팅
		list.add('A'); //업캐스팅
		list.add(new VO()); //업캐스팅(박싱은 이루어지지 않음)
		System.out.println("목록내용: "+list);
		
		//업캐스팅(자동형변환)으로 String을 Object으로 형변환하여 넣은 것은
		//꺼냈을 때 Object으로 꺼내면 String에서 추가된 기능을 쓸 수 없다.
		//꺼낼 때, String으로 형변환해야 꺼내야 한다.
		//강제형변환,down casting(다운 캐스팅)
		String name = (String) list.get(0);
		int age = (Integer) list.get(1);
		//기본형 <-- 오토 언박싱 <-- Integer <-- 다운캐스팅 <--Object   참기 오토 언박싱
		
		
	}

}
