package com.hsbc.salary.worker;

public class Worker {
	//name common factor for workers
	private String name;	

	@Override
	public String toString() {
		return "Worker name=" + name ;
	}	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	

}
