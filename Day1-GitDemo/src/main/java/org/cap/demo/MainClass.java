package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Hello!");
		greet();
		
	}

	private static void greet() {
		System.out.println("Good Morning!!");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
