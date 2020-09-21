package com.hsbc.student.utility;

import java.util.Comparator;

public class SortMathsmark implements Comparator<StudentDetails>{

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		// TODO Auto-generated method stub
		return o1.getMarksInMaths()-o2.getMarksInMaths();
	}

}
