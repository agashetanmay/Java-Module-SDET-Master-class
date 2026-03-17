package com.student.management.system.oops;

public class regularStudent extends Student {

	protected regularStudent(studentBuilder studentbuilder) {
		super(studentbuilder);
		percentage = calculatePercentage();
		grade = calculateGrade();
		
	}
	@Override
	public double calculatePercentage() {
		double percentage = totalMarks/3.0;
		return percentage;
	}
	
	public static class RegulerStudentBuilder extends studentBuilder{

		public RegulerStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
			
		}
		@Override
		public Student build() { // **in java or any programming language return type should of parent type (class).
			Student s1 = new  regularStudent(this); 
			return s1;
		}
		
	}

	@Override
	public String toString() {
		return "regularStudent [getName()=" + getName() + ", getAge()=" + getAge() + ", getRollNumber()="
				+ getRollNumber() + ", getMarksObtainedInEnglish()=" + getMarksObtainedInEnglish()
				+ ", getMarksObtainedInMath()=" + getMarksObtainedInMath() + ", getMarksObtainedInScience()="
				+ getMarksObtainedInScience() + ", getGrade()=" + getGrade() + ", getTotalMarks()=" + getTotalMarks()
				+ ", getPercentage()=" + getPercentage() + ", calculateTotalMarks()=" + calculateTotalMarks()
				+ ", calculateGrade()=" + calculateGrade() + ", getContactNumber()=" + getContactNumber()
				+ ", getAddress()=" + getAddress() + "]";
	}

	
	

}