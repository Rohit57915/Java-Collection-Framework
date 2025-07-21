package com.jspiders.collection;

import java.util.HashSet;

public class Program3 {
  public static void main(String[] args) {
	    int[] arr= {15,18,12,16,14,17,18,15};
	    HashSet<Integer> hs=new HashSet<Integer>();
	    for(int i=0;i<arr.length;i++)
	    {
	    	boolean bool=hs.add(arr[i]);
	    	if(bool==false)
	    	{
	    		System.out.println(arr[i]);
	    	}
	    }
  }
}
