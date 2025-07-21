package com.jspiders.collectionframework;
class Product1
{
   int pid;
   double price;
   
      Product1 (int pid,double price)
       {
	       this.pid=pid;
	       this.price=price;
        }
   @Override
   public String toString()
   {
	   return "[pid: "+pid+",price:"+price+"]";
   }
}
public class MainClass4 
{
   public static void main(String[] args) 
   {
	Product1[] kart=new Product1[5];
	
	kart[0]=new Product1(101,3500);
	kart[1]=new Product1(102,4500);
	kart[2]=new Product1(103,5500);
	kart[3]=new Product1(104,6500);
	kart[4]=new Product1(105,7500);
	
	for(int i=0; i<kart.length; i++)
	{
		System.out.println(kart[i]);
	}
	
}
}
