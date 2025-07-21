package com.jspiders.collection;

import java.util.LinkedHashMap;

public class Program4 {
 public static void main(String[] args) {
	      int[] arr= {13,18,12,16,14,17,18,15};
	      LinkedHashMap <Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
	      for(int i=0; i<arr.length; i++)
	      {
	    	  if(hm.containsKey(arr[i])==false)
	    	  {
	    		    hm.put(arr[i], 1); 
	    	  }
	    	  else
	    	  {
	    		  int count=hm.get(arr[i]);
	    		  count++;
	    	      hm.put(arr[i],count);
	    	  }   
	      }
	      for(int i=0;i<arr.length;i++)
	      {
	    	  int Count=hm.get(arr[i]);
	    	  if(Count==1)
	    	  {
	    		  System.out.println(arr[i]);
	    	  }
	      }
  }
}
