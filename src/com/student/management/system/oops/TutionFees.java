package com.student.management.system.oops;

public class TutionFees implements Payable {
	
	private final double baseFees;
	private final double scholarDeduction;
	private final double earlyPaymentDeduction;
	private double finalFeesAmount;
	
	public TutionFees(double baseFees, double scholarDeduction, double earlyPaymentDeduction) {
		super();
		this.baseFees = baseFees;
		this.scholarDeduction = scholarDeduction;
		this.earlyPaymentDeduction = earlyPaymentDeduction;
	}

	@Override
	public double calculatePayment() {
		finalFeesAmount = baseFees - scholarDeduction-earlyPaymentDeduction;
		return finalFeesAmount;
	}

	@Override
	public boolean processPayment(String paymentMode) {
		if(paymentMode.equalsIgnoreCase("CASH")||paymentMode.equalsIgnoreCase("UPI")||paymentMode.equalsIgnoreCase("CARD")) {
			System.out.println("payment is processing...");
			System.out.println("payment successful");
			return true;
		}
		else {
			System.err.println("something went wrong !!!");
			return false;
		}
		
	}
	@Override
	public void generateReciept() {
		System.out.println("********Generating fees reciept*********");
		System.out.println("BASE FEES :" +baseFees );
		System.out.println("DEDUCTION OFFERED :"+scholarDeduction);
		System.out.println("EARLY PAYMENT DISCOUNT :"+earlyPaymentDeduction);
		System.out.println("TOTAL FEES PAID :"+ finalFeesAmount);
		
		System.out.println("**************GOOD DAY!!******************");
		
	}

	@Override
	public double getDiscount() {
		double totalDiscount = scholarDeduction + earlyPaymentDeduction;
		System.out.println("total discount :" +totalDiscount);
		return totalDiscount;
	}

	
	

	

}
