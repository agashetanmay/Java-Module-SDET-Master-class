package com.builder;

public class employee {

	private final String name;
	private final int empID;
	private final double salary;

	private employee(String name, int empID, double salary) {  // we cannot create the object outside the class 
		                                                        // as we make the constructor as private
		this.name = name;
		this.empID = empID;
		this.salary = salary;
	}
 /// we have remove all the setters to make call im-mutable
	public String getName() {
		return name;
	}

	public int getEmpID() {
		return empID;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", empID=" + empID + ", salary=" + salary + "]";
	}

	public static class builder {  //inner class
		private String name;
		private int empID;
		private double salary;

		public builder Name(String name) {
			this.name = name;
			return this; // it will return the current class object
		}

		public builder EmpID(int empID) {
			this.empID = empID;
			return this; // it will return the current class object
		}

		public builder Salary(double salary) {
			this.salary = salary;
			return this; // it will return the current class object
		}
		
		public employee build() {
			employee e = new employee(name, empID, salary);
			
			return e;
		}

	}

}
