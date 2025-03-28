package com.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,23,4,566,67);
		Stream<Integer> stream=list.stream().filter(x->x>10);
		Long res=stream.count();
		System.out.println(res);
	//	List<Integer> result=stream.collect(Collectors.toList()); //we cannot re use once we perform terminate operation
	//	System.out.println(result);
		
		//Long res1=stream.count(); // only one time we can perform termination operation
		//System.out.println(res1);
	
			
	}

}
