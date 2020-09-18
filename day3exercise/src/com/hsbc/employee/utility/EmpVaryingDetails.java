package com.hsbc.employee.utility;

public class EmpVaryingDetails {
	private int	empAge;
	private String empDesgn;
	private String	empLocation;
	private int empExpInYrs;
	/**
	 * @return the empAge
	 */
	public int getEmpAge() {
		return empAge;
	}
	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	/**
	 * @return the empDesgn
	 */
	public String getEmpDesgn() {
		return empDesgn;
	}
	/**
	 * @param empDesgn the empDesgn to set
	 */
	public void setEmpDesgn(String empDesgn) {
		this.empDesgn = empDesgn;
	}
	/**
	 * @return the empLocation
	 */
	public String getEmpLocation() {
		return empLocation;
	}
	/**
	 * @param empLocation the empLocation to set
	 */
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	/**
	 * @return the empExpInYrs
	 */
	public int getEmpExpInYrs() {
		return empExpInYrs;
	}
	/**
	 * @param empExpInYrs the empExpInYrs to set
	 */
	public void setEmpExpInYrs(int empExpInYrs) {
		this.empExpInYrs = empExpInYrs;
	}
	@Override
	public String toString() {
		return "EmpVaryingDetails [empAge=" + empAge + ", empDesgn=" + empDesgn + ", empLocation=" + empLocation
				+ ", empExpInYrs=" + empExpInYrs + "]";
	}
	
	//can i use to string here to get and set details ?
	
	
	}
