package com.exception.handling;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		if (validateAge(age) && validateName(name)) {
			this.name = name;
			this.age = age;
		}
	}

	private boolean validateAge(int age) {
		if (age >= 18 && age <= 90) {
			return true;
		} else {
			try {
				throw new InvalidAgeException("invalid age"); // compile time exceptions
			} catch (InvalidAgeException e) {
				System.err.println(e.getMessage());
			}
		}
		return false;
	}

	private boolean validateName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new InvalidNameException("Name can not be null and empty");
		} else if (!name.matches("[a-zA-Z\\s]+")) {
			throw new InvalidNameException("Name can only have alphabet");

		}
		return true;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		
		return age;
	}

	public void setName(String name) {
		if(validateName(name)) {
			this.name = name;
		}
		
	}

	public void setName(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
