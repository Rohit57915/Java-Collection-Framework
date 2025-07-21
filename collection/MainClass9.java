package com.jspiders.collection;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass9 {
    	 public static void main(String[] args) {
    		    LinkedHashMap hm =new LinkedHashMap();
    		    hm.put("Qspiders", "Testing");
    		    hm.put("Jspiders", "Java");
    		    hm.put("Pyspiders", "Python");
    		    hm.put("Automation", "Selenium");
    		    hm.put("Automation", "Cypress");
    		    hm.put("Developer", "BTM");
    		    hm.put(null, "Silk Board");
    		    hm.put("c", null);
    		    hm.put("Perl", null);
    		    hm.put(123, "Students");
    		    hm.put("Boys", 90);
    		    Set s=hm.entrySet();
    		    Iterator itr=s.iterator();
    		    while(itr.hasNext())
    			 {
    				 System.out.println(itr.next());
    			 }
    	  }
	
}
