package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {       //this error is because of implementation of builder design pattern
		Person s1 = new Student("tanmay",14,"6768789890","shiv nagar tumsar",006,45,45,60); // in java we always take reference of parent class and create object of child class
	((Student)s1).calculateTotalMarks();  // explicitily typecast the student class 
	((Student)s1).calculatePercentage();
	((Student)s1).calculateGrade();
	((Student)s1).printStudentInfo();
	s1.updateInformation("nagpur", "3478989898");  // this method present in both the class but while runtime java will call the method from child class whose object being created
	s1.updateInformation("7890908909", false);
    s1.updateInformation("chennai");
	((Student)s1).printStudentInfo();
		
	Person s2 = new Student("ram",15,"3456567878","shiv nagar",007,90,80,70);   //this error is because of implementation of builder design pattern
	((Student)s2).calculateTotalMarks();  // explicitily typecast the student class 
	((Student)s2).calculatePercentage();
	((Student)s2).calculateGrade();
	((Student)s2).printStudentInfo();
	
	
	
		Person t1 = new Teacher("tanmay",23,"6768789890","shiv nagar tumsar","english teacher","T101","maths",10);
		System.out.println(t1);
		t1.updateInformation("solapur", "1234567678");
		t1.updateInformation("2323232323", false);
		t1.updateInformation("pandharpur");
		
		System.out.println(t1);
		
		System.out.println( "total person joined today = "+ Person.getTotalPersonCount());
		
		System.out.println( "total student joined today = "+ Student.getTotalStudentCount());
		
		System.out.println( "total teacher joined today = "+ Teacher.getTotalTeacherCount());
		

	}

}
