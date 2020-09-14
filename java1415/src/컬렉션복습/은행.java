package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계좌 account1 = new 계좌("홍길동","정기적금",1000);
		//동적 메모리 할당
		//=>객체 생성시 마다 객체별로 멤버변수가 복사가 되어 변수가 생성
		
		계좌 account2 = new 계좌("김길동","정기예금",2000);
		계좌 account3 = new 계좌("최길동","정기적금",3000);
		계좌 account4 = new 계좌("이길동","정기예금",4000);
		계좌 account5 = new 계좌("서길동","정기예금",5000);
		ArrayList<계좌> account = new ArrayList<계좌>();
		account.add(account1);
		account.add(account2);
		account.add(account3);
		account.add(account4);
		account.add(account5);
		파일로저장 file = new 파일로저장();
		file.accsave(account);
		
		
		
	}

}
