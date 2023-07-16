package com.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SolutionUsingStreamApi {

	public static void main(String[] args) {
		List<Employee> empList = mockEmployeesList();
		Map<Integer, Double> results = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.summingDouble(Employee::getSalary)));
		System.out.println(results);
	}

	private static List<Employee> mockEmployeesList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "a", 40000d, 100));
		empList.add(new Employee(2, "b", 30000d, 101));
		empList.add(new Employee(3, "c", 20000d, 102));
		empList.add(new Employee(4, "d", 10000d, 101));
		empList.add(new Employee(5, "e", 70000d, 101));
		empList.add(new Employee(6, "f", 90000d, 100));
		empList.add(new Employee(7, "g", 80000d, 102));
		empList.add(new Employee(8, "f", 55000d, 101));
		empList.add(new Employee(9, "i", 60000d, 100));
		empList.add(new Employee(10, "j", 75000d, 102));
		return empList;
	}

}
