package quanlynhanvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeList {
	Set<Employee> listEmployee;
	LocalDate l;
	
	public EmployeeList() {
		listEmployee = new HashSet();
		l = l.now();
	}
	
	public Set<Employee> getEmployees(){
		return this.listEmployee;
	}
	//tìm kiếm nhân viên
	public Employee searchEmployeeByID(String id) {
		return this.listEmployee.stream().filter(x -> x.getId().equals(id))
					.findFirst()
					.orElse(null);
	}
	//thêm 1 nhân viên
	public boolean addEmployee(Employee k) {
		listEmployee.add(k);
		return true;
	}
	//thêm nhiều nhân viên
	public void addAll(ArrayList<Employee> e) {
		listEmployee.addAll(e);
	}
	//sắp xếp nhân viên theo tiền lương
	public Set<Employee> sortByWeeklySalary () {
		Set<Employee> se = new TreeSet(Comparator.comparing(Employee::weeklyPay));
		se.addAll(this.listEmployee);
		return se;
		
	}
	//xóa nhân viên theo mã
	public boolean removeEmployee (String id) {
		Employee ep = this.searchEmployeeByID(id);
		if(ep == null) {
			return false;
		}
		this.listEmployee.remove(ep);
		return true;
	}
	//cập nhật nhân viên
	public boolean updateEmployee(Employee e) {
		Employee ep = this.searchEmployeeByID(e.getId());
		if(ep == null) return false;
		ep.setId(e.getId());
		ep.setDob(e.getDob());
		ep.setName(e.getName());
		
		if(ep instanceof HourlyEmployee) {
			((HourlyEmployee) ep).setHourlyWage(((HourlyEmployee) e).getHourlyWage());
			((HourlyEmployee) ep).setHoursWorked(((HourlyEmployee) e).getHoursWorked());
		}
		else if(ep instanceof SalariedEmployee) {
			((SalariedEmployee) ep).setAnnualSalary(((SalariedEmployee) e).getAnnualSalary());
		}
		else if(ep instanceof Manager) {
			((Manager) ep).setAnnualSalary(((Manager) e).getAnnualSalary());
			((Manager) ep).setBonus(((Manager) e).getBonus());
		}
		return true;
	}
	//lấy các nhân viên giờ làm trên 40
	public ArrayList<Employee> getHourlyEmpsWorkMoreThan40 () {
		return listEmployee.stream().filter(x -> x instanceof HourlyEmployee && ((HourlyEmployee) x).getHoursWorked()*7 > 40)
							.collect(Collectors.toCollection(ArrayList::new));
	}
	//lấy tổng lương tuần nhân viên manager
	public double getWeeklyTotalSalaryOfManager () {
		return this.listEmployee.stream().filter(x -> x instanceof Manager)
				.collect(Collectors.summingDouble(Employee::weeklyPay));
	}
	//cập nhật giờ mới cho nhân viên
	public void updateHourlyWorked (String id, int newHour) {
		Employee tmp = searchEmployeeByID(id);
		if(tmp == null || tmp instanceof HourlyEmployee == false) return;
		else {
			((HourlyEmployee) tmp).setHoursWorked(newHour);
		}
	}
	//lấy ra danh sách manager trẻ
	public ArrayList<Employee> getYoungEmployeesAsManagers () {
		return listEmployee.stream().filter(x -> x instanceof Manager && (l.getYear() - x.getDob().getYear())<30)
						.collect(Collectors.toCollection(ArrayList::new));
	}
	
	//thống kê số năm của nhân viên
	public Map<Integer, Long> getNoOfEmployeesByYOB() {
		Map<Integer, Long> mp = new TreeMap<Integer, Long>();
		for (Employee employee : listEmployee ) {
			if(mp.containsKey(employee.getDob().getYear()) == false) mp.put(employee.getDob().getYear(), (long) 1);
			else {
				Long giaTriHienTai = mp.get(employee.getDob().getYear());
				giaTriHienTai += 1;
				mp.put(employee.getDob().getYear(), giaTriHienTai);
			}
		}
		return mp;
	}
	public Map<Integer, Long> getNoOfEmpsByYOBSortDescByYOB() {
		Map<Integer, Long> mp = new TreeMap<Integer, Long>(Comparator.reverseOrder());
		for (Employee employee : listEmployee ) {
			if(mp.containsKey(employee.getDob().getYear()) == false) mp.put(employee.getDob().getYear(), (long) 1);
			else {
				Long giaTriHienTai = mp.get(employee.getDob().getYear());
				giaTriHienTai += 1;
				mp.put(employee.getDob().getYear(), giaTriHienTai);
			}
		}
		return mp;
	}
	
	public Map<Integer, Long> getNoOfEmpsByYOBSortDescByNoEmps(){
		Map<Integer, Long> mp = new TreeMap<Integer, Long>();
		for (Employee employee : listEmployee ) {
			if(mp.containsKey(employee.getDob().getYear()) == false) mp.put(employee.getDob().getYear(), (long) 1);
			else {
				Long giaTriHienTai = mp.get(employee.getDob().getYear());
				giaTriHienTai += 1;
				mp.put(employee.getDob().getYear(), giaTriHienTai);
			}
		}
		
		return mp.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));
		
	}
	
	public Map<String, Double> getTotalWeeklySalary() {
		Map<String, Double> mp = new TreeMap<String, Double>();

		mp.put("Manager", 0.0);
		mp.put("SalariedEmployee", 0.0);
		mp.put("HourlyEmployee", 0.0);
		for (Employee employee : listEmployee ) {
			if(employee instanceof Manager) {
				Double giaTriHienTai = mp.get("Manager");
				giaTriHienTai += employee.weeklyPay();
				mp.put("Manager", giaTriHienTai);
			}
			else if(employee instanceof HourlyEmployee) {
				Double giaTriHienTai = mp.get("HourlyEmployee");
				giaTriHienTai += employee.weeklyPay();
				mp.put("HourlyEmployee", giaTriHienTai);
			}
			else if(employee instanceof SalariedEmployee) {
				Double giaTriHienTai = mp.get("SalariedEmployee");
				giaTriHienTai += employee.weeklyPay();
				mp.put("SalariedEmployee", giaTriHienTai);
			}
			
		}
		
		return mp.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));
		
	}
}
