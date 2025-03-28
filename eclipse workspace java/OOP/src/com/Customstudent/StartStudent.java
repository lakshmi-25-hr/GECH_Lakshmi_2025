package com.Customstudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {
	public static void main(String[] args) {
		Student std1=new Student("lakshmi",22,21);
		Student std2=new Student("suma",15,23);
		Student std3=new Student("suma",24,23);
	//	Student std4=new Student("lakshmi",30,21);
		
		List<Student> student = new ArrayList<>();
		student.add(std1);
		student.add(std2);
		student.add(std3);
      
		//student.add(std4); //we can also write it is
		student.add(new Student("lakshmi",23,21));
		System.out.println("Before");
		System.out.println(student);
	//	student.remove(0);
	//	System.out.println(student);
		Collections.sort(student,(s1,s2)->s2.getRoll_num()-s1.getRoll_num());
		System.out.println("After");
		System.out.println(student);
       	 student.stream().filter((s)->s.getAge()>60);
		

	}
    
}
