package com.hsbc.student.utility;

import java.util.Scanner;

public class StudentInfo {
	
	
//	public static String  TotalStudents(int rollNum,String Name) {
//		
//	
//		
//	}
//	
//public static String  HighestPercentage(int rollNum,String Name) {
//		
//	
//		
//	}
//
//public static String  HighestMarksMaths(int rollNum,String Name) {
//	
//	
//	
//}
//
//public static String  TotalMarksMathsScience(int rollNum,String Name) {
//	
//	
//	
//}
//
//public static String  DescendingRank(int rollNum,String Name) {
//	
//	
//	
//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[][] studentMatrix ;
		
		StudentDetails studentDetails = new StudentDetails();
		
		
		for(int i =0 ;i<8 ;i++) {
			for(int j = 0 ;j<8 ;j++) {
				System.out.println("Enter roll no:");
				int rollNo = scanner.nextInt();
				System.out.println("Enter name:");
				scanner.next();
				scanner.nextLine();
				System.out.println("Enter marks in english:");
				scanner.nextInt();
				System.out.println("Enter marks in maths:");
				scanner.nextInt();
				System.out.println("Enter marks in science:");
				scanner.nextInt();
				
			}
		}
		
		
		
		

	}

}
