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
		percentage = total/300 ;
		return percentage;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails[][]   details = new StudentDetails[1][7];
		Scanner scanner = new Scanner(System.in);
		
	// StudentDetails studentDetails = new StudentDetails();
		
		for(int i= 0;i<1;i++) {
			for(int j= 0;j<2;j++) {
				details[i][j] = new StudentDetails();
				System.out.println("enter roll no");
				int rollNumber = scanner.nextInt();
				details[i][j].setRollNo(rollNumber);
				System.out.println("enter name");
				String name = scanner.next();
				details[i][j].setStudName(name);
				scanner.nextLine();
				System.out.println("enter marks in english out of 100");
				int engMark = scanner.nextInt();
				details[i][j].setMarksInEng(engMark);
				System.out.println("enter marks in maths out of 100");
				int mathMark = scanner.nextInt();
				details[i][j].setMarksInMaths(mathMark);
				System.out.println("enter marks in science out of 100");
				int scienceMark = scanner.nextInt();
				details[i][j].setMarksInScience(scienceMark);
				System.out.println("Your total score is:");
				System.out.println(totalScore(engMark,mathMark,scienceMark));
				details[i][j].setTotal(total);
				scanner.nextLine();
				System.out.println("Percentage obtained:");
				System.out.println(totalPercentage(total));
				details[i][j].setPercentage(percentage);
				scanner.nextLine();
				
			}
		}
		
		for(int i =0 ;i<1 ;i++) {
			for(int j =0 ;j<2;j++) {
				System.out.println(details[i][j]);
			}
		}
				
//		After sorting using roll no
		Arrays.sort(details,new SortRollNo());
		for(int i =0 ;i<1 ;i++) {
			for(int j =0 ;j<2;j++) {
				System.out.println(details[i][j]);
			}
		}
		
		
		scanner.close();

	}

}
