package com.student.management.system.oops;

public enum PaymentMode {
	
	UPI("payment via phonePay"),
	CARD("payment via credit card"),
	CASH ("payment via cash");
	
	private String description;   //instance variable created to read the descriptions

	private PaymentMode(String description) {   // in Enum constructor is always going to be private you can can create object outside class
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
