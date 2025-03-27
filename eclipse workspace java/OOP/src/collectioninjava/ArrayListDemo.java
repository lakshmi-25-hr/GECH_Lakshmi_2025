package collectioninjava;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList:
		 * ============
		 * 1. Array list is a improved version of array(Dynamic Array)
		 * 2.Array list underline data structure is Dynamic array
		 * 3.Array list allow duplicate
		 * 4.ArrayList allow random access(using index)
		 * 5.ArrayList will allow null value
		 * 6.ArrayList will preserve the order of insertion
		 * */
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(1);//duplicate values are allowed
		list.add(null);
		list.add(null);//null value are allowed
		list.add(34);
		list.add(12);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(34);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.remove(0);
		Integer i =34;
		list.remove(i);
		list.clear();
		System.out.println(list);
		
		
		
	}
}
