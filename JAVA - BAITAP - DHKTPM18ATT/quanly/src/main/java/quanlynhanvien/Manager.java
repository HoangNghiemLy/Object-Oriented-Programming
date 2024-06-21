/*
 * @ (#)  Manager.java   2023-06    Sep 26, 2023
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
 * @time:		 11:47:44 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Manager extends SalariedEmployee {
	private double weeklyBonus;

	public Manager(String id, String name, LocalDate dob, double annualSalary, double weeklyBonus) {
		super(id, name, dob, annualSalary);
		this.weeklyBonus = weeklyBonus;
	}
	public Manager() {
		this("","",LocalDate.now(),0.0,0.0);
	}
	public double getWeeklyBonus() {
		return weeklyBonus;
	}
	public void setWeeklyBonus(double weeklyBonus) {
		this.weeklyBonus = weeklyBonus;
	}
	@Override
	public double weeklyPay() {
		return super.weeklyPay() + weeklyBonus;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$,#,###.00");
		return super.toString() + String.format("Weekly bonus: %-15s\n",df.format(weeklyBonus)); 
	}
	

}
