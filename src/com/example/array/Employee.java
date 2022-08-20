package com.example.array;

public class Employee {
	
	int id;
	String name;
	String[] staff;
	
	public Employee(int id, String name,String[] staff) {
		super();
		this.id = id;
		this.name = name;
		this.staff=staff;
	}
	
	public void printDetails() {
		System.out.println("employee id is "+id);
		System.out.println("employee name is "+name);
	}
	
	public void printStaffOnly(Employee emp) {
		
		String[] mystaff=emp.staff;
		
		for(String s:mystaff) {
			System.out.println(s);
		}
		
	}
	
	
	void printEmployeeArray(Employee[] empArray) {
		for (int i = 0; i < empArray.length; i++) {
			Employee e=empArray[i];
			e.printDetails();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
