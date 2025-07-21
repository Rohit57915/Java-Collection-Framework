package com.jspiders.collection;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class MainClass5 {
	public static void main(String[] args) {
	      LinkedHashSet hs=new LinkedHashSet();
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
