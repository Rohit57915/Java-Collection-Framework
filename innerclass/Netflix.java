package com.jspiders.innerclass;

public class Netflix implements Application{
	@Override
	public void close() {
		System.out.println("Netflix Closed");
	}
	@Override
	public void open() {
		System.out.println("Netflix Opened");
	}	

}
