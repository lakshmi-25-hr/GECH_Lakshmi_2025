package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_assignment{

	public static void main(String[] args) {
      //student list  whose marks greater than 60.
		List<Integer> list=Arrays.asList(50,40,60,79,80);
	    List<Integer> new_list=list.stream().filter(marks->marks>60).collect(Collectors.toList());
	    System.out.println(list);
	    System.out.println(new_list);
	}

}