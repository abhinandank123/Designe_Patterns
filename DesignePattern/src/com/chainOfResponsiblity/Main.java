package com.chainOfResponsiblity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		logProcessor.log(LogProcessor.ERROR, "Exception happen");
		logProcessor.log(LogProcessor.DEBUG, "Need to Debug this");
		logProcessor.log(LogProcessor.INFO, "Just for Information");

	}

}
