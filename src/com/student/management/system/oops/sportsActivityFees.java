package com.student.management.system.oops;

public class sportsActivityFees implements Payable {
	
	private double equipmentCharges;
	private double tournamentFees;
	private double teamUniformCost;
	private double discountForStatePlayer;
	private double finalSportFees;
	
	public sportsActivityFees(double equipmentCharges, double tournamentFees, double teamUniformCost,
			double discountForStatePlayer) {
		super();
		this.equipmentCharges = equipmentCharges;
		this.tournamentFees = tournamentFees;
		this.teamUniformCost = teamUniformCost;
		this.discountForStatePlayer = discountForStatePlayer;
	}

	@Override
	public double calculatePayment() {
		finalSportFees =  equipmentCharges + tournamentFees + teamUniformCost - discountForStatePlayer;
		return finalSportFees;
	}

	@Override
	public double getDiscount() {
      System.out.println("total discount for sport activity :"+discountForStatePlayer);
		return discountForStatePlayer;
	}

	@Override
	public void generateReciept() {
		System.out.println("********Generating sport fees reciept*********");
		System.out.println("EQUIPMENT FEES:" +equipmentCharges );
		System.out.println("TOURNAMENT FEES:"+ tournamentFees);
		System.out.println("UNIFORM COST :"+teamUniformCost);
		System.out.println("STATE PLAYER DISCOUNT :"+ discountForStatePlayer);
		System.out.println("TOTAL FEES PAID :" +finalSportFees );
		
		System.out.println("**************GOOD DAY!!******************");
		
	}
	
	}



