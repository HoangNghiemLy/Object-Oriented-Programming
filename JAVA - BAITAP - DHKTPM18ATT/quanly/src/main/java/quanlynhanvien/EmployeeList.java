/*
 * @ (#)  EmployeeList.java   2023-06    Sep 27, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 27, 2023
 * @time:		 12:14:11 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class EmployeeList {
	private List<Employee> employees;
	private LocalDate l;
	// Default constructor
	public EmployeeList() {
		employees = new ArrayList<>();
		l = l.now();
	}

	// Phương thức trả về danh sách toàn bộ các nhân viên
	public List<Employee> getEmployees() {
		return employees;
	}

	// Phương thức thêm 1 nhân viên vào danh sách, thêm không trùng mã nhân viên
	public boolean addEmployee(Employee emp) {
		if (searchEmployeeById(emp.getId()) != null) {
			return false;
		}
		employees.add(emp);
		return true;
	}

	// Phương thức tìm kiếm nhân viên khi biết mã số. Trả null nếu không tìm thấy
	public Employee searchEmployeeById(String id) {
		for (Employee emp : employees) {
			if (emp.getId().equals(id))
				return emp;
		}
		return null;
	}

	// Phương thức thêm một danh sách các nhân viên mới vào danh sách có trước, vẫn
	// đảm bảo không bị trùng mã
	public void addAll(Employee[] emps) {
		for (Employee emp : emps) {
			addEmployee(emp);
		}
	}

	// Phương thức sắp xếp danh sách nhân viên theo lương tuần tăng dần
	public void sortByWeeklySalary() {
		Collections.sort(employees,new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				int k = (int) (emp1.weeklyPay() - emp2.weeklyPay());
				if(k<=0)
					return -1;
				return 1;
			}
		});
	}

	// Phương thức xóa 1 nhân viên khi biết mã số
	public boolean removeEmployee(String id) {
		Employee empToRemove = searchEmployeeById(id);
		if (empToRemove != null) {
			employees.remove(empToRemove);
			return true;
		}
		return false;
	}

	// Phương thức cập nhật thông tin nhân viên khi biết mã nhân viên
	public boolean updateEmployee(Employee newInfor) {
		Employee empToUpdate = searchEmployeeById(newInfor.getId());
		if (empToUpdate != null) {
			// cập nhật thông tin nhân viên
			empToUpdate.setName(newInfor.getName());
			empToUpdate.setDob(newInfor.getDob());
			empToUpdate.setId(newInfor.getId());
			return true;
		}
		return false;
	}

	// Phương thức trả về danh sách nhân viên là nhân viên theo giờ
	// và làm việc hơn 40 giờ 1 tuần
	public List<Employee> getHourlyEmpsWorkMoreThan40() {
		List<Employee> result = new ArrayList<>();
		for (Employee emp : employees) {
			if (emp instanceof HourlyEmployee && ((HourlyEmployee) emp).getHoursWorked() > 40) {
				result.add(emp);
			}
		}
		return result;
	}

	// Phương thức trả về tổng lương hàng tuần của tất cả các nhân viên là người
	// quản lý
	public double getWeeklyTotalSalaryOfManager() {
		return employees.stream().filter(emp -> emp instanceof Manager).mapToDouble(Employee::weeklyPay).sum();
	}

	// Phương thức cập nhật giờ làm việc của một nhân viên theo giờ khi biết mã số.
	// Ném lỗi nếu giờ làm việc mới nhỏ hơn 0, hoặc nếu mã nhân viên không tồn tại,
	// hoặc nhân viên không phải là nhân viên theo giờ
	public void updateHourlyWorked(String id, int newHour) {
		Employee empToUpdate = searchEmployeeById(id);
		if (empToUpdate != null && empToUpdate instanceof HourlyEmployee) {
			HourlyEmployee hourlyEmp = (HourlyEmployee) empToUpdate;
			if (newHour < 0) {
				throw new IllegalArgumentException("Invalid Hourly Employee.");
			}
			hourlyEmp.setHoursWorked(newHour);
		} else {
			throw new IllegalArgumentException("No employee found or not an hourly employee");
		}
	}

	// Phương thức trả về danh sách nhân viên trẻ làm quản lý (có tuổi < 30)
	public List<Employee> getYoungEmployeesAsManagers() {
		List<Employee> youngManagers = new ArrayList<>();
		for (Employee emp : employees) {
			if (emp instanceof Manager) {
				if ((l.getYear() - emp.getDob().getYear()) < 30) {
					youngManagers.add(emp);
				}
			}
		}
		return youngManagers;
	}
	
	//Phương thức thống kê số nhân viên theo năm sinh
	public Map<Integer, Long> getNoOfEmployeesByYOB(){
		Map<Integer, Long> countByYOB = new TreeMap<Integer, Long>();
		for (Employee employee : employees) {
			if(countByYOB.containsKey(employee.getDob().getYear()) == false) countByYOB.put(employee.getDob().getYear(), (long) 1);
			else {
				Long giaTriHienTai = countByYOB.get(employee.getDob().getYear());
				giaTriHienTai += 1;
				countByYOB.put(employee.getDob().getYear(), giaTriHienTai);
			}
		}
		return countByYOB;
	}
}
