package 인터페이스;

public class ChineseCook implements ICook {

	@Override
	public void soup() {
		// TODO Auto-generated method stub
        System.out.println("토마토계란탕을 만들다.");
	}

	@Override
	public void salad() {
		// TODO Auto-generated method stub
		System.out.println("고추잡채를 만들다.");
	}

}
