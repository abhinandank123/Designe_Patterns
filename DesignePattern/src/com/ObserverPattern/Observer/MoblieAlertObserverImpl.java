package com.ObserverPattern.Observer;

import com.ObserverPattern.Observable.StokesObservable;

public class MoblieAlertObserverImpl implements NotificationAlertObserver  {
	
	String userName;
	StokesObservable observable;
	
	public MoblieAlertObserverImpl(String userName, StokesObservable observable) {
		this.userName=userName;
		this.observable=observable;
	}
 
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sentmsgOnMobile(userName , "product is in stoke hurry up!");
		
	}
	public void sentmsgOnMobile(String userName ,String msg) {
		System.out.println("msg sent to :"+userName);
	}

}
