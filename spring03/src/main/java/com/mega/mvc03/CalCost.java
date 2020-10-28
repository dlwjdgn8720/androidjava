package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CalCost {

	@Autowired
	MemberDAO dao;

	public int cal(int price) {
		if (price >= 10000) {
			price = price - 1000;
		}
		return price;
	}

	public String idcheck(String id) {
		String[] id2 = { "root", "admin", "apple", "melon", "mint" };
		String result = "<font color=blue>사용 가능</font>";

		for (int i = 0; i < id2.length; i++) {
			if (id.equals(id2[i])) {
				result = "<font color=red>사용 불가능</font>";
				
				
			}
		}

		return result;
	}
}
