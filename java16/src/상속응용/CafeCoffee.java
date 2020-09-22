package 상속응용;

public class CafeCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CoffeeTruck ct = new CoffeeTruck();
     ct.engine="D2156HM";
     ct.wheel="HankookTire";
     ct.stuff="coffee";
     ct.coffee="Americano";
     System.out.println(ct);
     ct.load();
     ct.loadcoffee();
     ct.speed();
     ct.move();
     
     
	}

}
