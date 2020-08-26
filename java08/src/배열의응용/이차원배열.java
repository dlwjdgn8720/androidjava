package 배열의응용;

public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[][] num = new int[3][10]; //2행 4열 
   
   
   System.out.println(num.length); //행의 개수, 1차원개수
   System.out.println(num[0].length); //0행의 개수
   System.out.println(num[1].length); //1행의 개수
   
   num[0][3] =1;
   num[0][4] =1;
   num[0][5] =1;
   for (int i = 0; i < num.length; i++) {//0~2
	   for(int j=0; j< num[i].length; j++) {//i=0, j=>0~9
		   System.out.print(num[i][j]+" ");
	   }
	   System.out.println();
}
	}

}
