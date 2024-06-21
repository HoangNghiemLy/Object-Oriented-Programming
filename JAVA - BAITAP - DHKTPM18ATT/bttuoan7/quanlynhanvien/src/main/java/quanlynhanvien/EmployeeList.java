package quanlynhanvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {
	ArrayList<Employee> arl;
	LocalDate l;
	
	public EmployeeList() {
		arl = new ArrayList<Employee>();
		l = l.now();
	}
	
	public ArrayList<Employee> getEmployees(){
		return this.arl;
	}
	
	public Employee searchEmployeeByID(String id) {
		for (Employee employee : arl) {
			if(employee.getId().equals(id)==true) {
				return employee;
			}
		}
		return null;
	}
	
	public boolean addEmployee(Employee k) {
		if(searchEmployeeByID(k.getId())!=null) return false;
		arl.add(k);
		return true;
	}
	
	public void addAll(ArrayList<Employee> e) {
		for (Employee employee : e) {
			this.arl.add(employee);
		}
	}
	
	public void sortByWeeklySalary () {
		Collections.sort(arl, new Comparator<Employee>() {
			@Override
			public int compare(Employee p1, Employee p2) {
				int k = (int)(p1.weeklyPay() - p2.weeklyPay());
				if(k<=0) return -1;
				return 1;
 			}
		});
	}
	
	public boolean removeEmployee (String id) {
		int i = this.arl.indexOf(searchEmployeeByID(id));
		if(i<0) {
			return false;
		}
		this.arl.remove(i);
		return true;
	}
	
	public boolean updateEmployee(Employee e) {
		int i = arl.indexOf(searchEmployeeByID(e.getId()));
		if(i<0) return false;
		this.arl.set(i, e);
		return true;
	}
	
	public Employee[] getHourlyEmpsWorkMoreThan40 () {
		return Arrays.stream(this.arl.toArray(), 0 , arl.size())
			.filter(x -> x instanceof HourlyEmployee && ((HourlyEmployee) x).getHoursWorked()*7>40)
			.toArray(k -> new Employee[k]);
	}
	
	public double getWeeklyTotalSalaryOfManager () {
//		return Arrays.stream(this.arl.toArray(), 0, arl.size())
//				.filter(x -> x instanceof Manager)
//				.collect(Collectors.summingDouble(Employee::weeklyPay));
		
		double sum = 0;
		for (Employee employee : arl) {
			if(employee instanceof Manager) {
				sum += employee.weeklyPay();
			}
		}
		return sum;
	}
	
	public void updateHourlyWorked (String id, int newHour) {
		int i = arl.indexOf(searchEmployeeByID(id));
		if(i<0 || (arl.get(i) instanceof HourlyEmployee)==false) {
			return;
		}
		
		((HourlyEmployee)arl.get(i)).setHoursWorked(newHour);
	}
	
	public Employee[] getYoungEmployeesAsManagers () {
		return Arrays.stream(this.arl.toArray(), 0, this.arl.size())
					.filter(x -> x instanceof Manager && (this.l.getYear() - ((Manager) x).getDob().getYear()) <30)
					.toArray(k -> new Employee[k]);
	}
}
