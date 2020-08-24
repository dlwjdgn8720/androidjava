package 배열응용;

public class 배열정리문제5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] num = {66,77,88,99};
     int temp = 0;
     int max = num[0];
     
     temp = num[0];
     num[0] = num[3];
     num[3] = temp;
     
     for (int i = 1; i < num.length; i++) {
		if(num[i] > max) {
			max = num[i];
		}
     }
     System.out.println("최댓값: "+max);
     
     for (int i = 0; i < num.length; i++) {
    	 System.out.print(num[i]+" ");
	}
    
     
		
	
     
	

}
}

