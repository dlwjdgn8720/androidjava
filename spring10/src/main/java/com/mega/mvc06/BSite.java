package com.mega.mvc06;

import org.springframework.stereotype.Component;

@Component
public class BSite {
	public void search() {
		System.out.println("물건검색");
	}
	public void basket() {
		System.out.println("장바구니");
	}
	public void order() {
		System.out.println("주문");
	}
}
