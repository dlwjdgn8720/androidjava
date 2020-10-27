package 추상클래스;

//추상 클래스는 객체 생성 불가능
public abstract class ApplePhone implements MegaPhone {
	String tel = "010-111-2222";
	
	//추상 메서드가 하나라도 포함되어 있으면,
	//추상 클래스라고 부른다.
	public abstract void camera();
	
	
	
	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("애플폰으로 인터넷을하다.");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(tel+ "전화하다.");

	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("애플폰으로 문자하다.");
	}

	@Override
	public void kakao() {
		// TODO Auto-generated method stub
		System.out.println("애플폰으로 카카오를하다.");
	}

	@Override
	public void map() {
		// TODO Auto-generated method stub
		System.out.println("애플폰으로 맵을 사용하다.");
	}

	@Override
	public void siri() {
		// TODO Auto-generated method stub
		System.out.println("애플폰으로 시리를 사용하다.");
	}

}
