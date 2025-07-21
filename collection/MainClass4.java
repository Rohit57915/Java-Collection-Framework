package com.jspiders.collection;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass4 {
  public static void main(String[] args) {
	      HashSet hs=new HashSet();
	      hs.add("java"); 
	      hs.add("Python");
	      hs.add(null);
	      hs.add(55545);
	      hs.add(new StringBuffer("Sql"));
	      hs.add(null);
	      hs.add(new StringBuilder("Mannual"));
	      hs.add("java");
	      hs.add(new Object());
		  Iterator itr=hs.iterator();
           while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   
	      
	  }
}
