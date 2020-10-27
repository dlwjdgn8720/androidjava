package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 이벤트처리클래스 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("첫번째 버튼을 눌렀음....");
	}

}
