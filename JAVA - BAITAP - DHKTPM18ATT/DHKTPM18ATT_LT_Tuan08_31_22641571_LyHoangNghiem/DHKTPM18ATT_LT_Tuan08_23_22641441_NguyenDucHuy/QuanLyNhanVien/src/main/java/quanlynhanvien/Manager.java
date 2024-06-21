package quanlynhanvien;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Manager extends SalariedEmployee{
	Locale lc = new Locale("vi", "vn");
	NumberFormat noo = NumberFormat.getCurrencyInstance(lc);
	private double bonus;
	
	public Manager(String id, String name, LocalDate dob, double annualSalary, double bonus) {
		super(id, name, dob, annualSalary);
		if(bonus<=0) throw new IllegalArgumentException("Tiền bonux phải lớn hơn 0");
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + noo.format(bonus) + ", weeklyPay()=" + noo.format(weeklyPay()) + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDob()=" + getDob() + "]";
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
