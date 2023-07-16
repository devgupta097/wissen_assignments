package com.assignment1;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;
    private Integer deptId;
    
	public Employee() {	}
	
	public Employee(Integer id, String name, Double salary, Integer deptId) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
}
