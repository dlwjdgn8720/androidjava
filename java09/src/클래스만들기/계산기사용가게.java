package 클래스만들기;
//class(부류,같은 성격을 가진 group)
//Tv부류가 일반적으로 가져야하는 기능을 정의

public class 계산기사용가게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기 cal = new 계산기();
		cal.plus();
		cal.minus();
		
		TV tv1 = new TV();
		tv1.poweron();
		TV tv2 = new TV();
		tv2.poweron();
		tv2.poweroff();
	}

}
