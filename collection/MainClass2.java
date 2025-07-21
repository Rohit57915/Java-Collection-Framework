package com.jspiders.collection;

import java.util.Iterator;
import java.util.Vector;

public class MainClass2 {
  public static void main(String[] args) {
	   Vector v=new Vector();
	   v.add("Mannual");
	   v.add("Salenium");
	   v.add("Sql");
	   v.add(new StringBuffer("Project"));
	   v.add(143);
	   v.add(null);
	   v.add("Sql");
	   v.add(new Object());
	   Iterator itr=v.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
	   
  }
}
