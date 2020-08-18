package 연산자;

public class 기본형형변환2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte u =100;
        int r = u; // 자동형 변환(작 -> 큰)
        System.out.println(r); 
        
        int x = 300;
        byte y = (byte)x; // 형 변환 불가
        System.out.println(y); 
        
        double z = 400; // 8바이트 강제형 변환(큰 -> 작)
        int k = (int)z; 
        System.out.println(k);
        
        int q = 400;
        double o  = q; // 자동형변환(작 -> 큰)
        System.out.println(o);
	}

}
