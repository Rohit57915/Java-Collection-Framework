package com.jspiders.collection;
import java.util.TreeSet;
public class NavigateSetInterface {
   public static void main(String[] args) {
	   TreeSet<Double> ts=new TreeSet<Double>();
	   ts.add(8.3);
	   ts.add(8.3);
	   ts.add(7.5);
	   ts.add(8.3);
	   ts.add(8.1);
	   ts.add(8.2);
	   ts.add(6.9);
	   System.out.println(ts);
	   System.out.println("Floor : "+ts.floor(7.0));
	   System.out.println("Ceiling : "+ts.ceiling(7.9));
	   System.out.println("Lower : "+ts.lower(8.3));
	   System.out.println("Higher : "+ts.higher(7.9));
	   System.out.println(ts.pollFirst());
	   System.out.println("After poolFirst()" +ts);
	   System.out.println(ts.pollLast());
	   System.out.println("After pollLast()"+ts);
	   
    }
}
