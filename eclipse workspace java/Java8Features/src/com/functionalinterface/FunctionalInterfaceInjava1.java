package com.functionalinterface;


@FunctionalInterface
//with using lambda expression
interface Interface2{
	public void display();
	
	
}

//example 2
@FunctionalInterface
interface Interface3{
	public  int findLength(String s);
		
}

//Example 3
@FunctionalInterface
interface Interface4{
	public int add(int a,int b);
	
}
public class FunctionalInterfaceInjava1 {
   public static void main(String[] args) {
	  Interface2 i=()->System.out.println("hello world");
	  i.display();	
	  
	  Interface3 i3=s->s.length();
	  int res=i3.findLength("Hello World");
	  System.out.println("result is:"+res);
	  
	  Interface4 i4=(a,b)->a+b;
	  int res1= i4.add(20, 10);
	  System.out.println("result is:"+res1);
	  
}
}
