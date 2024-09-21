package com.ashokit.designePattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingleDesignPattern singleDesignPattern=new SingleDesignPattern();
		//System.out.println(singleDesignPattern.hashCode());
		SingleDesignPattern s1=SingleDesignPattern.getInstance();
		SingleDesignPattern s2=SingleDesignPattern.getInstance();
		SingleDesignPattern s3=SingleDesignPattern.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println();
	}

}
