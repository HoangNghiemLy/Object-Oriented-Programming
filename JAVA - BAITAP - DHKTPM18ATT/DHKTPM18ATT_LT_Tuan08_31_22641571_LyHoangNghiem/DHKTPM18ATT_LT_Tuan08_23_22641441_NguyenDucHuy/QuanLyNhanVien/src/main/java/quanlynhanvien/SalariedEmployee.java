package quanlynhanvien;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SalariedEmployee extends Employee{
	
	Locale lc = new Locale("vi", "vn");
	NumberFormat noo = NumberFormat.getCurrencyInstance(lc);
	
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
		return "SalariedEmployee [annualSalary=" + noo.format(annualSalary) + ", weeklyPay()=" + noo.format(weeklyPay()) + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getDob()=" + getDob() + "]";
	}
	
	
}
