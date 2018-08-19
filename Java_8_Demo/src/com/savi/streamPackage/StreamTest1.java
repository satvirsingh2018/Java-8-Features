package com.savi.streamPackage;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.savi.commonClasses.Employee;
import com.savi.commonClasses.Java8Util;
import com.savi.commonClasses.Student;

public class StreamTest1 {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = Java8Util.getDummyEmployeesList();
		Java8Util.getDummyStudentList()
		.stream()
		.map(Student::toString)
		.filter(list -> list.startsWith("A"))
		.forEach(System.out::println);
		//employeeList.stream().map(Employee::getName).limit(3).forEach(System.out::println);
		//employeeList.stream().map(Student::getSalary).forEach(System.out::println);
		Optional<BigDecimal> first = Optional.empty();
		Optional<BigDecimal> second = Optional.empty();
		System.out.println(first.isPresent());
		System.out.println(second.isPresent());
	}

}
