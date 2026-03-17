package com.student.management.system.oops;

public class sportsStudent extends Student {

	protected double sportsScore;

	private sportsStudent(studentBuilder studentbuilder) {
		super(studentbuilder);
		this.sportsScore = ((SportStudentBuilder) studentbuilder).sportsScore;
		// as studentbuilder is reference type of studentBuilder class we have downcast
		// it
		// ** sportStudentBuilder down casted to studentbuilder so that we can access to
		// sport score variable.

		percentage = calculatePercentage();
		grade = calculateGrade();

	}

	public double calculatePercentage() {

		System.out.println("totalMarks=" + getTotalMarks());
		System.out.println("SportMarks = " + sportsScore);

		double academicPercentage = getTotalMarks() / 3.0;
		double finalPercentage = (academicPercentage * 0.8) + (sportsScore * 0.2);

		return finalPercentage;
	}

	public static class SportStudentBuilder extends studentBuilder {
		private double sportsScore;

		public SportStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
		}

		public SportStudentBuilder withSportsScore(double sportScore) {
			if (sportsScore >= 0 && sportsScore <= 100) {
				this.sportsScore = sportScore;
			}
			return this;
		}

		@Override
		public Student build() {
			Student s1 = new sportsStudent(this);
			return s1;
		}

	}

	@Override
	public String toString() {
		return "sportsStudent [sportsScore=" + sportsScore + ", getName =" + getName() + ", getAge=" + getAge()
				+ ", getRollNumber=" + getRollNumber() + ", getMarksObtainedInEnglish=" + getMarksObtainedInEnglish()
				+ ", getMarksObtainedInMath=" + getMarksObtainedInMath() + ", getMarksObtainedInScience="
				+ getMarksObtainedInScience() + ", getGrade()=" + getGrade() + ", getTotalMarks=" + getTotalMarks()
				+ ", getPercentage=" + getPercentage() + ", calculateTotalMarks=" + calculateTotalMarks()
				+ ", calculateGrade=" + calculateGrade() + ", getContactNumber=" + getContactNumber() + ", getAddress="
				+ getAddress() + "]";
	}

}
