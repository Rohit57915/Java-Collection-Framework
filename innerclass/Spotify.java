package com.jspiders.innerclass;

public class Spotify implements Application{
	@Override
	public void close() {
		System.out.println("Spotify Closed");
	}
	@Override
	public void open() {
		System.out.println("Spotify Opened");
	}

}
