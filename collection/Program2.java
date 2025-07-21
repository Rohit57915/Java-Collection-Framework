package com.jspiders.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Program2 {
   public static void main(String[] args) {
	        int[] arr= {15,18,12,16,14,17};
	        TreeSet<Integer> ts=new TreeSet<Integer>();
	        for(int i=0;i<arr.length;i++)
	        {
	        	ts.add(arr[i]);
	        }
	        Iterator<Integer> itr=ts.iterator();
	        while(itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
   }
}
