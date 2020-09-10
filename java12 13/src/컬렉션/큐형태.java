package 컬렉션;

import java.util.LinkedList;

public class 큐형태 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.add("내일우유");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		milk.remove();//앞에들어간것이 먼저 삭제 
		System.out.println("----------");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		
		milk.remove();//앞에들어간것이 먼저 삭제 
		System.out.println("----------");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
	}

}
