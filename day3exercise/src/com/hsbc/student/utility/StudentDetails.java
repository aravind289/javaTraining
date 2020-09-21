package com.hsbc.student.utility;

public class StudentDetails {
	
	// all the variable below are instance variables
	 private int RollNo =0;
	 private String StudName;
	 private int MarksInEng;
	 private int MarksInMaths;
	 private int MarksInScience;
	 private int total;
	 private double percentage;
	 
	 
//	 public StudentDetails(int rollNo, String studName, int marksInEng, int marksInMaths, int marksInScience, int total,
//			double percentage) {
//		super();
//		RollNo = rollNo;
//		StudName = studName;
//		MarksInEng = marksInEng;
//		MarksInMaths = marksInMaths;
//		MarksInScience = marksInScience;
//		this.total = total;
//		this.percentage = percentage;
//	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return RollNo;
	}
	@Override
	public String toString() {
		return "StudentDetails [RollNo=" + RollNo + ", StudName=" + StudName + ", MarksInEng=" + MarksInEng
				+ ", MarksInMaths=" + MarksInMaths + ", MarksInScience=" + MarksInScience + ", total=" + total
				+ ", percentage=" + percentage + "]";
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
	
	
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	/**
	 * @return the percentage
	 */
	public double getPercentage() {
		return percentage;
	}
	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}
