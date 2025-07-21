package com.jspiders.collectionframework;
class Product
{
   int pid;
   double price;
   
   Product (int pid,double price){
	   this.pid=pid;
	   this.price=price;
   }
   @Override
   public String toString()
   {
	   return "[pid: "+pid+",price:"+price+"]";
   }
}
public class MainClass1 {
public static void main(String[] args) {
	Product p1=new Product(101,4500.9);
	System.out.println(p1);
}
}
