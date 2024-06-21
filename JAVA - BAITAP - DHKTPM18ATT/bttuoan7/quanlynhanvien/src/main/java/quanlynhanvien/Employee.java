package quanlynhanvien;

import java.time.LocalDate;

public abstract class Employee {
	private String id;
	private String name;
	private LocalDate dob;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", weeklyPay()=" + weeklyPay() + "]";
	}
	public Employee() {
		this("","",null);
	}
	public Employee(String id, String name, LocalDate dob) {
		if(id == null || id.isBlank()==true) throw new IllegalArgumentException("Id không được null!!!");
		if(name == null || name.isBlank()==true) throw new IllegalArgumentException("Tên không được bỏ trống!!");
		if(dob == null) throw new IllegalArgumentException("Ngày tháng năm sinh không được bỏ trống");
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id == null || id.isBlank()==true) throw new IllegalArgumentException("Id không được null!!!");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.isBlank()==true) throw new IllegalArgumentException("Tên không được bỏ trống!!");
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		if(dob == null) throw new IllegalArgumentException("Ngày tháng năm sinh không được bỏ trống");
		this.dob = dob;
	}
	
	public abstract double weeklyPay();
	
	
	
	
}
