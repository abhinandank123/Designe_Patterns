package com.chainOfResponsiblity;

public class InfoLogProcessor extends LogProcessor {

	public InfoLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
		// TODO Auto-generated constructor stub
	}
	public void log(int logLevel , String message) {
		if(logLevel==INFO) {
			System.out.println("INFO : "+message);
		}else {
			super.log(logLevel, message);
		}
	}

}
