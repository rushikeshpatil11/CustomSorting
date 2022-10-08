package com.comparable;

public class Student implements Comparable {
	int roll;
	String name;

	Student() {
	}

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int hashCode() {
		return roll;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (this == null)
			return false;
		if (o instanceof Student) {
			Student std = (Student) o;
			return roll == std.roll && name.equals(std.name);
		} else
			return false;
	}

	public int compareTo(Object o) {			 // Compare Name
		Student st = (Student) o;
		return name.compareTo(st.name);
	}

//	public int compareTo(Object o) {		     // Compare Roll
//		Student st = (Student) o;
//		Integer i1 = this.roll;
//		Integer i2 = st.roll;
//		return i1.compareTo(i2);
//	}
	public String toString() {
		return "Student[Roll:" + roll + ",Name:" + name + "]";
	}
}
