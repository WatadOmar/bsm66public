package com.demo.inject;

public class SMSService implements Service{

	@Override
	public boolean send(String msg) {

		System.out.println("from SMS Send");
		return true;
	}
	

}
