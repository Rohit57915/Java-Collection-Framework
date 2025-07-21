package com.jspiders.collection;
import java.util.ArrayList;

public class ListIterator {
 public static void main(String[] args) {
	    ArrayList al=new ArrayList();
	    al.add("Banglore");
	    al.add("Mumbai");
	    al.add("Chennai");
	    al.add("Kolkata");
	    al.add("Hydrabad");
	    
	    java.util.ListIterator  itr=al.listIterator();
	    System.out.println("Forwards------>");
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.nextIndex());   // Next Index()
	    	System.out.println(itr.next());        // next index()
	    	 
	    }
	    System.out.println("Backwards---->");
	    while(itr.hasPrevious()) {
	    	System.out.println(itr.previousIndex());  // Privious Index()
	    	System.out.println(itr.previous());       
	    }
  }
}
