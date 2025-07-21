package com.jspiders.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MainClass10 {
  public static void main(String[] args) {
	  TreeMap tm=new TreeMap();
	    tm.put("Salman", null);
	    tm.put("Vicky", "Katrina");
	    tm.put("Ranbir", "Alia");
	    tm.put("Ranveer", "Deepika");
	    tm.put("Virat", "Anushaka");
	    tm.put("Banglore", 123);
	    tm.put("Karnataka", "Mysore");
	    tm.put("Karanataka", "Banglore");
	    tm.put("IT-Capital", "Banglore");
	    Set s=tm.entrySet();
	    Iterator itr=s.iterator();
	    while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
   }
}
