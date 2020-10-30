package com.mega.mvc08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("insert2.do")
	public void insert(ProductVO productVO) {
		service.insert(productVO);
	}
	@RequestMapping("one2.do")
	public void one(ProductVO productVO,Model model) {
	ProductVO vo = service.one(productVO);
	model.addAttribute("vo", vo);
		
	}
	@RequestMapping("list2.do")
	public void list(Model model) {
		List<ProductVO> list = service.list();
		model.addAttribute("list", list);
	}
	@RequestMapping("update2.do")
	public void update(ProductVO productVO) {
		service.update(productVO);
	}
	@RequestMapping("delete2.do")
	public void delete(ProductVO productVO) {
		service.delete(productVO);
	}

}
