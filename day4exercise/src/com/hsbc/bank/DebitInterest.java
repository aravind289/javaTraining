package com.hsbc.bank;

public interface DebitInterest extends Interest{
	
	public double deductMonthlyInt();	
	public double deductHalfYrlyInt();	
	public double deductAnnualInt();

}
