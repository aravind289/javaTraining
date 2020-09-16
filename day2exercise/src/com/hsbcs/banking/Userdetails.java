package com.hsbcs.banking;

public class Userdetails {
	//gender variable
	private String genderType;
	public String getGenderType() {
		return genderType;
	}

	public String setGenderType(String genderType) {
		this.genderType = genderType;
		return this.genderType ;
	}
	
	//salary  details
	
	private long salaryAmount;
	public long getSalaryAmount() {
		return salaryAmount;
	}

	public long setSalaryAmount(long salaryAmount) {
		this.salaryAmount = salaryAmount;
		return this.salaryAmount;
	}
	
	//tax calculations
	
	private float taxCalculations;	

	public float getTaxCalculations() {
		return taxCalculations;
	}

	public void setTaxCalculations(float taxCalculations) {
		this.taxCalculations = taxCalculations;
	}
}
