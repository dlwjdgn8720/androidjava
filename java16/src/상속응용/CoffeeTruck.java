package 상속응용;

public class CoffeeTruck extends Truck {
	String coffee;
    public void loadcoffee(){
		System.out.println("커피를 싣다");
	}
	@Override
	public String toString() {
		return "CoffeeTruck [coffee=" + coffee + ", stuff=" + stuff + ", engine=" + engine + ", wheel=" + wheel + "]";
	}
    
}
