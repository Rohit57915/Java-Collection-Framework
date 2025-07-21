package com.jspiders.innerclass;

public class Whatsapp implements Application {
	@Override
	public void close() {
		System.out.println("Whatsapp Closed");
	}
	@Override
	public void open() {
		System.out.println("Whatsapp Opened");
	}

}
