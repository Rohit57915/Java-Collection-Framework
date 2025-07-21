package com.jspiders.collection;

import java.util.TreeSet;

public class SortedSetInterface {
       public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Java");
		ts.add("Web");
		ts.add("SQL");
		ts.add("J2ee");
		ts.add("FrameWork");
		ts.add("Apptitude");
		ts.add("Verbal");
		ts.add("Programming");
		System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet("Java"));
        System.out.println(ts.tailSet("Java"));
        System.out.println(ts.subSet("J2ee", "Verbal"));
	}
}
