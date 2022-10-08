package com.comparable;

import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {

		Student s1=new Student(10,"AAA");
		Student s2=new Student(30,"CCC");
		Student s3=new Student(15,"EEE");
		Student s4=new Student(40,"BBB");
		Student s5=new Student(20,"DDD");
		
		TreeSet t=new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		
		System.out.println(t);
	}

}
