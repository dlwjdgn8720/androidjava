package 상속응용;

public class Truck extends Car {
	String stuff;// 물건

	public void load() {
		System.out.println("물건을 싣다");
	}

	@Override
	public String toString() {
		return "Truck [stuff=" + stuff + ", engine=" + engine + ", wheel=" + wheel + "]";
	}
	

}
