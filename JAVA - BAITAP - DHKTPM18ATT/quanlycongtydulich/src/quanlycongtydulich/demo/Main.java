/*
 * @ (#)  Main.java   2023-06    Jan 31, 2024
 *
 * Copyright (c) 2024  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtydulich.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Jan 31, 2024
 * @time:		 10:22:32 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		QuanLyChuyenXe ds = new QuanLyChuyenXe();
		int chon;
		ds.themChuyenXe(new ChuyenXeNgoaiThanh("12", "ABC", "123ABC", 1200, "Ha Noi", 2));
		ds.themChuyenXe(new ChuyenXeNgoaiThanh("345", "DEF", "345DEF", 3500, "SaPa", 5));
		ds.themChuyenXe(new ChuyenXeNgoaiThanh("456", "GHJ", "GHJ456", 50000, "Da Nang", 7));
		System.out.println();
		ds.themChuyenXe(new ChuyenXeNoiThanh("111", "Nguyen A", "68123", 12, 15, 3));
		ds.themChuyenXe(new ChuyenXeNoiThanh("222", "Nguyen B", "B13123", 50, 100, 5));
		ds.themChuyenXe(new ChuyenXeNoiThanh("121", "Lam C", "DDD11", 75, 500, 12));
		ds.themChuyenXe(new ChuyenXeNgoaiThanh("111", "Nghiem", "12331", 12, "HA", 12)); // thêm không được vì trùng mã 
		do {
			System.out.println("====MENU QUAN LY DU LICH====");
			System.out.println("1. Nhap danh sach cac chuyen xe.\r\n" + "2. Xuat danh sach cac chuyen xe\r\n"
					+ "3. Tinh tong doanh thu cua cac chuyen xe\r\n"
					+ "4. Tinh tong doanh thu cac chuyen xe noi thanh\r\n"
					+ "5. Tinh tong doanh thu cac chuyen xe ngoai thanh\r\n"
					+ "6. Tim chuyen xe co doanh thu cao nhat\r\n"
					+ "7. Sap xep danh sach chuyen xe tang dan theo doanh thu\r\n" 
					+ "8. Tim kiem theo ma chuyen xe\r\n"
					+ "9. Xoa chuyen xe theo ma chuyen xe\r\n"
					+ "10. Cap nhat chuyen xe khi biet ma chuyen xe\r\n"
					+ "11. Thong ke doanh thu trung binh cua tat ca cac chuyen xe\r\n"
					+"12. Thoat chuong trinh");
			System.out.println("Nhap lua chon: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1 -> {
				System.out.println("Nhap so luong chuyen xe: ");
				int n = sc.nextInt();
				sc.nextLine();
				System.out.println();
				System.out.println("Nhap loai chuyen xe: ");
				String loaiXe = sc.nextLine();
				if (loaiXe.equalsIgnoreCase("noi thanh")) {
					for(int i = 0;i<n;i++) {
						System.out.println("Nhap chuyen xe noi thanh thu "+(i+1)+":");
						System.out.println("Nhap ma chuyen xe: ");
						String maXe = sc.nextLine();
						System.out.println("Ho ten tai xe: ");
						String hoTenTaiXe = sc.nextLine();
						System.out.println("So xe: ");
						String soXe = sc.nextLine();
						System.out.println("Doanh thu: ");
						double doanhThu = sc.nextDouble();
						System.out.println("So km di duoc: ");
						double soKm = sc.nextDouble();
						System.out.println("So tuyen: ");
						int soTuyen = sc.nextInt();
						ChuyenXe cx = new ChuyenXeNoiThanh(maXe, hoTenTaiXe, soXe, doanhThu, soKm, soTuyen);
						ds.themChuyenXe(cx);
					}
				}else if(loaiXe.equalsIgnoreCase("ngoai thanh")) {
					for (int i = 0;i<n;i++) {
						System.out.println("Nhap chuyen xe ngoai thanh thu "+(i+1)+":");
						System.out.println("Nhap ma chuyen xe: ");
						String maXe = sc.nextLine();
						System.out.println("Ho ten tai xe: ");
						String hoTenTaiXe = sc.nextLine();
						System.out.println("So xe: ");
						String soXe = sc.nextLine();
						System.out.println("Doanh thu: ");
						double doanhThu = sc.nextDouble();
						sc.nextLine();
						System.out.println("Noi den: ");
						String noiDen = sc.nextLine();
						System.out.println("So ngay di duoc: ");
						int soNgayDiDuoc = sc.nextInt();
						ChuyenXe cx = new ChuyenXeNgoaiThanh(maXe, hoTenTaiXe, soXe, doanhThu, noiDen, soNgayDiDuoc);
						ds.themChuyenXe(cx);
					}
				}
			}

			case 2 -> {
				ds.getDS().forEach(kh -> System.out.println(kh));
				System.out.println();
			}
			case 3 -> {
				System.out.println("Tong doanh thu tat ca cac chuyen xe: " + ds.tinhTongDoanhThuChuyenXe());
				System.out.println();
			}
			case 4 -> {
				System.out.println("Tong doanh thu cac chuyen xe noi thanh: " + ds.tinhTongDoanhThuNoiThanh());
				System.out.println();
			}
			case 5 -> {
				System.out.println("Tong doanh thu cac chuyen xe ngoai thanh: " + ds.tinhTongDoanhThuNgoaiThanh());
				System.out.println();
			}
			case 6 -> {
				System.out.println("Chuyen xe co doanh thu cao nhat la: ");
				ds.timChuyenXeDTCaoNhat().forEach(x -> System.out.println(x));
				System.out.println();

			}
			case 7 -> {
				System.out.println("Sap xep doanh thu tang dan");
				ds.sapXepTheoDoanhThu();
				ds.getDS().forEach(kh -> System.out.println(kh));
				System.out.println();
			}
			case 8 ->{
				sc.nextLine();
				System.out.println();
				System.out.println("Nhap ma chuyen xe can tim: ");
				String maXe = sc.nextLine();
				ChuyenXe a = ds.timKiemChuyenXeTheoMa(maXe);
				if (a!=null) {
					System.out.println("Tim thay ma xe: "+maXe);
					System.out.println(a);
					System.out.println();
				}else {
					System.out.println("Khong tim thay ma chuyen xe: "+maXe);
					System.out.println();
				}
			}
			case 9 ->{
				sc.nextLine();
				System.out.println("Nhap ma chuyen xe can xoa: ");
				String maXe = sc.nextLine();
				if(ds.xoaChuyenXeTheoMa(maXe)==true) {
					System.out.println("Xoa thanh cong ma chuyen xe: "+maXe);
					ds.getDS().forEach(x -> System.out.println(x));
					System.out.println();
				}else {
					System.out.println("Khong tim thay ma xe "+maXe+" de xoa");
					System.out.println();
				}
			}
			case 10 ->{
				System.out.println();
				sc.nextLine();
				System.out.println("Nhap ma chuyen xe can cap nhat: ");
				String maXe = sc.nextLine();
				ChuyenXe cx = ds.timKiemChuyenXeTheoMa(maXe);
				if(cx==null) {
					System.out.println("Khong tim thay ma chuyen xe "+maXe+" de cap nhat");
				}else {
					System.out.println("Ho ten tai xe: ");
					String tenTaiXe = sc.nextLine();
					System.out.println("So xe: ");
					String soXe = sc.nextLine();
					System.out.println("Doanh thu: ");
					double doanhThu =sc.nextDouble();
					if(cx instanceof ChuyenXeNoiThanh ) {
						System.out.println("So km: ");
						double soKm = sc.nextDouble();
						System.out.println("So chuyen: ");
						int soChuyen = sc.nextInt();
						ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh(maXe, tenTaiXe, soXe, doanhThu, soKm, soChuyen);
						ds.capNhatChuyenXe(chuyenXeNoiThanh);
						System.out.println("Cap nhat thanh cong ma chuyen xe: "+maXe);
						ds.getDS().forEach(x -> System.out.println(x));
						System.out.println();
					}else if(cx instanceof ChuyenXeNgoaiThanh) {
						sc.nextLine();
						System.out.println("Noi den: ");
						String noiDen = sc.nextLine();
						System.out.println("So ngay di duoc: ");
						int soNgayDiDuoc = sc.nextInt();
						ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh(maXe, tenTaiXe, soXe, doanhThu, noiDen, soNgayDiDuoc);
						ds.capNhatChuyenXe(chuyenXeNgoaiThanh);
						System.out.println("Cap nhat thanh cong ma chuyen xe: "+maXe);
						ds.getDS().forEach(x -> System.out.println(x));
						System.out.println();
					}
				}
			}
			case 11 ->{
				System.out.println();
				System.out.println("Thong ke doanh thu trung binh cua tat ca chuyen xe: ");
				ds.thongKeDoanhThuTrungBinhCuaTatCaChuyenXe().entrySet().stream().forEach(x -> System.out.println(x));
				System.out.println();
			}
			case 12 -> {
				System.out.println("Tam biet!!!");
				System.exit(0);
				break;
			}
		}

		} while (chon > 0);

	}

}
