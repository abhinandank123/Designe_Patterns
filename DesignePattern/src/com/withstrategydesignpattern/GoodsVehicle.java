package com.withstrategydesignpattern;

import com.withstrategydesignpattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vechicle{

	public GoodsVehicle(){
		super(new NormalDriveStrategy());
		// TODO Auto-generated constructor stub
	}

}
