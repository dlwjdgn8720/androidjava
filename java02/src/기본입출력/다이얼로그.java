package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		// 자바에서의 코딩방식
		// 특정한 일을 처리하는 부품을 만들어 전담시킨다.
		// 큰 -> 작 : 강제
		// 작 -> 큰 : 자동
		// 자바에서 자주사용되는 부품은 
		// 미리 메모리에 가져다 놓고 있음.
		// 부품의 이름을 대문자로 시작해서 사용하면 된다.
		String hour = JOptionPane.showInputDialog("지금 몇시인가요?"); // prompt창
	    JOptionPane.showMessageDialog(null,hour+"시입니다."); // 확인창
	    //empty == null,널
	    //기능을 처리를 해주는 단위:function(함수)
	    //JOptionPane: 부품의 이름 , show~~~:동적으로 보여주는 기능
	    
	    int hour2 = Integer.parseInt(hour);
	    //int <- String ( 형 변환 불가)
	    // 형 변환 할수 있도록 부품을 써야함.
	    
	    if(hour2 < 16) { //조건에는 비교연산자를 쓰고, 비교연산자의 결과는 논리
	    	JOptionPane.showMessageDialog(null, "아직 집에 갈시간이 멀었어요");//true
	    }else {
	    	JOptionPane.showMessageDialog(null, "집에 갈시간이 얼마 안남았어요");//false
	    	
	    }
	    
		
		
          
	}

}
