package 상속응용;

public class Car {
	String engine;
	
	String wheel;
	
	public void move() {
	   System.out.println("움직이다");
	}
	public void speed() {
		System.out.println("속력을 올리다");
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheel=" + wheel + "]";
	}


}
