package com.student.management.system.oops;

public class transportFees implements Payable {
	
	private final double baseFees;
	private int paymentMonths;
	private final double siblingDiscount;
	private double finalTransportFees;
	
	
	public transportFees(double baseFees, int paymentMonths, double siblingDiscount) {
		this.baseFees = baseFees;
		this.paymentMonths = paymentMonths;
		this.siblingDiscount = siblingDiscount;
	}

	@Override
	public double calculatePayment() {
		finalTransportFees = (baseFees * paymentMonths) - siblingDiscount;
		return finalTransportFees;
	}

	@Override
	public double getDiscount() {
		System.out.println("total transport fee discount:"+siblingDiscount);
		return siblingDiscount;
	}

	@Override
	public void generateReciept() {
		System.out.println("********Generating transport fees reciept*********");
		System.out.println("BASE FEES :" +baseFees );
		System.out.println("PAYMENT FOR MONTH :"+paymentMonths);
		System.out.println("SIBILING DISCOUNT :"+siblingDiscount);
		System.out.println("TOTAL TRANSPORT FEES TO BE PAID :"+ finalTransportFees);
		
		System.out.println("**************GOOD DAY!!******************");
		
		
	}

}
