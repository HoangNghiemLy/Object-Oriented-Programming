package quanlynhanvien;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class PayrollApp {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		EmployeeList epl = new EmployeeList();
		int lua;
		while(true) {
			System.out.println("1. Display all employees"  + "\n2. Add a new employee" + "\n3. Search employee by id" 
			+ "\n4. Sort by weekly salary" + "\n5. Remove employee by id" + "\n6. Update employee by id" + "\n7. List hourly employees who work more than 40 hours a week"
			+ "\n8. Print the total weekly salary of all managers." + "\n9. Update hourly worked of hourly employee by id" 
			+ "\n10. List of employees who are young managers.");
			System.out.println("Enter your choice (choice '0' to exit): ");
			lua = sc.nextInt();
			sc.nextLine();
			if(lua == 1) {
				epl.getEmployees().forEach(x -> System.out.println(x));
			}
			else if(lua == 2) {
				try {
					System.out.print("Employee type: ");
					String type = sc.nextLine();
					System.out.print("ID: ");
					String id = sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					LocalDate dob = null;
	
					System.out.print("Day: ");
					int day = sc.nextInt();
					System.out.print("Month: ");
					int month = sc.nextInt();
					System.out.print("Year: ");
					int year = sc.nextInt();
					dob = dob.of(year, month, day);
	
					if(type.equalsIgnoreCase("HourlyEmployee")==true) {
						System.out.print("Hours worked: ");
						int hoursWorked = sc.nextInt();
						System.out.print("Wage: ");
						double hourlyWage = sc.nextDouble();
						HourlyEmployee k = new HourlyEmployee(id, name, dob, hoursWorked, hourlyWage);
						if(epl.addEmployee(k)==true) System.out.println("Thêm thành công");
						else System.out.println("Thêm không thành công");
					}
					else if(type.equalsIgnoreCase("SalariedEmployee")==true) {
						System.out.print("Salary: ");
						double annualSalary = sc.nextDouble();
						SalariedEmployee sl = new SalariedEmployee(id, name, dob, annualSalary);
						if(epl.addEmployee(sl)==true) System.out.println("Thêm thành công");
						else System.out.println("Thêm không thành công");
					}
					else if(type.equalsIgnoreCase("Manager")==true) {
						System.out.print("Salary: ");
						double annualSalary = sc.nextDouble();
						System.out.print("Bonus: ");
						double bonus = sc.nextDouble();
						Manager sl = new Manager(id, name, dob, annualSalary, bonus);
						if(epl.addEmployee(sl)==true) System.out.println("Thêm thành công");
						else System.out.println("Thêm không thành công");
					}
				}
				catch(IllegalArgumentException e) {
					System.out.println("Error");
				}
				catch(DateTimeException e) {
					System.out.println("Error");
				}
			}
			else if(lua == 3) {
				System.out.print("Nhập id bạn muốn tìm: ");
				String id = sc.nextLine();
				Employee e = epl.searchEmployeeByID(id);
				if(e != null) {
					System.out.println(e);
				}
				else {
					System.out.println("không tìm thấy nhân viên !!!");
				}
			}
			else if(lua == 4) {
				epl.sortByWeeklySalary();
			}
			else if(lua == 5) {
				System.out.println("Nhập id bạn muốn xóa: ");
				String id = sc.nextLine();
				if(epl.removeEmployee(id)==true) System.out.println("xóa thành công");
				else System.out.println("xóa không thành công");
			}
			else if(lua == 6) {
				System.out.print("ID: ");
				String id = sc.nextLine();
				Employee e = epl.searchEmployeeByID(id);
				if(e==null) {
					System.out.println("Không tìm thấy nhân viên nào!!!");
				}
				else {
					System.out.print("Name: ");
					String name = sc.nextLine();
					LocalDate dob = null;

					System.out.print("Day: ");
					int day = sc.nextInt();
					System.out.print("Month: ");
					int month = sc.nextInt();
					System.out.print("Year: ");
					int year = sc.nextInt();
					dob = dob.of(year, month, day);
					if(e instanceof HourlyEmployee) {
						System.out.print("Nhập giờ làm việc: ");
						int hoursWorked = sc.nextInt();
						System.out.print("Nhập lương làm việc mỗi giờ: ");
						double hourlyWage = sc.nextDouble();
						HourlyEmployee k = new HourlyEmployee(id, name, dob, hoursWorked, hourlyWage);
						epl.updateEmployee(k);
					}
					else if(e instanceof Manager) {
						System.out.print("Nhập tiền lương hàng năm: ");
						double annualSalari = sc.nextDouble();
						System.out.print("Nhập tiền bonus: ");
						double bonus = sc.nextDouble();
						Manager k = new Manager(id, name, dob, annualSalari, bonus);
						epl.updateEmployee(k);
					}
					else if(e instanceof SalariedEmployee) {
						System.out.print("Nhập tiền lương hàng năm: ");
						double annualSalari = sc.nextDouble();
						SalariedEmployee k = new SalariedEmployee(id, name, dob, annualSalari);
						epl.updateEmployee(k);
					}
				}
			}else if(lua == 7) {
				Arrays.stream(epl.getHourlyEmpsWorkMoreThan40()).forEach(System.out::println);
			}
			else if(lua == 8) {
				System.out.println("Tổng lương hàng tuần của manager: " + epl.getWeeklyTotalSalaryOfManager());
			}
			else if(lua == 9) {
				System.out.print("Nhập ID của nhân viên: ");
				String id = sc.nextLine();
				System.out.print("Nhập giờ làm việc của nhân viên: ");
				int gio= sc.nextInt();
				epl.updateHourlyWorked(id, gio);
			}
			else if(lua == 10) {
				Arrays.stream(epl.getYoungEmployeesAsManagers()).forEach(System.out::println);
			}
			else if(lua == 0) {
				System.out.println("Kết thúc ctrinh");
				break;
			}
			else {
				System.out.println("Nhập kh hợp lệ");
			}
		}
		sc.close();
	}
}
