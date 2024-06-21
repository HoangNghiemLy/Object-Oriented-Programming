package bai3;

import java.util.Scanner;

public class GiaiPTBac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Giải phương trình bậc 2 ax^2+bx+c=0");
		double a, b, c;
		do {
			System.out.println("Nhập hệ số a: ");
			a = sc.nextDouble();
			if (a == 0) {
				System.out.println("Nhập dữ liệu sai. Mời nhập lại!!!");
			}
		} while (a == 0);
		System.out.println("Nhập hệ số b: ");
		b = sc.nextDouble();
		System.out.println("Nhập hệ số c: ");
		c = sc.nextDouble();
		double delta = Math.pow(b, 2) - (4 * a * c);
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có 2 nghiệm phân biệt: ");
			System.out.println("x1 = " + Math.round(x1 * 100.0) / 100.0);
			System.out.println("x2 = " + Math.round(x2 * 100.0) / 100.0);
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép: ");
			System.out.println("x= " + Math.round(x * 100.0) / 100.0);
		} else {
			System.out.println("Phương trình vô nghiệm");
		}
		sc.close();
	}
}
