package com.jspiders.innerclass;

public class MainClass1 {
  public static void main(String[] args) {
	  
	    Mobile m=new Mobile();
	    Whatsapp ref=new Whatsapp();
	    m.install(ref);
	    m.install(new Netflix());
	    m.install(new Spotify());
	    m.install(new Outlook());
	    System.out.println("m.al.size()");
	    m.uninstall(ref);
	    System.out.println(m.al.size());
	    Adapter a=m.adapter();
	    a.adapt();
	    
  }
}

