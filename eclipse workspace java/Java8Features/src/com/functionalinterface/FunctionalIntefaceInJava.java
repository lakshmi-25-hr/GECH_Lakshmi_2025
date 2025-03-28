package com.functionalinterface;

@FunctionalInterface
//without using lambda expression
interface Interface1{
	public void display();
} 

class Display implements Interface1{

	@Override
	public void display() {
		System.out.println("Hello World");
		
	}
	
	
}
public class FunctionalIntefaceInJava {
	public static void main(String[] args) {
		Display display=new Display();
		display.display();
	}

}
