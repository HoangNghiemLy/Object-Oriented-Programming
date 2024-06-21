package quanlynhanvien;

import java.time.LocalDate;

public class Manager extends SalariedEmployee{
	
	private double bonus;
	
	public Manager(String id, String name, LocalDate dob, double annualSalary, double bonus) {
		super(id, name, dob, annualSalary);
		if(bonus<=0) throw new IllegalArgumentException("Tiền bonux phải lớn hơn 0");
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if(bonus<=0) throw new IllegalArgumentException("Tiền bonux phải lớn hơn 0");
		this.bonus = bonus;
	}
	
	@Override
	public double weeklyPay() {
		return super.weeklyPay() + this.bonus;
	}
	
	

}
