package com.ashokit.designePattern;

import java.io.Serializable;

public class SingleDesignPatternNew implements Serializable {
	
	String name="Abhiandan";
	
	static SingleDesignPatternNew s=null;
	private SingleDesignPatternNew() throws Exception {
		if(s!=null) {
			throw new Exception();
		}
		
	}

	synchronized static  SingleDesignPatternNew getInstance() throws Exception {
		if(s==null) 
			s= new SingleDesignPatternNew();
			return s;
		
	}
	// to Override the readResolve to prevent the stdp 
	Object readResolve() {
		return s;
	}

}
