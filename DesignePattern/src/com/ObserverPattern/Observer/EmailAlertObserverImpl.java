package com.ObserverPattern.Observer;

import com.ObserverPattern.Observable.StokesObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
	
	String emailId;
	StokesObservable observable;
	
	public EmailAlertObserverImpl(String emailId,	StokesObservable observable ) {
		this.emailId=emailId;
		this.observable=observable;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		sentMail(emailId, "product is in the hurry up!");
	}
	private void sentMail(String emailId, String msg) {
		System.out.println("mail sent to : "+emailId);
	}

}
