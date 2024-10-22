package bai2;

import java.util.Scanner;

public class TinhTienDienTuan02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tính tiền điện theo chỉ số cũ và chỉ số mới: ");
		System.out.println("Nhập chỉ số cũ (kWh): ");
		double chiSoCu = sc.nextDouble();
		System.out.println("Nhập chỉ mới mới (kWh): ");
		double chiSoMoi = sc.nextDouble();
		double luongDienTieuThu = chiSoMoi - chiSoCu;
		double soTienDien;
		System.out.println("Lượng điện năng tiêu thụ là: " + luongDienTieuThu + " (kWh)");
		if (luongDienTieuThu > 0 && luongDienTieuThu <= 50) {
			soTienDien = luongDienTieuThu * 1728;
		} else if (luongDienTieuThu >= 51 && luongDienTieuThu <= 100) {
			soTienDien = 50 * 1728 + (luongDienTieuThu - 50) * 1786;
		} else if (luongDienTieuThu >= 101 && luongDienTieuThu <= 200) {
			soTienDien = 50 * 1728 + 50 * 1786 + (luongDienTieuThu - 100) * 2074;
		} else if (luongDienTieuThu >= 201 && luongDienTieuThu <= 300) {
			soTienDien = 50 * 1728 + 50 * 1786 + 100 * 2074 + (luongDienTieuThu - 200) * 2612;
		} else if (luongDienTieuThu >= 301 && luongDienTieuThu <= 400) {
			soTienDien = 50 * 1728 + 50 * 1786 + 100 * 2074 + 100 * 2612 + (luongDienTieuThu - 300) * 2919;
		} else {
			soTienDien = 50 * 1728 + 50 * 1786 + 100 * 2074 + 100 * 2612 + 100 * 2919
					+ (luongDienTieuThu - 400) * 3015;
		}
		soTienDien = soTienDien + soTienDien*((double)10/100);
		soTienDien = Math.round(soTienDien);
		System.out.println("Tiền điện tháng này: " + soTienDien);
		sc.close();
	}
}
