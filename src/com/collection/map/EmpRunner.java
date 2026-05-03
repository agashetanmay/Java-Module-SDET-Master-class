package com.collection.map;

public class EmpRunner {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(001, "tanmay");
		Emp e2 = new Emp(002, "rmd");
     
		System.out.println(e1);
		
		int result = e1.hashCode();
		int result1 = e2.hashCode();
		
		System.out.println(result);
		System.out.println(result1);

	}

}
