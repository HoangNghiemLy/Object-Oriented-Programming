package quanlynhanvien;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class HourlyEmployee extends Employee{
	Locale lc = new Locale("vi", "vn");
	NumberFormat noo = NumberFormat.getCurrencyInstance(lc);
	private int hoursWorked;
	private double hourlyWage;
	

	public HourlyEmployee(String id, String name, LocalDate dob, int hoursWorked, double hourlyWage) {
		super(id, name, dob);
		// TODO Auto-generated constructor stub
		if(hourlyWage < 0) throw new IllegalArgumentException("Tiền lương kh đc bé hơn 0");
		if(hoursWorked < 0) throw new IllegalArgumentException("Gio làm việc kh đc bé hơn 0");
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		if(hoursWorked < 0) throw new IllegalArgumentException("Gio làm việc kh đc bé hơn 0");
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage < 0) throw new IllegalArgumentException("Tiền lương kh đc bé hơn 0");
		this.hourlyWage = hourlyWage;
	}

	@Override
	public double weeklyPay() {
		if(this.hoursWorked*7 <= 40) return this.hoursWorked*7*this.hourlyWage;
		double t1 = 40*this.hourlyWage;
		double t2 = (this.hoursWorked*7-40)*(this.hourlyWage*1.5);
		return t1 + t2;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", hourlyWage=" + noo.format(hourlyWage) + ", weeklyPay()="
				+ noo.format(weeklyPay()) + ", getId()=" + getId() + ", getName()=" + getName() + ", getDob()=" + getDob() + "]";
	}
	
}
