package com.collection.map;

import java.util.Objects;

public class Emp {

	private int id;
	private String empName;
	

	public Emp(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", empName=" + empName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(empName, other.empName) && id == other.id;
	}
    
	
}
