package com.comparator;

public class Employee {
	int id;
	String name;
	String city;

	Employee() {

	}

	Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (this == null)
			return false;
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			return id == e.id && name.equals(e.name) && city.equals(e.city);
		} else
			return false;
	}

	public String toString() {
		return "Employee[ID:" + id + ",Name:" + name + ",City:" + city + "]";
	}

}
