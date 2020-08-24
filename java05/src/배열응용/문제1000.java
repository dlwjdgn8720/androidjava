package 배열응용;

import java.util.Random;

public class 문제1000 {
	public static void main(String[] args) {
    //문제 1000문제 
	//원래 답안지 0~3까지 중 1000개를 만드세요
	//내답안지 0~3까지 중 1000개를 만드세요	
	//----
	//채점해보세요
		Random r = new Random();
		int origin[] = new int[1000]; //원래 답안지(문항)
		int mine[] = new int[1000]; //내 답안지(문항)
		String result[] = new String[1000]; // 결과
		int count = 0; // 맞춘수
		int count2 = 0; // 틀린수 
		
		for (int i = 0; i < origin.length; i++) {
			origin[i] = r.nextInt(4);//원래 정답
		}
		for (int i = 0; i < mine.length; i++) {
			mine[i] = r.nextInt(4);//내 정답
		}
		for(int i =0; i<result.length; i++) {
			if(origin[i] == mine[i]) {
			    result[i] = "정답";
			    count++;
			}
			else {
				result[i] = "오답";
				count2++;
		    }
		}
		System.out.println("문항  정답  나의답  처리");
		System.out.println("----------------");
		for(int i=0; i<result.length; i++) {
		System.out.println(" "+i+"   "+origin[i]+"    "+mine[i]+"  "+result[i]);
		
		}
		System.out.println("맞춘 수 :" +count);
		System.out.println("틀린 수 :" +count2);
	}
}
