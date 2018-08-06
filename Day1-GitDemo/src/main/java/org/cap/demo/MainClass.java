package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Hello!");
		greet();
		SalesClass c1=new SalesClass();
		c1.showMsg();
		CustomerClass c2=new CustomerClass();
		c2.customerMsg();
		ProductClass c3=new ProductClass();
		c3.greetUser();
		
	}

	private static void greet() {
		System.out.println("Good Morning!!");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
