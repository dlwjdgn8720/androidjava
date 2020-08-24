package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 이름(String),나이(int),성별(char),아침(boolean),몸무게(double) 배열 만들어서 프린트
		String[] names = {"이정후","이정훈","한범윤","노회승","이원진","신선희"};// 이름
		int[] ages = {19,20,25,34,35,36};
		char[] genders = {'남','여','남','남','남','남'};
		boolean[] bf = {true,false,true,false,true,true};
		double[] weight = {96.5,68.5,43.5,64.5,65.5,78.5};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름:"+names[i]+" 나이:"+ages[i]+" 성별:"+genders[i]+" 아침여부:"+bf[i]+" 몸무게:"+weight[i]);
		}
		for (String x : names) {
			System.out.println(x);
		}
		for (int x : ages) {
			System.out.println(x);
		}
		for (char x : genders) {
			System.out.println(x);
		}
		for (boolean x : bf) {
			System.out.println(x);
		}
		for (double x : weight) {
			System.out.println(x);
		}
		
		
		}
		
		
		}
		
		
		
	


