package com.coforge.Day_06_07_2026prj;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDept().compareTo(o2.getDept());
	}

}
