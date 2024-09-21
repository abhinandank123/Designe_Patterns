package com.withstrategydesignpattern;

import com.withstrategydesignpattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vechicle {
	
	public OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}

}
