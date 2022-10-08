package com.comparator;

import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1=new Employee(10,"AAA","Pune");
		Employee e2=new Employee(30,"BBB","Kolhapur");
		Employee e3=new Employee(50,"EEE","Mumbai");
		Employee e4=new Employee(15,"DDD","Sangli");
		Employee e5=new Employee(20,"CCC","Satara");
		
//		TreeSet t=new TreeSet(new SortWithId());	//Sort with id
		
//		TreeSet t=new TreeSet(new SortWithName());  //Sort with name
		
		TreeSet t=new TreeSet(new SortWithCity());  //Sort with city
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
	}

}
