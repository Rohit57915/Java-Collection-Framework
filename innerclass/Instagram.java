package com.jspiders.innerclass;

public class Instagram implements Application {
	@Override
	public void close() {
		System.out.println("Instagram Closed");
	}
	@Override
	public void open() {
		System.out.println("Instagram Opened");
	}

}
