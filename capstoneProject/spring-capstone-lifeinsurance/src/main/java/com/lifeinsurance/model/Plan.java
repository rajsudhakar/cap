package com.lifeinsurance.model;

public enum Plan {
	
	wli("Whole Life Insurance"),
	ep("Endowment Plan"),
	mbp("Money Back Plan"),
	rp("Retirement Plan"),
	cip("Child Insurance Plan"),
	uli("Unit Linked Insurance Plan"),
	saving("Savings and Investment Plan");
	
	public String type;

	private Plan(String plan) {
		this.type = plan;
	}
	
	
	
	
	 
		
		
}
