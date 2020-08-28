package DB연결;

public class 반환값연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String data ="나는 자바 프로그래머";
     String[] dataset = data.split(" ");
     
     System.out.println(dataset.length);
     for(String s: dataset) {
    	 System.out.println(s);
     }
     
     System.out.println("-------------");
     String data2 = "02-844-1234";
     String[] dataset2 = data2.split("-");
     System.out.println(dataset2.length);
     for(String s : dataset2) {
    	 System.out.println(s);
     }
     
	}

}
