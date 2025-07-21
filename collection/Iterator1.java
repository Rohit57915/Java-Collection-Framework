package com.jspiders.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Iterator1 {
	public static void main(String[] args) {
		   HashSet hs=new HashSet();
		   hs.add("java");
		   hs.add("sql");
		   hs.add("python");
		   hs.add("j2ee");
		   java.util.Iterator itr =hs.iterator();
		   while(itr.hasNext())
		   {
			   System.out.println(itr.next());
		   }
		   
	  }
}
