package 스태틱;

public class 직원 {
	String name;
	String gender;
	int age;
	final static String company = "mega";
	//final은 설정이 끝! 변경불가능!
	static int count;//직원 수 
	static int sum;//나이총합

	public 직원(String name, String gender, int age) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum + age;

	}
	//static 메서드(정적 메서드):객체 생성하지 않아도, 이 기능을 바로 사용 가능
	//클래스이름으로 바로 접근해서 사용할수 있는 메서드로 만드는 것이 좋다.
	public static String getName() {
		return company;//static메서드 내에서는 인스턴스 변수 사용 불가
		                //인스턴스변수는 객체 생성 후 접근 변수
	}
	//자주 사용하는 기능의 메서드는 바로 쓸 수 있게 만들어주는 것이 좋다.
	//Integer.parseInt(),JOptionpane.showInputDialog()
	
	//일반 메서드:객체 생성후,참조형변수의 주소로 접근 가능!
	public int getAvg() {
		return sum/count;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
