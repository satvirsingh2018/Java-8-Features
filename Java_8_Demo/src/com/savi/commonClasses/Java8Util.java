package com.savi.commonClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Util {

	public static List<Employee> getDummyEmployeesList() {
		ArrayList<Employee> dummyList = new ArrayList<>();
		dummyList.add(new Employee("Satvir Kumar Singh", 32, "IT", 40000, false));
		dummyList.add(new Employee("Satish Kumar Singh", 34, "Transport", 42000, false));
		dummyList.add(new Employee("Raj Kumar Singh", 58, "Security", 100000, true));
		dummyList.add(new Employee("Pooja Singh", 28, "IT", 35000, false));
		dummyList.add(new Employee("Aayushi Singh", 03, "Child", 12000, false));
		dummyList.add(new Employee("Annu Kumari", 12, "Student", 20000, false));
		dummyList.add(new Employee("Mira Devi", 42, "House-Wife", 29000, true));
		dummyList.add(new Employee("Aditya Nandan", 30, "IT", 800000, false));
		dummyList.add(new Employee("Gautam Verma", 35, "IT", 65000, false));
		dummyList.add(new Employee("Ravish Chandra", 36, "IT", 65000, false));
		dummyList.add(new Employee("Deepanshu Sharma", 28, "IT", 79000, false));
		dummyList.add(new Employee("Sandeep Kumar", 29, "IT", 35000, false));
		dummyList.add(new Employee("Aakash Gupta", 30, "IT", 60000, false));
		dummyList.add(new Employee("Arjun Chung", 21, "IT", 28000, false));
		dummyList.add(new Employee("Dheeraj Kumar", 26, "IT", 32000, false));
		dummyList.add(new Employee("Vivek Kumar Singh", 28, "IT", 400000, false));
		return dummyList;
	}
	
	public static List<Student> getDummyStudentList() {
		ArrayList<Student> dummyList = new ArrayList<>();
		dummyList.add(new Student("Satvir Kumar Singh", 32, "IT", 40000, false, Arrays.asList(1,2)));
		dummyList.add(new Student("Satish Kumar Singh", 34, "Transport", 42000, false, Arrays.asList(3,4)));
		dummyList.add(new Student("Raj Kumar Singh", 58, "Security", 100000, true, Arrays.asList(5,6)));
		dummyList.add(new Student("Pooja Singh", 28, "IT", 35000, false, Arrays.asList(7,8)));
		dummyList.add(new Student("Aayushi Singh", 03, "Child", 12000, false, Arrays.asList(9,10)));
		dummyList.add(new Student("Annu Kumari", 12, "Student", 20000, false, Arrays.asList(11,12)));
		dummyList.add(new Student("Mira Devi", 42, "House-Wife", 29000, true, Arrays.asList(13,14)));
		dummyList.add(new Student("Aditya Nandan", 30, "IT", 800000, false, Arrays.asList(15,16)));
		dummyList.add(new Student("Gautam Verma", 35, "IT", 65000, false, Arrays.asList(17,18)));
		dummyList.add(new Student("Ravish Chandra", 36, "IT", 65000, false, Arrays.asList(19,20)));
		dummyList.add(new Student("Deepanshu Sharma", 28, "IT", 79000, false, Arrays.asList(21,22)));
		dummyList.add(new Student("Sandeep Kumar", 29, "IT", 35000, false, Arrays.asList(23,24)));
		dummyList.add(new Student("Aakash Gupta", 30, "IT", 60000, false, Arrays.asList(25,26)));
		dummyList.add(new Student("Arjun Chung", 21, "IT", 28000, false, Arrays.asList(27,28)));
		dummyList.add(new Student("Dheeraj Kumar", 26, "IT", 32000, false, Arrays.asList(29,30)));
		dummyList.add(new Student("Vivek Kumar Singh", 28, "IT", 400000, false, Arrays.asList(31,32)));
		return dummyList;
	}
}
