package com.jspiders.innerclass;

import java.util.ArrayList;

public class Mobile implements Device {
	ArrayList<Application> al=new ArrayList<Application>();
      @Override
      public Adapter adapter() {
    	  Adapter a =new Adapter() {
    		  @Override
    		  public void adapt() {
    			  for(Application a:al)
    			  {
    				  System.out.println("Mobile Adapter");
    			  }
    		  }
    	  };
    	  return a;
      }
      @Override
      public void install(Application a) {
    	  if(a!=null) {
    		  al.add(a);
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
