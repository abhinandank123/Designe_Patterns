package com.withstrategydesignpattern;

import com.withstrategydesignpattern.Strategy.SportsDriveStrategy;

public class SportVechicle extends Vechicle {
	
	public SportVechicle() {
		super(new SportsDriveStrategy());
	}

}
