package com.ashokit.designePattern;

public class Thread1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
		// In java which class is a single tone : Runtime
		//Runtime r1=new Runtime();
		Runtime r2=Runtime.getRuntime();
//Thread is noting but Independent path of execution with in 
	}
	public void run() {
		try {
			SingleDesignPatternNew s=SingleDesignPatternNew.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
