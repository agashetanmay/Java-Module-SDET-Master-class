package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

	public static String StudentName[] = new String[100];
	public static int StudentAge[] = new int[100];
	public static double MarksObtainedInEnglish[] = new double[100];
	public static double MarksObtainedInScience[] = new double[100];
	public static double MarksObtainedInMaths[] = new double[100];
	public static String StudentGrade[] = new String[100];
	public static int StudentRollNumber[] = new int[100];
	public static Scanner scanner = new Scanner(System.in);
	public static double totalMarkObtained [] = new double[100];
	public static double percentageObtained [] = new double[100];
	public static int options;
    public static int index = 0;

	public static void main(String[] args) {
		System.out.println("*** student mamangement system ***");
		// reading value from terminal or console

		while (true) {

			System.out.println("1.add a student");
			System.out.println("2.print student details");
			System.out.println("3.print all student details");
			System.out.println("4.exit");
			System.out.println("select the option 1-4 below:");

			options = scanner.nextInt();

			switch (options) {

			case 1:
				AddStudent();
				break;

			case 2:
				printStudentInformation();
				break;

			case 3:
				printAllStudentInformation();
				break;

			case 4:
				exitApp();
				break;
			}
		}
	}

	public static void exitApp() {
		System.out.println("exit from the application...");
		System.exit(0);
	}

	private static void printAllStudentInformation() {
		System.out.println("print all student information");
		
		for(int i=0;i<index;i++) {
			System.out.println("************************************");
		System.out.println("Student name: " + StudentName[i]);
		System.out.println("student Age: " + StudentAge[i]);
		System.out.println("StudentRollNumber: " + StudentRollNumber[i]);
		System.out.println("Mark Obtained");
		System.out.println("Marks Obtain In English: " + MarksObtainedInEnglish[i]);
		System.out.println("marks Obtain in Science: " + MarksObtainedInScience[i]);
		System.out.println("marks obtain in maths: " + MarksObtainedInMaths[i]);
		System.out.println("student grade: " + StudentGrade[i]);
		System.out.println("Total Marks Obtained: " + totalMarkObtained[i]);
		System.out.println("percentage Obtained: " + percentageObtained[i]);
		System.out.println("************************************");
		}
	}

	private static void printStudentInformation() {
		System.out.println("print student information");
		System.out.println("enter the index from which you want to retrieve information");
		int userindex = scanner.nextInt();
		System.out.println("************************************");
		System.out.println("Student name: " + StudentName[userindex]);
		System.out.println("student Age: " + StudentAge[userindex]);
		System.out.println("StudentRollNumber: " + StudentRollNumber[userindex]);
		System.out.println("Mark Obtained");
		System.out.println("Marks Obtain In English: " + MarksObtainedInEnglish[userindex]);
		System.out.println("marks Obtain in Science: " + MarksObtainedInScience[userindex]);
		System.out.println("marks obtain in maths: " + MarksObtainedInMaths[userindex]);
		System.out.println("student grade: " + StudentGrade[userindex]);
		System.out.println("Total Marks Obtained: " + totalMarkObtained[userindex]);
		System.out.println("percentage Obtained: " + percentageObtained[userindex]);
		System.out.println("************************************");

	}
	public static void AddStudent() {
		System.out.println("Student name");
		StudentName[index] = scanner.next();
		System.out.println("student Age");
		StudentAge[index] = scanner.nextInt();
		System.out.println("StudentRollNumber");
		StudentRollNumber[index] = scanner.nextInt();
		System.out.println("Mark Obtained:");
		System.out.println("Marks Obtain In English:");
		MarksObtainedInEnglish[index] = scanner.nextDouble();
		System.out.println("marks obtain in science:");
		MarksObtainedInScience[index] = scanner.nextDouble();
		System.out.println("marks obtain in maths:");
		MarksObtainedInMaths[index] = scanner.nextDouble();

		totalMarkObtained[index] = MarksObtainedInEnglish[index] + MarksObtainedInScience[index] + MarksObtainedInMaths[index];
		percentageObtained[index] = totalMarkObtained[index] / 3.0;

		if (percentageObtained[index]>= 95) {
			StudentGrade[index] = "A+";
		} else if (percentageObtained[index] >= 90) {
			StudentGrade[index] = "A";
		} else if (percentageObtained[index] >= 85) {
			StudentGrade[index] = "B+";
		} else if (percentageObtained[index] >= 80) {
			StudentGrade[index] = "B";
		} else if (percentageObtained[index] >= 75) {
			StudentGrade[index] = "C++";
		} else if (percentageObtained[index] >= 70) {
			StudentGrade[index] = "C";
		} else {
			StudentGrade[index] = "fail";
		}
		index = index+1;
		System.out.println("student information saved successfully");
	}
}