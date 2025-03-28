package com.predefinedFunctionalinterface;

import java.util.function.Consumer;

public class ConsumerInJava {
	public static void main(String[] args) {
		/*
		 * Consumer
		 * =========
		 * * it will consume the value but wont return  anything.
		 * */
		Consumer<String> c=(s)->System.out.println(s);
		c.accept("Hello World");
	}

}
