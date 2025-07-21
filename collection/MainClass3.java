package com.jspiders.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class MainClass3 {
	public static void main(String[] args) {
		  LinkedList ll=new LinkedList();
		   ll.add("Mannual");
		   ll.add("Salenium");
		   ll.add("Sql");
		   ll.add(null);
		   ll.add(new StringBuffer("Project"));
		   ll.add(143);
		   ll.add(null);
		   ll.add("Sql");
		   ll.add(new Object());
		   Iterator itr=ll.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   
		   
	  }
}
