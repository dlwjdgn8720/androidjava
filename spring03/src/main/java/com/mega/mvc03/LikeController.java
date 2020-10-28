package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LikeController {

	@Autowired
	CalCost cost2;
	
	@RequestMapping("reply.do")
	public void reply(String reply,Model model) {
		//db처리 했음
		//views로 넘어감.
		model.addAttribute("reply",reply);
		
	}
	
	@RequestMapping("check.do")
	public void check(String id,Model model) {
		//db처리 했음
		//views로 넘어감.
		String id2 = cost2.idcheck(id);
		model.addAttribute("id2",id2);
		
		
	}
	
    @RequestMapping("movie.do")
	public String Like(String title, int price, Model model) {

		price = cost2.cal(price);
		model.addAttribute("title", title);
		model.addAttribute("cost", price);
		return "like";
	}

}
