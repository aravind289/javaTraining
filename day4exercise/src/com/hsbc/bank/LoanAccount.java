package com.hsbc.bank;

public interface LoanAccount extends Account{
	
	public void repayPrincipal() ;
	
	public void payInterest() ;
	
	public void payPartialPrincipal() ;

}
