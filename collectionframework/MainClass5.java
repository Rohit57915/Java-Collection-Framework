package com.jspiders.collectionframework;
class Student1
{
   int sid;
   double cgpa;
   
   Student1 (int sid,double cgpa){
	   this.sid=sid;
	   this.cgpa=cgpa;
   }
   @Override
   public String toString()
   {
	   return "[sid: "+sid+",cgpa:"+cgpa+"]";
   }
}
public class MainClass5 {
public static void main(String[] args) {
	Student1[] res=new Student1[5];
	res[0]=new Student1(101,7.2);
	res[1]=new Student1(102,8.2);
	res[2]=new Student1(103,9.2);
	res[3]=new Student1(104,6.2);
	res[4]=new Student1(105,5.2);
	
	for(int i=0; i<res.length; i++)
	{
		System.out.println(res[i]);
	}
}
}
