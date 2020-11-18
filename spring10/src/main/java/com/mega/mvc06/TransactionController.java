package com.mega.mvc06;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@RequestMapping("transaction.do")
	public void transaction(MemberVO memberVO,BbsVO bbsVO,Model model){
		System.out.println("transaction controller call!!!!!!!!!!!!");
		int result = 0; //에러 발생
		try {
			result = service.tran(memberVO, bbsVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("결과 받은 값 >>>>"+result);
		if(result == 1) {
			model.addAttribute("result","모든db처리 성공 commit됨");
		}
		else {
			model.addAttribute("result","db처리 중 에러가 발생!! rollback됨");
		}
		
	
		
	}
}
