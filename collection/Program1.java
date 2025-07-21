package com.jspiders.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {
  public static void main(String[] args) {
	      ArrayList<String> al=new ArrayList<String>();
	      al.add("JAVA");
	      al.add("Qspiders");
	      al.add("Jspiders");
	      al.add("Sql");
	      al.add("Rohit");
	      Iterator <String> itr=al.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }
  }

}
