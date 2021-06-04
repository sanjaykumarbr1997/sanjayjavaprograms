package com.xworkz.collection.queue.priorityqueue;

public class Employee implements Comparable<Object> {
	String id;
	String name;
	Double salary;
	
	public Employee(String id,String name,Double salary) {
	this.id = id;
	this.name= name;
	this.salary= salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object emp) {
	 
		String names = ((Employee)emp).name;
		
		return this.name.compareTo(names);   
		//to reverse order you can write names.compareTo(this.name)
		
		/*
		Double salaries =((Employee)emp).salary;
	
		return this.salary.compareTo(salaries);
		*/
	}


}	
	

