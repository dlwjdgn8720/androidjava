package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
     
	@RequestMapping("insert.do")
	 public void insert(String id,String pw,String tel,String address) {
		 System.out.println("아이디 "+id);
		 System.out.println("비밀번호 "+pw);
		 System.out.println("번호" +tel);
		 System.out.println("주소 "+address);
	 }
}
