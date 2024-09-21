package com.withstrategydesignpattern;

import com.withstrategydesignpattern.Strategy.DriveStratagy;

public class Vechicle {
	
	DriveStratagy driveStratagy;
	
	
	//this is known as constructor injection
	public Vechicle(DriveStratagy driveStratagy) {
		super();
		this.driveStratagy = driveStratagy;
	}
	
	public void drive() {
		driveStratagy.drive();
		
	}
	
	

}
