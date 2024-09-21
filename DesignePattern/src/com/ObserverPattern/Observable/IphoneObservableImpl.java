package com.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import com.ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StokesObservable {
	
	
	public List<NotificationAlertObserver> observerList=new ArrayList<>();
	
	public int stockCount=0;

	@Override
	public void add(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
		
	}

	//@Override
	public void remove(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver observer : observerList) {
			observer.update();
		}
		
	}

	@Override
	public void setStockCount(int newStockAdded) {
		// TODO Auto-generated method stub
		if(stockCount == 0) {
			notifySubscribers();
		}
		stockCount=stockCount+newStockAdded;
		
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return stockCount;
	}

}
