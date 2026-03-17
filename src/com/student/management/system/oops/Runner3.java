package com.student.management.system.oops;

public class Runner3 {

	public static void main(String[] args) {

		Student s1 = new regularStudent.RegulerStudentBuilder("tanmay", 13, "2345456789", "pune")
				.withRollNumber(01).withMarksObtainedInEnglish(60).withMarksObtainedInMath(70).withMarksObtainedInScience(80).build();
		

		Student s2 = new sportsStudent.SportStudentBuilder("ram", 12, "4567899789", "nagpur")
				.withSportsScore(50).withRollNumber(02).withMarksObtainedInEnglish(77).withMarksObtainedInMath(80).withMarksObtainedInScience(75).build();

		System.out.println(s1);
		
		System.out.println(s2);
		
		
	

	}
}