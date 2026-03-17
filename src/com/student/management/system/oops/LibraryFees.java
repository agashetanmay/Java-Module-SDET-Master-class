package com.student.management.system.oops;

public class LibraryFees implements Payable{
	
	private double basicSubscriptionFees;
	private double additionalBookCharges;
	private double lateReturnPenaltiesFees;
	private double finalLibraryFees;
	
	public LibraryFees(double basicSubscriptionFees, double additionalBookCharges, double lateReturnPenaltiesFees) {
		super();
		this.basicSubscriptionFees = basicSubscriptionFees;
		this.additionalBookCharges = additionalBookCharges;
		this.lateReturnPenaltiesFees = lateReturnPenaltiesFees;
	}

	@Override
	public double calculatePayment() {
		finalLibraryFees = basicSubscriptionFees + additionalBookCharges + lateReturnPenaltiesFees;
		return finalLibraryFees;
	}
	
	public boolean processPayment(String paymentMode) {  //this method will override 
		                                                 //the default processPayment method in payable interface
		                                                 // when user select BITCOIN as a payment method
		if(paymentMode.equalsIgnoreCase("BITCOIN")){
			System.out.println("payment is processing...");
			System.out.println("0.0001 BTC is compledted successfully!!!");
			return true;
		}
		else {
			System.err.println("something went wrong !!!");
			return false;
		}
		
	}

	@Override
	public double getDiscount() {
		
		return 0;
	}

	@Override
	public void generateReciept() {
		System.out.println("********Generating transport fees reciept*********");
		System.out.println("Subscription Fees :" +basicSubscriptionFees);
		System.out.println("Additional book charges :"+additionalBookCharges);
		System.out.println("Late return fees :"+lateReturnPenaltiesFees);
		System.out.println("TOTAL LIBRARY FEE :"+ finalLibraryFees);
		
		System.out.println("**************GOOD DAY!!******************");
		
		
	}

}
