package com.assignment1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SolutionUsingCustomStreamClass {

	public static void main(String[] args) {
		List<Employee> empList = mockEmployeesList();
		
		MyStream<Employee> myStream = MyStream.of(empList);
		
		Map<Integer, Double> results = myStream
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
