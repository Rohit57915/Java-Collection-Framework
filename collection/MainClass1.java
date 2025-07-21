package com.jspiders.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass1 {
  public static void main(String[] args) {
	     ArrayList al=new ArrayList();
	     al.add("java");
	     al.add("Sql");
	     al.add(new StringBuffer("Testing"));
	     al.add(null);
	     al.add(new Object());
	     al.add(null);
	     al.add("Software");
	     al.add("sql");
	     Iterator itr=al.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	     
	     
  }
}
