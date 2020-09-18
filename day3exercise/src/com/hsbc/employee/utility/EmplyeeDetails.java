	/*1.	Employee  name alone
2.	Employee name and id
3.	Employee name, id and age
4.	Employee name, id and designation
5.	Employee name, id, age and designation
6.	Employee name, id, age and location
7.	Employee name, id, age and experience
8.	 Employee name, id, designation and experience
9.	Employee name, id, designation, location and experience
10.	Employee name, id, age, designation,  location and experience
*/


package com.hsbc.employee.utility;

import java.util.Scanner;

public class EmplyeeDetails {
	
	private String empName;
	private int empId;

	public   EmplyeeDetails(String name) {
		//it works without this too ???
		this.empName = name;
		
	}
	public  EmplyeeDetails(int id) {
		//it works without this too ???
		this.empId = id;
		
	}
	
	@Override
	public String toString() {
		return "EmplyeeDetails [empName=" + empName + ", empId=" + empId + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter Employeename");
		
		EmplyeeDetails empName = new EmplyeeDetails(scanner.next());
		
		
		System.out.println("enter employee id");
		scanner.nextLine();
		EmplyeeDetails empId = new EmplyeeDetails(scanner.nextInt());
		
		EmpVaryingDetails empVardetails = new EmpVaryingDetails();
		
		System.out.println("Enter age");
		empVardetails.setEmpAge(scanner.nextInt());
		System.out.println("Enter designation");
		empVardetails.setEmpDesgn(scanner.next());
		System.out.println("Enter location");
		empVardetails.setEmpLocation(scanner.next());
		System.out.println("Enter Experience");
		empVardetails.setEmpExpInYrs(scanner.nextInt());
		
		
		//using getter and setter
//		System.out.println(empName.empName);
//		System.out.println(empId.empId);
//		System.out.println(empVardetails.getEmpAge());
//		System.out.println(empVardetails.getEmpDesgn());
//		System.out.println(empVardetails.getEmpLocation());
//		System.out.println(empVardetails.getEmpExpInYrs()+"+ years");
//		
		
		//using to string
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empVardetails);
		
		scanner.close();
	}
	

}
