package com.student.management.system.oops;

public class Runner2 {

	public static void main(String[] args) {

		Student s1 = new Student.studentBuilder("tanmay", 16, "3456789090", "mumbai").withMarksObtainedInEnglish(90)
				.withMarksObtainedInMath(100).withMarksObtainedInScience(90).withRollNumber(99).build();
		
		System.out.println(s1);
		
		s1.printStudentInfo();
		
		
		
		System.out.println( "total student joined today = "+ Student.getTotalStudentCount());
		
		
	}
	

}
