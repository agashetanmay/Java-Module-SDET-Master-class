package com.exception.handling;

public class personRunner {

	public static void main(String[] args) {
		try {
			
			int result = 10/0;
			int a[] = new int [2];
			System.out.println(a[1]);
			Person p = null;
			
			System.out.println(p.getName());
			
		}
		catch(ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
	
	}
		
		finally {
			System.out.println("into the finally block");
		}
	}
}
