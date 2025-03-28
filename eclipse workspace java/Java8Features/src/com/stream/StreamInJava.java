package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInJava {
	public static void main(String[] args) {
		 List<Integer> list=new ArrayList<Integer>();
		 list.add(12);
		 list.add(56);
		 list.add(456);
		 list.add(556);
		 list.add(9);
		 //1. I need to filter based on the odd numbers and generate a list
		 
		 
		 Stream<Integer> stream =list.stream();

		 List<Integer> numbers= stream.filter((i)->i%2==0).collect(Collectors.toList());
		 System.out.println(numbers);

		 //within in one line 
		// List<Integer> numbers= list.stream().filter((i)->i%2!=0).collect(Collectors.toList());
		// System.out.println(numbers);
	}

}
