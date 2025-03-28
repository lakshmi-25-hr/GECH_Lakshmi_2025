package com.predefinedFunctionalinterface;

import java.util.function.Predicate;

public class PredicateInJava {
	public static void main(String[] args) {
		/*
		 * Predicate:
		 * ============
		 * * it will holds a condition
		 * */
		// i need to find the number is even or add
		Predicate<Integer> p=(a)->a%2==0;
		System.out.println(p.test(21)); //return boolean
	}

}
