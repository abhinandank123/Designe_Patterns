package com.ashokit.factoryPattern;

public class ChainOfResponsiblityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
	static void m1() {
		try {
		m2();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	static void m2() {
		m3();
	}
	static void m3() {
		int i=10/0;
	}

}
