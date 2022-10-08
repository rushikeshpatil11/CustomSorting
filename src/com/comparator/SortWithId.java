package com.comparator;

import java.util.Comparator;

public class SortWithId implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {      //Way One
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		if (emp1.id < emp2.id)
			return -1;
		else if (emp1.id > emp2.id)
			return 1;
		else
			return 0;
	}

//	public int compare(Object o1, Object o2) {      //Way Two
//		Employee emp1 = (Employee) o1;
//		Employee emp2 = (Employee) o2;
//		Integer i1 = emp1.id;
//		Integer i2 = emp2.id;
//		return i1.compareTo(i2);
//	}

}
