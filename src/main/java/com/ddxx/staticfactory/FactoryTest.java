package com.ddxx.staticfactory;
public class FactoryTest {
 
	public static void main(String[] args) {	
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
