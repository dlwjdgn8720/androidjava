package 형변환Casting;

public class 기본형형변환 {

	public static void main(String[] args) {
		
        // primitive(원시적인,가공되지 않은)data
		// 크기에 대한 것을 고려해야 함.
		// 정수 byte(1)->short(2)->int(4)->long(8)
		
		byte a = 100; // -128 ~ 127
		int b = a;
		//int(큰) <- byte(작) : 자동형 변환
		
		int c = 120;
		byte d = (byte) c;
		//byte(작) <- int(큰) : 강제형 변환
		
	}

}
