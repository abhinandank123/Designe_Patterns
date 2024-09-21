package com.ashokit.factoryPattern;

public class FactoryPatternExample {
	public static void main(String[] args) {
		Factory f1=new Factory();
		Notification n=f1.createNotification("SMS");
		n.notifi();
		Notification n1=f1.createNotification("Email");
		n1.notifi();
	}

}
interface Notification{
	public void notifi();
}

class SMSNotification implements Notification{

	@Override
	public void notifi() {
		// TODO Auto-generated method stub
		System.out.println("Triggering Notification throw SMS");
	}
	
}
class EmailNotification implements Notification{

	@Override
	public void notifi() {
		// TODO Auto-generated method stub
		System.out.println("Triggering Notification throw Email");
	}
	
}
class Factory{

	
	public Notification createNotification(String mode) {
		// TODO Auto-generated method stub
		if(mode.equalsIgnoreCase("SMS")) {
			Notification n=new SMSNotification();
			return n;
		}
		if(mode.equalsIgnoreCase("Email")) {
			Notification n=new EmailNotification();
			return n;
		}
		return null;
	}
	
}
