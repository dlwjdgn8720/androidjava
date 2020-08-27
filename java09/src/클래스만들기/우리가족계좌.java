package 클래스만들기;

public class 우리가족계좌 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		우리가족계좌정보 i = new 우리가족계좌정보(); //아버지 객체
		우리가족계좌정보 m = new 우리가족계좌정보(); //어머니 객체
		우리가족계좌정보 b = new 우리가족계좌정보(); //형 객체
		i.family = "아버지";
		i.name = "홍길동";
		i.recordname = "튼튼적금";
		i.price = 1000;
		
		m.family = "어머니";
		m.name = "박길동";
		m.recordname = "튼튼적금";
		m.price = 2000;
		
		b.family = "형";
		b.name = "홍기사";
		b.recordname = "다음적금";
		b.price = 3000;

		System.out.println("우리 가족 계좌정보");
		System.out.println("------------------------------");
		System.out.print("가족관계\t이름\t계좌정보\t금액");
		System.out.println();
		System.out.println("------------------------------");
		System.out.print(i.family+"\t"+i.name+"\t"+i.recordname+"\t"+i.price);
		System.out.println();
		System.out.print(m.family+"\t"+m.name+"\t"+m.recordname+"\t"+m.price);
		System.out.println();
		System.out.print(b.family+"\t"+b.name+"\t"+b.recordname+"\t"+b.price);
		System.out.println();
		i.입금(); System.out.print(","); b.출금();
		System.out.println();
		System.out.print("=>"+i.family+"는  ");
		i.입금();
		System.out.print(" "+b.family+"은  ");
		b.출금();
		
	}

}
