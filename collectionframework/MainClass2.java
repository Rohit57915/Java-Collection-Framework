package com.jspiders.collectionframework;
class Student
{
   int sid;
   double cgpa;
   
   Student (int sid,double cgpa){
	   this.sid=sid;
	   this.cgpa=cgpa;
   }
   @Override
   public String toString()
   {
	   return "[sid: "+sid+",cgpa:"+cgpa+"]";
   }
}
public class MainClass2 {
public static void main(String[] args) {
	Student s1=new Student(10,70.9);
	System.out.println(s1);
}
}

