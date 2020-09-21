package com.hsbc.student.utility;

import java.util.Arrays;
import java.util.Scanner;

public class Standard {
	public static int total;
	public static double percentage;
	
	
	public static int totalScore(int engMark ,int mathMark, int scienceMark) {
		total = engMark+mathMark+scienceMark;
		return total;		
	}
	
	public static double totalPercentage(int total) {
		percentage = total/3 ;
		return percentage;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails[]   details = new StudentDetails[2];
		Scanner scanner = new Scanner(System.in);
		
	// StudentDetails studentDetails = new StudentDetails();
		
		for(int i= 0;i<2;i++) {
			
				details[i] = new StudentDetails();
				System.out.println("enter roll no");
				int rollNumber = scanner.nextInt();
				details[i].setRollNo(rollNumber);
				System.out.println("enter name");
				String name = scanner.next();
				details[i].setStudName(name);
				scanner.nextLine();
				System.out.println("enter marks in english out of 100");
				int engMark = scanner.nextInt();
				details[i].setMarksInEng(engMark);
				System.out.println("enter marks in maths out of 100");
				int mathMark = scanner.nextInt();
				details[i].setMarksInMaths(mathMark);
				System.out.println("enter marks in science out of 100");
				int scienceMark = scanner.nextInt();
				details[i].setMarksInScience(scienceMark);
				System.out.println("Your total score is:");
				System.out.println(totalScore(engMark,mathMark,scienceMark));
				details[i].setTotal(total);
				scanner.nextLine();
				System.out.println("Percentage obtained:");
				System.out.println(totalPercentage(total));
				details[i].setPercentage(percentage);
				scanner.nextLine();
				
			
		}
		
		System.out.println("before sorting");
		for(int i =0 ;i<2 ;i++) {			
				System.out.println(details[i]);
			
		}
		
		System.out.println("After sorting wrt to roll number");
//		After sorting using roll no
		Arrays.sort(details,new SortRollNo());
		for(int i =0 ;i<2 ;i++) {			
				System.out.println(details[i]);			
		}
		
		System.out.println("Sorting wrt to percentage");
		Arrays.sort(details,new Sortpercentage());
		System.out.println(details[details.length-1]);		
		
		System.out.println("Sorting wrt to maths mark ");
		Arrays.sort(details,new SortMathsmark());
		System.out.println(details[details.length-1]);	
		
		scanner.close();

	}

}
