package com.ObserverPattern.Observer;
import com.ObserverPattern.Observable.StokesObservable;
import com.ObserverPattern.Observable.IphoneObservableImpl;
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StokesObservable iphoneObservableImpl=new IphoneObservableImpl();
		
		NotificationAlertObserver observer1=new EmailAlertObserverImpl("abhinandank12@gmail.com",iphoneObservableImpl);
		NotificationAlertObserver observer2=new EmailAlertObserverImpl("dk@gmail.com",iphoneObservableImpl);
		NotificationAlertObserver observer3=new MoblieAlertObserverImpl("ck@gmail.com",iphoneObservableImpl);
		iphoneObservableImpl.add(observer1);
		iphoneObservableImpl.add(observer2);
		iphoneObservableImpl.add(observer3);
		iphoneObservableImpl.setStockCount(10);
	}

}
