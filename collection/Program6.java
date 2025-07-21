package com.jspiders.collection;

import java.util.ArrayList;


public class Program6 {
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
			     
			     for(Object obj:al)
			     {
			    	 System.out.println(obj);
			     }     
		  }
}
