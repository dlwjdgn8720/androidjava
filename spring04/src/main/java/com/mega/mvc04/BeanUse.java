package com.mega.mvc04;

public class BeanUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BeanFactory factory = new BeanFactory();
			Apple object = (Apple)factory.create("apple");
			Banana object2 = (Banana)factory.create("banana");
	}

}
