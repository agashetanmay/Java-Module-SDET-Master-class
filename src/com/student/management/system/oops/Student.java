package com.student.management.system.oops;

import java.util.Objects;

import com.student.management.system.exceptions.InvalidAddressException;
import com.student.management.system.exceptions.InvalidAgeException;
import com.student.management.system.exceptions.InvalidContactNumberException;
import com.student.management.system.exceptions.InvalidMarksException;

public abstract class Student extends Person {  // start

	private final int rollNumber;
	private final double marksObtainedInEnglish;
	private final double marksObtainedInMath;
	private double marksObtainedInScience;
	protected final double totalMarks;
	protected double percentage;
	protected  String grade;
	private static int studentCount = 0;
	
//	public Student(String name, int age, String contactNumber, String address, int rollNumber,
//			double marksObtainedInEnglish, double marksObtainedInMath, double marksObtainedInScience
//			) {
//		super(name, age, contactNumber, address);
//		
//		if (validateAge(age) && validateRollNumber(rollNumber)&& validateAddress(address)&& validateContactNumber(contactNumber)){
//		this.rollNumber = rollNumber;
//		this.marksObtainedInEnglish = marksObtainedInEnglish;
//		this.marksObtainedInMath = marksObtainedInMath;
//		this.marksObtainedInScience = marksObtainedInScience;
//		}
//		studentCount++;
//	}
	protected Student(studentBuilder studentbuilder) {
		super(studentbuilder.name,studentbuilder.age,studentbuilder.contactNumber,studentbuilder.address);
		this.rollNumber = studentbuilder.rollNumber;
		this.marksObtainedInEnglish = studentbuilder.marksObtainedInEnglish;
		this.marksObtainedInMath = studentbuilder.marksObtainedInMath;
		this.marksObtainedInScience =studentbuilder.marksObtainedInScience;
		totalMarks = calculateTotalMarks();
		
		studentCount++;
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
		if (age <= 20 && age >= 10) {
			this.age = age;
		} else {
			System.out.println("invalid age for student");
		}
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}
   
//	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
//		if (marksObtainedInEnglish > 0 && marksObtainedInEnglish < 100) {
//			this.marksObtainedInEnglish = marksObtainedInEnglish;
//		} else {
//			System.out.println("invalid marks for english..please add marks in the rage of 0 and 100");
//		}
//	}
	

	public double getMarksObtainedInMath() {
		return marksObtainedInMath;
	}
//	public void setMarksObtainedInMath(double marksObtainedInMath) {
//		if (marksObtainedInMath > 0 && marksObtainedInMath < 100) {
//			this.marksObtainedInMath = marksObtainedInMath;
//		} else {
//			System.out.println("invalid marks for maths..please add marks in the rage of 0 and 100");
//		}
//    	}

	
	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}
	
//	public void setMarksObtainedInScience(double marksObtainedInScience) {
//		if (marksObtainedInScience > 0 && marksObtainedInScience < 100) {
//			this.marksObtainedInScience = marksObtainedInScience;
//		} else {
//			System.out.println("invalid marks for science..please add marks in the rage of 0 and 100");
//		}
//	}
	public String getGrade() {
		return grade;
	}

	public double getTotalMarks() {
		return totalMarks;
	}
	public double getPercentage() {
		return percentage;
	}

	public final double calculateTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInMath + marksObtainedInScience;
		return totalMarks;
	}

	public abstract double calculatePercentage();
	
	
	public final String calculateGrade() {
          String grade;
		if (percentage == 0) {
			grade = "can not be calculated";
		}
		else {
		grade = gradePolicy.calculateGrade(percentage);
	}
		return grade;
	}
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public void printStudentInfo() {
		System.out.println("***Student information****");
		System.out.println("student name: " + name);
		System.out.println("student age: " + age);
		System.out.println("student rollnumber:" + rollNumber);
		System.out.println("marks obtain in english: " + marksObtainedInEnglish);
		System.out.println("marks obtain in maths: " + marksObtainedInMath);
		System.out.println("marks obtain in science: " + marksObtainedInScience);
		System.out.println("total marks: " + totalMarks);
		System.out.println("percentage: " + percentage);
		System.out.println("Grade: " + grade);
		System.out.println("student contact number: " + contactNumber);
		System.out.println("student home address: " +  address);
		System.out.println(" ");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInMath=" + marksObtainedInMath + ", marksObtainedInScience="
				+ marksObtainedInScience + ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", grade="
				+ grade + ", contactNumber=" + contactNumber + ", Address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, grade, marksObtainedInEnglish, marksObtainedInMath,
				marksObtainedInScience, name, percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && contactNumber == other.contactNumber
				&& Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMath) == Double.doubleToLongBits(other.marksObtainedInMath)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}
	
	
	public boolean updateInformation(String newAddress, String newContactNumber) {
		System.out.println("requesting parent approval");
		boolean parentApprovalStatus = parentApproval();
		
		if(parentApprovalStatus){
			 if(super.updateInformation(newAddress, newContactNumber)) {
			System.out.println("notifying the parents.....");
				return true; 
			 }
		}
		else {
			System.err.println("no approval from parents....");
			return false;
		}
		return false;
	
}
	
	public boolean updateInformation(String newContactNumber) {
		System.out.println("requesting parent approval for contact number updation");
		boolean parentApprovalStatus = parentApproval();
		
		if(parentApprovalStatus){
			 if(super.updateInformation( newContactNumber)) {
			System.out.println("notifying the parents contact number has updated successfully.....");
				return true; 
			 }
		}
		else {
			System.err.println("no approval from parents....");
			return false;
		}
		return false;
	
}
	public boolean updateInformation(String newAddress, boolean update) {
		System.out.println("requesting parent approval for address updation");
		boolean parentApprovalStatus = parentApproval();
		
		if(parentApprovalStatus){
			 if(super.updateInformation(newAddress, update)) {
			System.out.println("notifying the parents address has updated successfully.....");
				return true; 
			 }
		}
		else {
			System.err.println("no approval from parents....");
			return false;
		}
		return false;
	
}
	
	private boolean parentApproval() {
		return true;
	}
	
	public static int getTotalStudentCount() {
		return studentCount;
	}
	
	public abstract static class studentBuilder{
		//mandatory fields
		private String name;
		private int age;
		private String contactNumber;
		private String address;
		//optional fields
		private int rollNumber;
		private double marksObtainedInEnglish;
		private double marksObtainedInMath;
		private double marksObtainedInScience;
		
		public studentBuilder(String name,int age,String contactNumber,String address) {
	    if (validateAge(age) && validateAddress(address)&& validateContactNumber(contactNumber)) {
	    
	    	this.age = age;
		    this.contactNumber = contactNumber;
		    this.address = address;
		    this.name = name;
		   
	    }
		}
		
		public studentBuilder withRollNumber(int rollNumber) {
			if(validateRollNumber(rollNumber)) {
				this.rollNumber = rollNumber;	 
			}
			return this;
			
		}
		public studentBuilder withMarksObtainedInEnglish(double marksObtainedInEnglish) {
			if(validateMarks(marksObtainedInEnglish)) {
				this.marksObtainedInEnglish = marksObtainedInEnglish;
			}
			
			 return this;
		}
		public studentBuilder withMarksObtainedInMath(double marksObtainedInMath) {
			if(validateMarks(marksObtainedInMath)) {
				this.marksObtainedInMath = marksObtainedInMath;
			}
			 return this;
		}
		public studentBuilder withMarksObtainedInScience(double marksObtainedInScience) {
			if(validateMarks(marksObtainedInScience)) {
				this.marksObtainedInScience = marksObtainedInScience;
			}
			 return this;
		}
		
		private boolean validateAge(int age) {
			if (age <= 19 && age >= 10) {
				return true;
			} else {
				throw new InvalidAgeException("invalid age student age must be between 10 and 20");
					}
			}
		
		private boolean validateAddress(String address) {
			if (!address.isEmpty()) {
				return true;
			} else {
				try {
					throw new InvalidAddressException("Address cannot be empty or Null");
				}
				catch(InvalidAddressException e){
					System.err.println(e.getMessage());
				    e.printStackTrace();
				}
			}
			return false;
		}
		private boolean validateContactNumber(String contactNumber) {
			if (contactNumber!=null && contactNumber.matches("\\d{10}")) {
				return true;
			}
			else {
				try {
					throw new InvalidContactNumberException("please enter 10 digit contact number only");
				}
				catch(InvalidContactNumberException e){
					System.out.println(e.getMessage());
					e.printStackTrace();
					
				}
				return false;
				
			}	
		}
		
		private final boolean validateRollNumber(int rollNumber) {
			if (rollNumber >= 1 && rollNumber <= 100) {
				return true;
			} else {
				System.err.println("invalid roll number between 1 to 100");
				return false;
			}
		}
		
		private boolean validateMarks(double marksObtained) {
		    if (marksObtained >= 0 && marksObtained <= 100) {
		        return true;
		    } else {
		        try {
		        	throw new InvalidMarksException("please enter marks in the rage of 0 to 100");
		        }
		        catch(InvalidMarksException e){
		        	System.err.println(e.getMessage());
		        }
		        return false;
		    }
		}
		
		public abstract Student build();
		
	}	
}//end
