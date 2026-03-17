package com.student.management.system.oops;

public class PaymentRunner {

	public static void main(String[] args) {


		Payable payable = new TutionFees(60000, 10000, 5000);
		
		payable.calculatePayment();
		payable.generateReciept();
		payable.processPayment(PaymentMode.CARD);
		payable.getDiscount();
		System.out.println(PaymentMode.CARD.getDescription());
		
		//It is used to convert String to enum!!!!
		PaymentMode p = PaymentMode.valueOf("UPI");
		System.out.println(p);
		
		Payable payable1 = new sportsActivityFees(20000, 5000, 10000, 2000);
		payable1.calculatePayment();
		payable1.processPayment(PaymentMode.CASH);
		payable1.getDiscount();
		payable1.generateReciept();  
		System.out.println(PaymentMode.CASH.getDescription());
		
		Payable payable2 = new transportFees(1000, 5, 500);
		payable2.calculatePayment();
		payable2.processPayment(PaymentMode.UPI);
		payable2.getDiscount();
		payable2.generateReciept(); 
		System.out.println(PaymentMode.UPI.getDescription());
		
		Payable payable3 = new LibraryFees(500, 200, 100);
		payable3.calculatePayment();
		payable3.processPayment(PaymentMode.UPI);
		payable3.getDiscount();
		payable3.generateReciept(); 
	}

}
