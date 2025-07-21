package com.jspiders.collection;

import java.util.LinkedList;

public class QueueInterface {
  public static void main(String[] args) {
	    LinkedList ll=new LinkedList();
	    ll.offer("java");
	    ll.offer("sql");
	    ll.offer("web");
	    ll.offer("J2ee");
	    ll.offer("FrameWork");
	    System.out.println(ll);
	    System.out.println(ll.peek());
	    System.out.println(ll);
	    System.out.println(ll.element());
	    System.out.println(ll);
	    System.out.println(ll.poll());
	    System.out.println(ll);
	    System.out.println(ll.remove());
	    System.out.println(ll);
	    
  }
}
