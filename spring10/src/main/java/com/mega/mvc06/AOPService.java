package com.mega.mvc06;

import org.springframework.stereotype.Service;

@Service
public class AOPService {
	
	public void error() {
		System.out.println(3/0);
	}
}
