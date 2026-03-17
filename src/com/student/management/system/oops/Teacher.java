package com.student.management.system.oops;

import com.student.management.system.exceptions.InvalidAgeException;
import com.student.management.system.exceptions.InvalidEmployeeIdException;

public final class Teacher extends Person {

	private String professionalDetails;
	private String empID;
	private String subject;
	private int yearOfExperience;
	private double salary;
	private static final int BASE_SALARY = 30000; // constant variable should declared as final and static;
	private static final int EXPERIENCE_BONOUS = 2000;
	private static int teacherCount = 0;

	public Teacher(String name, int age, String contactNumber, String address, String professionalDetails, String empID,
			String subject, int yearOfExperience) {
		super(name, age, contactNumber, address);

		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address) && EmpID(empID)
				&& validateSubject(subject) && validateYearsOfExperience(yearOfExperience)) {
			this.professionalDetails = professionalDetails;
			this.empID = empID;
			this.subject = subject;
			this.yearOfExperience = yearOfExperience;
			calculateSalary();
		}
		teacherCount++;
	}

	public boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			throw new InvalidAgeException("you have entered invalid age");
		}
		
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("invalid teacher contact number");
			return false;
		}
	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("invalid teacher address");
			return false;
		}
	}

	public final boolean EmpID(String empID) {
		if (empID.matches("T\\d{3}")) {
			return true;
		} else {
			try {
				throw new InvalidEmployeeIdException("Invalid teacher ID");
			}
			catch(InvalidEmployeeIdException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			return false;
		}
	}

	public boolean validateSubject(String subject) {
		if (!subject.isEmpty()) {
			return true;
		} else {
			System.err.println("invalid teacher subject");
			return false;
		}
	}

	public boolean validateYearsOfExperience(int yearOfExperience) {
		if (yearOfExperience >= 0 && yearOfExperience <= 35) {
			return true;
		} else {
			System.err.println("invalid YOE... please enter valid YOE");
			return false;
		}
	}

	protected final void calculateSalary() { // Restricted method overriding
		salary = BASE_SALARY + (yearOfExperience * EXPERIENCE_BONOUS);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (validateAge(age)) {
			this.age = age;
		}
	}

	public String getContactNumnber() {
		return contactNumber;
	}

	public void setContactNumnber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getProfessionalDetails() {
		return professionalDetails;
	}

	public void setProfessionalDetails(String professionalDetails) {
		this.professionalDetails = professionalDetails;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		if (EmpID(empID)) {
			this.empID = empID;
		}
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", professionalDetails=" + professionalDetails + ", empID=" + empID + ", subject=" + subject
				+ ", yearOfExperience=" + yearOfExperience + ", salary=" + salary + "]";
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {

		System.out.println("notifying HR for approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println(
						"notifying teacher that HR approved the request for updating contact number and address");
				return true;
			}
		} else {
			System.err.println("no approval from HR ....");
			return false;
		}
		return false;

	}

	public boolean updateInformation(String newAddress) {

		System.out.println("notifying HR for approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newAddress)) {
				System.out.println("notifying teacher that HR approved the request for updating address");
				return true;
			}
		} else {
			System.err.println("no approval from HR ....");
			return false;
		}
		return false;

	}

	public boolean updateInformation(String newContactNumber, boolean update) {

		System.out.println("notifying HR for approval");
		boolean hrApproval = getHRApproval();
		if (hrApproval) {
			if (super.updateInformation(newContactNumber, update)) {
				System.out.println("notifying teacher that HR approved the request for updating address");
				return true;
			}
		} else {
			System.err.println("no approval from HR ....");
			return false;
		}
		return false;

	}

	private boolean getHRApproval() {
		System.out.println("HR approved the request");
		return true;
	}

	public static int getTotalTeacherCount() {
		return teacherCount;
	}

}
