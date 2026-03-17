package com.statc.example;

public class Employe {
	
	private String name;
	public static String companyName;
	
	static {
		companyName= "infosys";
		System.out.println("inside the static block");   // this line will execute first in the class
	}
	
	public Employe(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + "]";
	}
	

}
