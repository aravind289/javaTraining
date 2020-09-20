package com.hsbc.salary.worker;

public class SalaryWorker extends Worker{
	private int Salary =0;
	//to calculate the salary of the worker per week
	public int payrate(int workHours,int payment) {
		Salary = workHours*payment;
		return Salary;
	}
	@Override
	public String toString() {
		return super.toString()+"SalaryWorker Salary=" + Salary + "";
	}
	
	

}
