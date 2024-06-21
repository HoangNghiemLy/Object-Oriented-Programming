package iuh.fit.se;
/*
 * @ (#) Company.java       1.0     Sep 11, 2023
 *
 * Copyright (c) 2023 IUH. All rights reserved.
 */

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
 * @description: 
 * @author: Khanh Nguyen
 * @date:   Sep 11, 2023
 * @version:    1.0
 */
public class EmployeeList {
	
	private Set<Employee> employees;

	/**
	 * Default constructor: Create a collection of employees
	 */
	public EmployeeList() {
		employees = new HashSet<>();
	}

	/**
	 * This method returns the collection of employees
	 * @return
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}

	/**
	 * This method adds a new employee to the list. 
	 * @param emp the new employee
	 * @throws IllegalArgumentException if the employee id is duplicated
	 */
	public boolean addEmployee(Employee emp) {
		
		return employees.add(emp);
	}

	/**
	 * Search the employee by id
	 * @param id
	 * @return
	 */
	public Employee searchEmployeeById(String id) {
//		for(Employee emp : employees)
//			if(emp.getID().equalsIgnoreCase(id))
//				return emp;
//		return null;
		
		return employees.stream()
				.filter(emp -> emp.getID().equalsIgnoreCase(id))
				.findFirst()
				.orElse(null);
	}

	/**
	 * This method adds an array of employees to the list
	 * @param emps the array of employees
	 */
	public void addAll(Set<Employee> emps) {
		employees.addAll(emps);
	}
	
	/**
	 * This method sorts the list by weekly salary of employees in ascending order
	 * @return
	 */
	public Set<Employee> sortByWeeklySalary() {
		
//		Set<Employee> temp = new TreeSet<>()(
//				Comparator.comparing(Employee::weeklyPay));
//		temp.addAll(employees);
//		return temp;
		
//		return employees.stream()
//				.sorted(Comparator.comparing(Employee::weeklyPay))
//				.collect(Collectors.toCollection(
//						() -> new TreeSet<> (Comparator.comparing(Employee::weeklyPay))));
		
		
		return employees.stream()
				.sorted(Comparator.comparing(Employee::weeklyPay))
				.collect(Collectors.toCollection(LinkedHashSet::new));
		
	}
	
	/**
	 * Remove an employee by id
	 * @param id the given id
	 * @throws IllegalArgumentException if the employee with the given id does not exist
	 */
	public boolean removeEmployee(String id) {
		return false;
	}
	
	/**
	 * This method updates the information of an employee by id
	 * @param newInfor the new information
	 * @throws IllegalArgumentException if the employee with the given id does not exist
	 */
	public boolean updateEmployee(Employee newInfor) {
		if(newInfor == null)
			return false;
		Employee emp = searchEmployeeById(newInfor.getID());
		if(emp == null)
			return false;
		if(emp.getClass()!=newInfor.getClass())
			return false;
		emp.setName(newInfor.getName());
		if(emp instanceof Manager) {
			
		}else if(emp instanceof SalariedEmployee) {
			
		}else(emp instanceof HourlyEmployee){
			
		}
		return true;
	}
	/**
	 * This method returns an array of employees who are hourly employees and work more than 40 hours per week
	 * @return an array of employees who are hourly employees and work more than 40 hours per week
	 */
	public Set<Employee> getHourlyEmpsWorkMoreThan40() {
		
		return emp.stream()
				.filter(emp -> (emp instanceof HourlyEmpoyee &&((HourlyEmployee)emp).getHoursWorked()*7>40));
				
	}
	
	/**
	 * This method returns the total salary of all managers
	 * @return the total salary of all managers
	 */
	public double getWeeklyTotalSalaryOfManager () {
		
		return 0.0;
	}
	
	/**
	 * This method updates the hourly work of an hourly employee by id
	 * @param id the given id
	 * @param newHour the new hourly worked
	 * @throws IllegalArgumentException if the new hourly worked is less than 0
	 * @throws IllegalArgumentException if the employee with the given id does not exist or the employee is not an hourly employee
	 */
	public void updateHourlyWorked(String id, int newHour) {
		

	}

	/**
	 * This method returns an array of employees who are young managers (less than 30 years old)
	 * @return an array of employees who are young managers (less than 30 years old)
	 */
	public Set<Employee> getYoungEmployeesAsManagers() {
		LocalDate now = LocalDate.now();
		return employees.stream()
				.filter(emp -> emp instanceof Manager)
				.filter(em ->{
				now.getYear() - emp.getDob().getYear() >30)
				.collect(Collectors.toSet());
						
	}
	
	/**
	 * This method returns a map of number of employees by year of birth
	 * @return a map of number of employees by year of birth
	 */
	public Map<Integer, Long> getNoOfEmployeesByYOB() {
		
		return employees.stream()
				.map(emp -> emp.getDOB().getYear())
				.collect(Collectors.groupingBy(y -> y, Collectors.counting()));
		
//		Map<Integer,Long> map = new HashMap<>();
//		for(Employee emp : employees) {
//			int year = emp.getDob().getYear();
//			if(map.containsKey(year))
//				map.put(year, map.get(year)+1);
//			else
//				map.put(year, 1l);
//		}
//		return map;
	}
	
	/**
	 * This method returns a map of total weekly salary of all employees by employee type, sorted in ascending order of total salary
	 * @return a map of total weekly salary of all employees by employee type, sorted in ascending order of total salary
	 */
	public Map<String, Double> getTotalWeeklySalary() {
		return null;
	}

	/**
	 * This method returns a set of year of birth of all employees, sorted in descending order
	 * @return a set of year of birth of all employees, sorted in descending order
	 */
	public Set<Integer> getYOBSet() {
//		Set<Integer> temp = new TreeSet<>(); // tang dan
//		Set<Integer > temp = new TreeSet<>(Comparator.reverseOrder()); // giam dan
//		for(Employee :: employees)
//			temp.add(emp.getDob().getYear());
//		return temp;
		
		
		return employees.stream()
				.map(emp -> emp.getDob().getYear())
//				.collect(Collectors.toCollection(TreeSet::new)); //Tang dan
				.collect(Collectors.toCollection()(
						() -> new TreeSet<>(Comparator.reverseOrder())));
						));
						
	}
	public Map<Integer, Long> getNoOfEmpsByYOBSortDescByYOB(){
//		return employees.stream()
//				.map(emp -> emp.getDob().getYear())
//				.collect(Collectors.groupingBy(y -> y,
//						Collectors.counting()))
//				.entrySet()
//				.stream()
//				.sorted(Entry.comparingByKey(Comparator. reverseOrder()))
//				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1, e2)-> e1,
//						LinkedHashMap::new));
		
//		return employees.stream()
//				.map(emp -> emp.getDOB().getYear())
//				.collect(Collectors.groupingBy(y -> y,
//						TreeMap::new,
//						Collectors.counting()))
//				.descendingMap();
		
		
		
		
	}
}



