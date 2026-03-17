package com.student.management.system.oops;

import com.student.management.system.exceptions.InvalidAddressException;
import com.student.management.system.exceptions.InvalidContactNumberException;

public abstract class Person {

	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;
	private static int personCounter=0;

	public Person(String name, int age, String contactNumber, String address) {
		if (validateContactNumber(contactNumber) && validateAddress(address)) {
			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
			this.address = address;
			personCounter++;
		}
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
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
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

	public boolean validateAddress(String address) {
		if (address.isEmpty() || address == null) {
			try {
				throw new InvalidAddressException("Address cannot be empty or Null");
			}
			catch(InvalidAddressException e){
				System.err.println(e.getMessage());
			    e.printStackTrace();
			}
			return false;
		} else {
			return true;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			try {
			throw new InvalidContactNumberException("contacgt number needs to be an number!!");
			}
			catch(InvalidContactNumberException e) {
			 System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return false;

	}
	protected boolean updateInformation(String newAddress, String newContactNumber) {
		if(validateContactNumber(newContactNumber) &&  validateContactNumber(contactNumber)) {
			this.contactNumber = newContactNumber;
			this.address = newAddress;
			System.out.println("update contact information and address");
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean updateInformation(String newAddress) {
		if(validateContactNumber(contactNumber)) {
			this.address = newAddress;
			System.out.println("update address information successfully..");
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean updateInformation(String newContactNumber, boolean update) {
		if(validateContactNumber(newContactNumber)) {
			this.contactNumber = newContactNumber;
			System.out.println("update contact information successfully...");
			return true;
		}
		else {
			return false;
		}
	}
	public static int getTotalPersonCount() {
		return personCounter;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}

}
