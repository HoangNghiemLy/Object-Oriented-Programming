package bai8;

import java.util.Scanner;

import java.util.Scanner;

public class DiemDungTK {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tiền trong tài khoản: ");
		double tienTrongNganHang = sc.nextDouble();
		System.out.print("Nhập lãi suất: ");
		double laiSuat = sc.nextDouble();
		System.out.print("Nhập số tiền rút hàng tháng: ");
		double soTienRut = sc.nextDouble();

		int sothang = 0;
		double check = tienTrongNganHang * (1 + laiSuat / 100) - tienTrongNganHang;
		if (check >= soTienRut) {
			System.out.println("Tài khoản không bao giờ cạn kiệt vì tiền lãi cao hơn tiền rút");
			sc.close();
			return;
		}

		while (true) {
			tienTrongNganHang = tienTrongNganHang * (1 + laiSuat / 100);
			tienTrongNganHang -= soTienRut;
			++sothang;
			if (tienTrongNganHang <= 0) {
				break;
			}
		}
		int nam = sothang/12;
		int thangConDu = sothang % 12;
		System.out.println("Tài khoản cần "+nam+" năm và "+thangConDu+" tháng để cạn kiệt");
		
		sc.close();
	}
}



