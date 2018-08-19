package com.savi.commonClasses;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private String dept;
	private double salary;
	private boolean isDirector;
	private List<Integer> phoneNos;
	public Student(String name, int age, String dept, double salary, boolean isDirector, List<Integer> phoneNos) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
		this.isDirector = isDirector;
		this.phoneNos = phoneNos;
	}
	public List<Integer> getPhoneNos() {
		return phoneNos;
	}
	public void setPhoneNos(List<Integer> phoneNos) {
		this.phoneNos = phoneNos;
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
		return "Student [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + ", isDirector="
				+ isDirector + ", phoneNos=" + phoneNos + "]";
	}
}
