package com.student.management.system.oops;

public final class gradePolicy {
	
	private static final int A_PLUS;
	private static final int A_GRADE;
	private static final int B_PLUS;
	private static final int B_GRADE;
	private static final int C_PLUS;
	private static final int C_GRADE;
	private static final int D_GRADE;
	private static final int PASSINGMARKS;
	
	private gradePolicy() {  //to make sure that know one can create the object outside the class
		
	}
	
	static {
		System.out.println("grade policy initilize in the system");
		A_PLUS = 95;
		A_GRADE = 90;
		B_PLUS = 85;
		B_GRADE = 80;
		C_PLUS = 75;
		C_GRADE = 70;
		D_GRADE = 60;
		PASSINGMARKS = 33;
	
	}
	
	public static final String calculateGrade(double percentage) {
		if(percentage >= A_PLUS ) {
			return "A+";
		}
		if(percentage >= A_GRADE ) {
			return "A";
		}
		if(percentage >= B_PLUS ) {
			return "B+";
		}
		if(percentage>= B_GRADE ) {
			return "B";
		}
		if(percentage>= C_PLUS ) {
			return "C+";
		}
		if(percentage >= C_GRADE ) {
			return "C";
		}
		if(percentage >= D_GRADE ) {
			return "D";
		}
		
		return "F";
		
	}
	
}
