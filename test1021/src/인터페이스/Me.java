package 인터페이스;

public class Me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AppleCar apple = new AppleCar();
        apple.color();
        apple.window();
        System.out.println("------------차교체------------");
        BananaCar banana = new BananaCar();
        banana.color();
        banana.window();
	}

}
