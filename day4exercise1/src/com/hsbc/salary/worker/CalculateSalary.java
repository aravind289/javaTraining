package com.hsbc.salary.worker;

import java.util.Scanner;

public class CalculateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		Scanner scanner = new Scanner(System.in);
		//creating an object for daily worker class
		DailyWorker dailyWorker = new DailyWorker();
		//creating an object for salary worker  class
		SalaryWorker salaryWorker = new SalaryWorker();		
		
		
		// salary depending upon the type of work
		System.out.println("Enter WorkType (DAILYWORKER, SALARYWORKER)");
		String workType = scanner.nextLine();
		
		switch(workType.toUpperCase()){
			case "DAILYWORKER":
				//retrieving user details
				System.out.println("enter you name");
				String name = scanner.next();
				dailyWorker.setName(name);
				scanner.nextLine();
				//user input number of days worked
				System.out.println("enter number of days");
				int noOfDays = scanner.nextInt();
				//payment fixed by the management
				int payment = 50;
				dailyWorker.payRate(noOfDays, payment);
				System.out.println(dailyWorker);
				break;
			case "SALARYWORKER":
				//retrieving user details
				System.out.println("enter you name");
				String fullName = scanner.next();
				salaryWorker.setName(fullName);
				scanner.nextLine();
				//payment fixed by the management
				int fixedPayment = 100;
				salaryWorker.payrate(40, fixedPayment);
				System.out.println(salaryWorker);

				break;
			default:
				//any option other given chosen will throw an alert message to chose correct option
				System.out.println("Choose correct option");
				
				
		}	
		
		scanner.close();	
		
	}

}
