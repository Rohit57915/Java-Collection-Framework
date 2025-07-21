package com.jspiders.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class MainClass6 {
public static void main(String[] args) {
	  
	TreeSet ts=new TreeSet();
	ts.add("Alia");
	ts.add("Tamannah");
	ts.add("Priyanka");
	ts.add("Katrina");
	ts.add("kiriti");
	ts.add("SriDevi");
	ts.add("Alia");
	Iterator itr=ts.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	
  }
}
