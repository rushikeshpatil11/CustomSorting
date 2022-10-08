package com.comparable;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		String s1 = new String("AAA");
		StringBuffer s2 = new StringBuffer("CCC");
		StringBuilder s3 = new StringBuilder("BBB");

		TreeSet t = new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);

		System.out.println(t);      // ClassCastException because we Store Heterogeneous data in TreeSet

	}

}
