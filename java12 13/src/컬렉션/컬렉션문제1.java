package 컬렉션;

import java.util.ArrayList;

public class 컬렉션문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		//System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등:" + list.get(i));
		}
	
		list.remove(1);
		System.out.println("----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등:" + list.get(i));
		}
	}

}
