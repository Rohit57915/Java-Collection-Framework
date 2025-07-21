package com.jspiders.innerclass;

public class Laptop implements Device{
	 @Override
     public Adapter adapter() {
   	  Adapter a =new Adapter() {
   		  @Override
   		  public void adapt() {
   			  System.out.println("Laptop Adapter");
   		  }
   	  };
   	  return a;
     }
     @Override
     public void install(Application a) {
   	  if(a!=null) {
   		  String s=a.toString();
   		  System.out.println(s.substring(s.indexOf('@'))+"Installed");
   	  }
     }
     @Override
     public void uninstall(Application a)
     {
   	  if(a!=null) {
   		  System.out.println(a+"Uninstalled");
   	  }
     }
}