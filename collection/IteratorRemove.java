package com.jspiders.collection;

import java.util.LinkedList;
import java.util.Iterator;

public class IteratorRemove {
   public static void main(String[] args) {
	    LinkedList ll=new LinkedList();
	    ll.add("Python");
	    ll.add("SQL");
	    ll.add("WEB");
	    ll.add("Django");
	    ll.add("Flask");
	    System.out.println(ll);
	    Iterator itr=ll.iterator();
	    while(itr.hasNext())
	    {
	    	String s=itr.next().toString();
	    	if(s.equals("Django"))
	    	{
	    		itr.remove();
	    	}
	    }
	    System.out.println(ll);
  }
}
