package 배열기본;

public class 배열기본2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] tem = new int[7];
       //배열은 일반적으로 같은 타입을 묶을 때 사용!
       //다양한 타입을 묶을 때는 배열을 쓰지 않음.
       //배열은 고정되니 크기를 가진다(크기 조절 불가능)
       tem[0] = 37;
       tem[1] = 35;
       tem[2] = 32;
       tem[3] = 33;
       tem[4] = 23;
       tem[5] = 25;
       tem[6] = 34;
       
      
       for(int i=0; i < tem.length; i++) {
    	   System.out.println("일주일간 온도: "+(i+1)+"일차" +tem[i]);
       }
	}

}
