package quanlySinhvien1;

import java.util.Scanner;

public class SinhvienTester {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Sinhvien sv1 = new Sinhvien(22641571, "Ly Hoang Nghiem", 8.5f, 9);
		Sinhvien sv2 = new Sinhvien(22641441, "Nguyen Duc Huy", 7.5f, 10);
		Sinhvien sv3 = nhapthongtin();

		System.out.printf(String.format("%-15s%-20s%10s%10s%10s\n", "mssv", "Ho Ten", "diem LT", "diem TH", "Diem TB"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}

	private static Sinhvien nhapthongtin() {
		Sinhvien sv = new Sinhvien();
		System.out.println("Nhap ma so sinh vien: ");
		sv.setMssv(sc.nextLong());
		sc.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		sv.setHoTen(sc.nextLine());
		System.out.println("Nhap diem ly thuyet: ");
		sv.setDiemLT(sc.nextFloat());
		System.out.println("Nhap diem thuc hanh: ");
		sv.setDiemTH(sc.nextFloat());
		return sv;
	}
}
