/*
 * @ (#)  PayrollApp.java   2023-06    Sep 19, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package iuh.fit.se;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 19, 2023
 * @time:		 9:06:03 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class PayrollApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter the number of employees: ");
			n = sc.nextInt();
		} while (n <= 0);
		EmployeeList listemp = new EmployeeList(n);
		while (true) {
			System.out.println("\n----EMPLOYEE MANAGERMENT SYSTEM----");
			System.out.println("1. Display all employees" + "\n2. Add a new employee" + "\n3. Search employee by ID"
					+ "\n4. Sort by weekly salary" + "\n5. Remove employee by ID" + "\n6. Update employee by ID"
					+ "\n7. List hourly employees who work more than 40 hours a week"
					+ "\n8. Print the total weekly salary of all managers"
					+ "\n9. Update hourly worked of hourly employee by ID"
					+ "\n10. List of employees who are young managers (less than 30 years old" + "\n0. Exit"
					+ " \nEnter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				for (int i = 0; i < listemp.getCurrentSize(); i++) {
					System.out.println(listemp.getEmployees()[i].toString());
				}
			} else if (choice == 2) {
				System.out.println("Enter your employee type: ");
				String type = sc.nextLine();
				if (type.equalsIgnoreCase("HourlyEmployee") == true) {
					try {
						System.out.println("ID: ");
						String id = sc.nextLine();
						System.out.println("Name: ");
						String name = sc.nextLine();
						LocalDate dob = null;
						try {
							System.out.println("Day: ");
							int day = sc.nextInt();
							System.out.println("Month: ");
							int month = sc.nextInt();
							System.out.println("Year: ");
							int year = sc.nextInt();
							dob = dob.of(year, month, day);

						} catch (DateTimeException e) {
							System.out.println("Error DOB!!!");
						}
						System.out.println("Hours Worked: ");
						int hoursWorked = sc.nextInt();
						System.out.println("Hourly Wage: ");
						double hourlyWage = sc.nextDouble();
						HourlyEmployee hle = new HourlyEmployee(id, name, dob, hoursWorked, hourlyWage);
						listemp.addEmployee(hle);
						System.out.println("Add Hourly Employee Succesfully");
					} catch (IllegalArgumentException e) {
						System.out.println("Error Employee!!!");
					}
				} else if (type.equalsIgnoreCase("SalariedEmployee") == true) {
					try {
						System.out.println("ID: ");
						String id = sc.nextLine();
						System.out.println("Name: ");
						String name = sc.nextLine();
						LocalDate dob = null;
						try {
							System.out.println("Day: ");
							int day = sc.nextInt();
							System.out.println("Month: ");
							int month = sc.nextInt();
							System.out.println("Year: ");
							int year = sc.nextInt();
							dob = dob.of(year, month, day);
						} catch (DateTimeException e) {
							System.out.println("Error DOB!!!");
						}
						System.out.println(" Anual Salary: ");
						double anualSalary = sc.nextDouble();
						SalariedEmployee sle = new SalariedEmployee(id, name, dob, anualSalary);
						listemp.addEmployee(sle);
						System.out.println("Add Salaried Employee Successfully ");
					} catch (IllegalArgumentException e) {
						System.out.println("Error Salaried Employee");
					}
				} else if (type.equalsIgnoreCase("Manager") == true) {
					try {
						System.out.println("ID: ");
						String id = sc.nextLine();
						System.out.println("Name: ");
						String name = sc.nextLine();
						LocalDate dob = null;
						try {
							System.out.println("Day: ");
							int day = sc.nextInt();
							System.out.println("Month: ");
							int month = sc.nextInt();
							System.out.println("Year: ");
							int year = sc.nextInt();
							dob = dob.of(year, month, day);
						} catch (DateTimeException e) {
							System.out.println("Error DOB!!!");
						}
						System.out.println("Salary: ");
						double salary = sc.nextDouble();
						System.out.println("Bonus: ");
						double bonus = sc.nextDouble();
						Manager mng = new Manager(id, name, dob, salary, bonus);
						listemp.addEmployee(mng);
						System.out.println("Add Employee Succesfully");
					} catch (IllegalArgumentException e) {
						System.out.println("Error Manager");
					}
				}
			} else if (choice == 3) {
				System.out.println("Enter you find ID: ");
				String findID = sc.nextLine();
				if (listemp.searchEmployeeById(findID) == null) {
					System.out.println("No have ID you find");
				} else {
					System.out.println(listemp.searchEmployeeById(findID).toString());
				}
			} else if (choice == 4) {
				if (listemp.getCurrentSize() <= 1) {
					System.out.println("Must have more than 1 employee to sort");
				} else {
					listemp.sortByWeeklySalary();
				}
			} else if (choice == 5) {
				System.out.println("Enter ID you want to remove: ");
				String id = sc.nextLine();
				listemp.removeEmployee(id);
				System.out.println("Remove Succesfully");
			} else if (choice == 6) {
				System.out.println("Enter ID: ");
				String id1 = sc.nextLine();
				Employee emp1 = listemp.searchEmployeeById(id1);
				if (emp1 != null) {
					if (emp1 instanceof HourlyEmployee) {
						try {
							System.out.println("Name: ");
							String name = sc.nextLine();
							LocalDate dob = null;
							try {
								System.out.println("Day: ");
								int day = sc.nextInt();
								System.out.println("Month: ");
								int month = sc.nextInt();
								System.out.println("Year: ");
								int year = sc.nextInt();
								dob = dob.of(year, month, day);

							} catch (DateTimeException e) {
								System.out.println("Error DOB");
							}
							System.out.println("Hour Worked: ");
							int hourWorked = sc.nextInt();
							System.out.println("Hourly Wage: ");
							double hourlyWage = sc.nextDouble();
							emp1.setName(name);
							emp1.setDob(dob);
							((HourlyEmployee) emp1).setHoursWorked(hourWorked);
							((HourlyEmployee) emp1).setHourlyWage(hourlyWage);

						} catch (IllegalArgumentException e) {
							System.out.println("Error Employee ");
						}
					} else if (emp1 instanceof SalariedEmployee) {
						try {
							System.out.println("Name: ");
							String name = sc.nextLine();
							LocalDate dob = null;
							try {
								System.out.println("Day: ");
								int day = sc.nextInt();
								System.out.println("Month: ");
								int month = sc.nextInt();
								System.out.println("Year: ");
								int year = sc.nextInt();
								dob = dob.of(year, month, day);
							} catch (DateTimeException e) {
								System.out.println("Error DOB");
							}
							System.out.println("Salary: ");
							double salary = sc.nextDouble();
							emp1.setDob(dob);
							emp1.setName(name);
							((SalariedEmployee) emp1).setAnnualSalary(salary);
						} catch (IllegalArgumentException e) {
							System.out.println("Error Salaried Employee");
						}
					}
					else if(emp1 instanceof Manager) {
						try {
							System.out.println("Name: ");
							String name = sc.nextLine();
							LocalDate dob = null;
							try {
								System.out.println("Day: ");
								int day = sc.nextInt();
								System.out.println("Month: ");
								int month = sc.nextInt();
								System.out.println("Year: ");
								int year = sc.nextInt();
								dob = dob.of(year, month, day);
							}catch(DateTimeException e) {
								System.out.println("Error DOB");
							}
							System.out.println("Salary anual: ");
							double saralyAnual = sc.nextDouble();
							System.out.println("Bonus: ");
							double bonus = sc.nextDouble();
							emp1.setName(name);
							emp1.setDob(dob);
							((Manager)emp1).setWeeklyBonus(bonus);
							((Manager)emp1).setAnnualSalary(saralyAnual);
						}catch(IllegalArgumentException e) {
							System.out.println("Error Manager");
						}
					}
				}
			}
			else if(choice == 7) {
				if(listemp.getHourlyEmpsWorkMoreThan40()!= null) {
					for(Employee e : listemp.getHourlyEmpsWorkMoreThan40()) {
						if(e!= null) {
							System.out.println(e);
						}
					}
				}
				System.out.println("No Employee Worked more than 40 hour");
			}
			else if(choice == 8) {
				System.out.println(listemp.getWeeklyTotalSalaryOfManager());
			}
			else if(choice == 9) {
				System.out.println("Enter ID: ");
				String id = sc.nextLine();
				Employee emp = listemp.searchEmployeeById(id);
				if(emp != null && emp instanceof HourlyEmployee) {
					System.out.println("Enter hour: ");
					int newHour = sc.nextInt();
					((HourlyEmployee)emp).setHoursWorked(newHour);
				}else {
					System.out.println("Error Hourly Employee");
				}
			}
			else if(choice == 10) {
				int count = 0;
				try {
					for(Employee e : listemp.getYoungEmployeesAsManagers()) {
						if(e != null) {
							System.out.println(e);
							count++;
						}
					}
					if(count == 0) {
						System.out.println("No employee");
					}
				}catch(IllegalArgumentException e) {
					System.out.println("Error employee");
				}
			}
			else if(choice == 0) {
				System.out.println("End Program");
				break;
			}
		}
		sc.close();
	}
}
