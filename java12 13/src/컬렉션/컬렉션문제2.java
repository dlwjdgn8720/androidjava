package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;

public class 컬렉션문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String,String>> cus = new ArrayList<HashMap<String,String>>();
		HashMap<String,String> cus1 = new HashMap<String,String>();
		
		cus1.put("100", "김데이");
		cus1.put("200", "김사전");
		cus1.put("300", "김구조"); 
		cus1.put("400", "김자료");
		
		System.out.println(cus1);
		System.out.println("---------------------------------------------------");
		cus1.remove("200");
		cus1.put("300","김충성");
		
		System.out.println(cus1);
		
	}

}
