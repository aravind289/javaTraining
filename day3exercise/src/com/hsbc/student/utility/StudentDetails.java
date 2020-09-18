package com.hsbc.student.utility;

public class StudentDetails {
	
	// all the variable below are instance variables
	 private int RollNo;
	 private String StudName;
	 
	 
	 /**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return RollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	/**
	 * @return the studName
	 */
	public String getStudName() {
		return StudName;
	}
	/**
	 * @param studName the studName to set
	 */
	public void setStudName(String studName) {
		StudName = studName;
	}
	private int MarksInEng;
	 private int MarksInMaths;
	 private int MarksInScience;
	
	/**
	 * @return the marksInEng
	 */
	public int getMarksInEng() {
		return MarksInEng;
	}
	/**
	 * @param marksInEng the marksInEng to set
	 */
	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}
	/**
	 * @return the marksInMaths
	 */
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	/**
	 * @param marksInMaths the marksInMaths to set
	 */
	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}
	/**
	 * @return the marksInScience
	 */
	public int getMarksInScience() {
		return MarksInScience;
	}
	/**
	 * @param marksInScience the marksInScience to set
	 */
	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}
}
