package com.builder;

public class Runner {

	public static void main(String[] args) {
	
		
		employee e1 = new employee.builder().Name("tanmay").EmpID(007).Salary(80000).build();
		
		System.out.println(e1);
	}

}
