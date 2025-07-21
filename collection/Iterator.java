package com.jspiders.collection;

import java.util.ArrayList;

public class Iterator {
   public static void main(String[] args) {
	   ArrayList al=new ArrayList();
	   al.add("java");
	   al.add("sql");
	   al.add("python");
	   al.add("j2ee");
	   
	   java.util.Iterator itr=al.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   
  }


}
