package com.savi.commonClasses;

public class Employee {

	private String name;
	private int age;
	private String dept;
	private double salary;
	private boolean isDirector;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isDirector() {
		return isDirector;
	}
	public void setDirector(boolean isDirector) {
		this.isDirector = isDirector;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + ", isDirector="
				+ isDirector + "]";
	}
	public Employee(String name, int age, String dept, double salary, boolean isDirector) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
		this.isDirector = isDirector;
	}
	
}