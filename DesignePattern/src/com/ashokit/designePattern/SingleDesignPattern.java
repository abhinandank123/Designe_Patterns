package com.ashokit.designePattern;

public class SingleDesignPattern {
	
	//static SingleDesignPattern s=new SingleDesignPattern();
	//Eager Initilization
	static SingleDesignPattern s=null;
	
	private SingleDesignPattern(){
		
	}
	
	static SingleDesignPattern getInstance() {
		if(s==null) {
			s=new SingleDesignPattern();
		}
		return s;	
	}
}
