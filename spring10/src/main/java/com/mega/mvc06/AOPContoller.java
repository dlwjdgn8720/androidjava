package com.mega.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPContoller {
	
	@Autowired
	ASite a;
	@Autowired
	BSite b;
	
	@Autowired
	AOPService service;
	
	
	@RequestMapping("a.do")
	public void A() {
		a.person();
	}
	
	@RequestMapping("b.do")
	public void B() {
		b.search();
		b.basket();
		b.order();
	}
	
	@RequestMapping("aopError.do")
	public void aop3() {
		try {
			service.error();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
