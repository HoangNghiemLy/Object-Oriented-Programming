/*
 * @ (#)  Employee.java   2023-06    Sep 26, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanvien;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 26, 2023
 * @time:		 9:23:58 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public abstract class Employee {
	protected String id;
	protected String name;
	protected LocalDate dob;
	public Employee() {
		this("","",LocalDate.now());
	}
	public Employee(String id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(this.id == null || this.id.trim().equals("")==true)
			throw new IllegalArgumentException("ID Error");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(this.name == null || this.name.trim().equals(" ")==true)
			throw new IllegalArgumentException("Name Error");
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		if(this.dob == null)
			throw new IllegalArgumentException("DOB Error");
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df2 = new DecimalFormat("$ #,##0.00");
		return String.format("\nEmployee Type: %-15s\nID: %-15s\nName: %-15s\nDate of birth: %-15s\nWeekly total salary: %-15s\n==Salary details==\n" ,
		this.getClass().getSimpleName(),id,name,dob.format(df1),df2.format(weeklyPay()));
	}
	public abstract double weeklyPay();
}
