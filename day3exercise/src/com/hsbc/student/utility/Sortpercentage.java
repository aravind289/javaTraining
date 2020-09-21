package com.hsbc.student.utility;

import java.util.Comparator;

public class Sortpercentage implements Comparator<StudentDetails>{

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPercentage()-o2.getPercentage());
	}

}
