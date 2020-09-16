package com.hsbcs.banking;

import java.util.Scanner;

public class IncomeTax {
	static Userdetails user = new Userdetails();
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//retrieving the gender kind
		System.out.println("Enter your gender :");
		
		// storing it in a variable
		String genderType = user.setGenderType(scanner.next());
		taxValue(genderType);
		scanner.close();
		

	}
	
	//defining tax percentage according to the gender type
	public static void taxValue(String genderType) {
		System.out.println("Enter your Salary :");
		// user input the salary amount
		long userSalary = user.setSalaryAmount(scanner.nextLong());
		switch(genderType) {
		case "Male":
			taxValueForMale(userSalary);
			break;
		case "Female":
			taxValueForFemale(userSalary);
			break;
		default:
			System.out.println("No other genders specified");
		}
	}
	
	//tax calculations for male
	public static void taxValueForMale(long userSalary) {
		
		float[] taxPercentage = {0.0f,0.1f,0.2f,0.3f}; 
		if(userSalary<1000000) {
			user.setTaxCalculations(taxPercentage[0]);
		}
		else if(1000000<=userSalary && userSalary<=1900000) {
			user.setTaxCalculations(taxPercentage[1]);
		}
		
		else if(2000000<=userSalary && userSalary<=2900000) {
			user.setTaxCalculations(taxPercentage[2]);
		}
		
		else {
			user.setTaxCalculations(taxPercentage[3]);
		}
		System.out.println(user.getGenderType()+" "+ user.getTaxCalculations()*100+"%");
	}
	
	//tax calculations for female
	public static void taxValueForFemale(long userSalary) {
		
		float[] taxPercentage = {0.0f,0.05f,0.15f,0.3f}; 
		if(userSalary<1000000) {
			user.setTaxCalculations(taxPercentage[0]);
		}
		else if(1000000<=userSalary && userSalary<=1900000) {
			user.setTaxCalculations(taxPercentage[1]);
		}
		
		else if(2000000<=userSalary && userSalary<=2900000) {
			user.setTaxCalculations(taxPercentage[2]);
		}
		
		else {
			user.setTaxCalculations(taxPercentage[3]);
		}
		System.out.println(user.getGenderType()+" "+ user.getTaxCalculations()*100+"%");
	}
	
	

}
