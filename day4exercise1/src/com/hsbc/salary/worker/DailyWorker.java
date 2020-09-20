package com.hsbc.salary.worker;

public class DailyWorker extends Worker{
		//salary depending upon the number of days 
		private int numberOfDays;
		private int Salary =0;
		//method to calculate earning depending upon the work done 
		public int payRate(int noOfDays,int payment) {
			Salary= numberOfDays*payment;
			return Salary;
		}	
		//to return name from the super class and other related factors
		@Override
		public String toString() {
			return super.toString()+"DailyWorker numberOfDays=" + numberOfDays + ", Salary=" + Salary ;
		}

		/**
		 * @param numberOfDays the numberOfDays to set
		 */
		public void setNumberOfDays(int numberOfDays) {
			this.numberOfDays = numberOfDays;
		}
	
}
