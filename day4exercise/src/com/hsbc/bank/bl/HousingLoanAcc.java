package com.hsbc.bank.bl;

import com.hsbc.bank.DebitInterest;
import com.hsbc.bank.LoanAccount;

public class HousingLoanAcc implements LoanAccount,DebitInterest{

	@Override
	public boolean createAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int calcInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deductMonthlyInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deductAnnualInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		
	}

}
