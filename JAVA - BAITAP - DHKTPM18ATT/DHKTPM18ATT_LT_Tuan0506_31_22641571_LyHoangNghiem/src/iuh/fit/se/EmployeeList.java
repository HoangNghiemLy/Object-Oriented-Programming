/*
 * @ (#)  EmployeeList.java   2023-06    Sep 19, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package iuh.fit.se;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 19, 2023
 * @time:		 7:20:27 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class EmployeeList {
	
	
	private int currentSize = 0;
	private Employee[] employees;

	// Default constructor
	public EmployeeList() {
		this.employees = new Employee[10];
		this.currentSize = 0;
	}

	// Copy Constructor
	public EmployeeList(int initialSize) {
		this.employees = new Employee[initialSize];
		this.currentSize = 0;
	}

	// Phương thức trả về danh sách toàn bộ các nhân viên
	public Employee[] getEmployees() {
		return Arrays.copyOf(employees, currentSize);
	}

	// Phương thức thêm 1 nhân viên vào danh sách, ném lỗi nếu trùng mã số
	// mảng đầy thì tăng kích thước mảng lên 1,5
	public void addEmployee(Employee emp) {
		if (indexOfEmployee(emp.getId()) != -1) {
			throw new IllegalArgumentException("Employee ID exits");
		}
		if (currentSize == employees.length) {
			grow();
		}
		employees[currentSize++] = emp;

	}

	// Phương thức trả về index của nhân viên khi biết mã số
	public int indexOfEmployee(String id) {
		for (int i = 0; i < currentSize; i++) {
			if (employees[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	// Phương thức tìm kiếm nhân viên khi biết mã số
	public Employee searchEmployeeById(String id) {
		int index = indexOfEmployee(id);
		if (index != -1) {
			return employees[index];
		}
		return null;
	}

	// Phương thức tăng kích thước mảng lên 1.5 nếu mảng đầy
	private void grow() {
		int newCapacity = (int) (employees.length * 1.5);
		employees = Arrays.copyOf(employees, newCapacity);
	}

	// Phương thức thêm một danh sách các nhân viên mới vào danh sách có trước
	public void addAll(Employee[] emps) {
		for (Employee emp : emps) {
			addEmployee(emp);
		}
	}

	// Phương thức sắp xếp danh sách các nhân viên theo lương tuần tăng dần
	public void sortByWeeklySalary() {
		Arrays.sort(employees, 0, currentSize, Comparator.comparing(Employee::weeklyPay));
	}

	// Phương thức xóa 1 nhân viên khi biết mã số
	public void removeEmployee(String id) {
		int index = indexOfEmployee(id);
		if (index == -1) {
			throw new IllegalArgumentException("Non-ID");
		}
		System.arraycopy(employees, index + 1, employees, index, currentSize - index - 1);
		currentSize--;
	}

	// Phương thức cập nhật thông tin của nhân viên khi biết mã số
	public void updateEmployee(Employee newInfor) {
		int index = indexOfEmployee(newInfor.getId());
		if (index == -1) {
			throw new IllegalArgumentException("Non-ID");
		}
		employees[index] = newInfor;
	}

	// Phương thức trả về danh sách các nhân viên là nhân viên theo giờ và làm việc
	// hơn 40 giờ một tuần
	public Employee[] getHourlyEmpsWorkMoreThan40() {
		Employee[] result = new Employee[currentSize];
		int count = 0;
		for (int i = 0; i < currentSize; i++) {
			if (employees[i] instanceof HourlyEmployee && ((HourlyEmployee) employees[i]).getHoursWorked() > 40) {
				result[count++] = employees[i];
			}
		}
		return Arrays.copyOf(result, count);
	}

	// Phương thức trả về tổng lương hàng tuần của tất cả các nhân viên là người
	// quản lý
	public double getWeeklyTotalSalaryOfManager() {
		double totalSalary = 0.0;
		for (int i = 0; i < currentSize; i++) {
			if (employees[i] instanceof Manager) {
				totalSalary += employees[i].weeklyPay();
			}
		}
		return totalSalary;
	}

	// Phương thức cập nhật giờ làm việc của một nhân viên theo giờ khi biết mã số
	// Ném lỗi nếu giờ làm việc mới nhỏ hơn 0, hoặc nếu mã nhân viên không tồn tại,
	// hoặc nhân viên không phải là nhân viên theo giờ
	public void updateHourlyWorked(String id, int newHour) {
		int index = indexOfEmployee(id);
		if (index == -1) {
			throw new IllegalArgumentException("Non-ID");
		}
		if (!(employees[index] instanceof HourlyEmployee)) {
			throw new IllegalArgumentException("Not an hourly employee");
		}
		if (newHour < 0) {
			throw new IllegalArgumentException("Working hours cannot be less than 0");
		}
		((HourlyEmployee) employees[index]).setHoursWorked(newHour);
	}

	// Phương thức trả về danh sách nhân viên trẻ làm quản lý (có tuổi < 30, tuổi =
	// năm hiện tại – năm sinh)
	public Employee[] getYoungEmployeesAsManagers() {
		Employee[] result = new Employee[currentSize];
		int count = 0;
		int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		for (int i = 0; i < currentSize; i++) {
			if (employees[i] instanceof Manager) {
				Manager manager = (Manager) employees[i];
				int age = currentYear - manager.getDob().getYear();
				if (age < 30)
					result[count++] = manager;
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	//phuong thuc tra ve so luong hien tai
	public int getCurrentSize() {
		return currentSize;
	}
}
