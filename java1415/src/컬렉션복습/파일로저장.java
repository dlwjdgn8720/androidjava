package 컬렉션복습;

import java.io.FileWriter;

import java.util.ArrayList;

import 컬렉션복습.나의일지;

public class 파일로저장 {

	public void save(ArrayList<나의일지> list) {
		// TODO Auto-generated method stub
        // 외부에서 데이터를 받아서 파일로 저장하고싶음
		System.out.println(list.size()+"일치가 넘어왔음.");
		for (int i = 0; i < list.size(); i++) {
			//컨테이너 역할인 list에서 하나씩 꺼내는 부분
			나의일지 day= list.get(i);
			System.out.println("전달된 일과:"+day);
			System.out.println("------------------------");
			//파일로 저장할 예정 => 예외처리
			try {
				//파일로 만들어서 저장하는 부품써야함.(기본생성자를 제공하지않는 클래스)
				FileWriter file = new FileWriter(i+ ".txt");
				file.write(day.doing +"\n");
				file.write(day.time +"\n");
				file.write(day.location +"\n");
				file.close(); //파일에다가 다 썼음.
			} catch (Exception e) {
				//try내에 있는 코드에서 에러가 발생했을 때, 대응처리 내용을 써줌.
				System.out.println("파일로 저장하다가 에러가 발생함!!!!");
			}
			
		}
	}
	public void accsave(ArrayList<계좌> account) {
		for (int i = 0; i < account.size(); i++) {
			계좌 account1 = account.get(i);
			System.out.println("전달된 계좌:"+ account1);
			System.out.println("=============================================");
			try {
				FileWriter file = new FileWriter(account1.name+".txt");
				file.write(account1.name+"\n");
				file.write(account1.field+"\n");
				file.write(account1.money+"\n");
				file.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("파일저장에러");
			}
		}
	}

}
