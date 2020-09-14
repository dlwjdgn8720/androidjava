package 스태틱;

public class 창업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		직원 work1 = new 직원("이정후","남자",28);
		직원 work2 = new 직원("이정훈","남자",30);
		직원 work3 = new 직원("이종률","남자",31);
		
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("현재직원:"+직원.count+"명");
		System.out.println("현재직원의 평균나이:"+직원.sum/직원.count);
	

}
}
