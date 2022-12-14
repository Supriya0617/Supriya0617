package com.learning.employeeproj.domain;

public class Employee 

{
	private int id;
	private String name;
	private double Salary;
	private int age;
	
	public Employee()
	{}	
	
    public Employee(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.age = age;
	}

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
