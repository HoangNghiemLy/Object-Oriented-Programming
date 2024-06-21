package quanlynhanvien;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
	private double annualSalary;


	public SalariedEmployee(String id, String name, LocalDate dob, double annualSalary) {
		super(id, name, dob);
		// TODO Auto-generated constructor  stub
		if(annualSalary <= 0) throw new IllegalArgumentException("Tiền lương phải lớn hơn 0");
		this.annualSalary = annualSalary;
	}


	public double getAnnualSalary() {
		return annualSalary;
	}


	public void setAnnualSalary(double annualSalary) {
		if(annualSalary <= 0) throw new IllegalArgumentException("Tiền lương phải lớn hơn 0");
		this.annualSalary = annualSalary;
	}


	@Override
	public double weeklyPay() {
		double tl = this.annualSalary/12;
		tl /= 4;
		return tl;
	}


	@Override
	public String toString() {
		return "SalariedEmployee [annualSalary=" + annualSalary + ", weeklyPay()=" + weeklyPay() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getDob()=" + getDob() + "]";
	}
	
	
}
