/*
 * @ (#)  SalariedEmployee.java   2023-06    Sep 26, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanvien;

import java.text.DecimalFormat;
import java.time.LocalDate;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 26, 2023
 * @time:		 10:30:25 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class SalariedEmployee extends Employee {
	protected double annualSalary;

	public SalariedEmployee(String id, String name, LocalDate dob, double annualSalary) {
		super(id, name, dob);
		this.annualSalary = annualSalary;
	}
	public SalariedEmployee() {
		this("","",LocalDate.now(),0.0);
	}
	@Override
	public double weeklyPay() {
		final int WEEKS_PER_YEAR =52;
		return annualSalary / WEEKS_PER_YEAR;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$ ##,###.00");
		return super.toString() +String.format("Annual salary: %-15s\n",df.format(annualSalary));
	}
}
