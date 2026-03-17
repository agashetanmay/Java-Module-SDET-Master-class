package com.student.management.system.oops;

public interface Payable {
	
	/*
	 * interface always going to have variable as CONSTANT
	 * WE CAN USE default method 
	 * in java 9: user can create method as private
	 */
   
	public abstract double calculatePayment();
	
	public default boolean processPayment(PaymentMode paymentMode) {
		if(paymentMode==(paymentMode.CARD)||paymentMode==(paymentMode.CASH)||paymentMode==(paymentMode.UPI)) {
			
			System.out.println("payment is processing..."+ paymentMode);
			System.out.println("payment successful");
			return true;
		}
		else {
			System.err.println("something went wrong !!!");
			return false;
		}
		
	}
	
	public abstract double getDiscount();

	public abstract void generateReciept();
	
}
