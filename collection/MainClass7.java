package com.jspiders.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
public class MainClass7 {
  public static void main(String[] args) {
	   PriorityQueue pq=new PriorityQueue();
	     pq.add("Rajni");
	     pq.add("Priya");
	     pq.add("Testing");
	     pq.add("Rohani");
	     pq.add("Software");
	     pq.add("sql");
	     pq.add("Nikita");
	     pq.add("Raksita");
	     Iterator itr=pq.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
  }
}
