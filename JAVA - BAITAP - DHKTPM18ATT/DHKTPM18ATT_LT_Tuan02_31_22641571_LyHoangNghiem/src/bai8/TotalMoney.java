package bai8;

import java.util.Scanner;

public class TotalMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tiền gửi: ");
		double soTienGui = sc.nextDouble();
		System.out.println("Nhập lãi suất năm: ");
		double laiSuat = sc.nextDouble();
		System.out.println("Nhập số năm gửi: ");
		int years = sc.nextInt();
		for (int i = 1; i <= years; i++) {
			double tong = 0;
			tong = soTienGui + (double) (soTienGui * laiSuat);
			System.out.println("Số tiền sau " + i + " năm là: " + Math.round(tong*100.0)/100.0);
			soTienGui = tong;
		}
		sc.close();
	}
}
