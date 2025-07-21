package com.jspiders.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterface {
  public static void main(String[] args) {
       LinkedList ll=new LinkedList();
       ll.add("Java");
       ll.add("SQL");
       ll.add("Web");
       ll.add("J2ee");
       ll.add("FrameWork");
       ll.add("SpringBoot");
       ArrayList al=new ArrayList();
       al.add("Mannual");
       al.add("Testing");
       al.add("SQL");
       al.add("Java");
       al.add("API");
       System.out.println(ll);
       ll.addAll(3, al);
       System.out.println(ll);
       System.out.println(ll.indexOf("Sql"));
       System.out.println(ll.lastIndexOf("Sql"));
  }
  
}




