package com.jspiders.innerclass;

public class Outlook implements Application{
	@Override
	public void close() {
		System.out.println("Outlook Closed");
	}
	@Override
	public void open() {
		System.out.println("Outlook Opened");
	}

}
