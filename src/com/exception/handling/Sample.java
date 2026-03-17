package com.exception.handling;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println("line no 1");
		
		
		try{
			int result = 10/0;
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		
			
		}
		
		System.out.println("line no 2");
		System.out.println("line no 3");
	}

}
