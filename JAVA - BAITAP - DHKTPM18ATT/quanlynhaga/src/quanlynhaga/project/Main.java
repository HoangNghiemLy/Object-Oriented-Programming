/*
 * @ (#)  Main.java   2023-06    Nov 16, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhaga.project;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 16, 2023
 * @time:		 11:35:23 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("#,##0 VND");

	public static void main(String[] args) {
		QuanLyBanVe ds = new QuanLyBanVe();
		int chon;
		do {
			System.out.println("1. Them khach hang moi vao danh sach hang doi mua ve.\r\n"
					+ "2. Ban ve cho khach hang. Chi ban cho khach hang dang ky truoc.\r\n"
					+ "3. Hien thi danh sach khach hang.\r\n"
					+ "4. Huy mot khach hang ra khoi danh sach (Khach hang khong mua ve nua).\r\n"
					+ "5. Thong ke tinh hinh ban ve.\r\n" + "6. Luu danh sach vao file.\r\n"
					+ "7. Hien thi danh sach cac ga dang cho mua ve.\r\n"
					+ "8. Hien thi danh sach cac ga dang cho mua ve va so ve tuong ung cho ga.\r\n");
			System.out.println("Nhap lua chon: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1 -> {
				sc.nextLine();
				ds.themKhachHangMuaVe(nhapkhachang());
			}
			case 2 -> {
				KhachHangMuaVe kh = ds.banVe();
				System.out.println("Da xuat ve: " + kh);
			}
			case 3 -> {
				System.out.println("==Danh Sach Khach Hang Doi Mua Ve==");
				ds.getDSKHDoiMuaVe().forEach(kh -> System.out.println(kh));
				System.out.println();
				System.out.println("==Danh Sach Khach Hang Da Mua Ve==");
				ds.getDSVeDaBan().forEach(kh -> System.out.println(kh));
			}
			case 4 -> {
				sc.nextLine();
				System.out.println("Nhap CMND khach muon huy ve: ");
				String cmnd = sc.nextLine();
				boolean kq = ds.huyKhachHangKhongMuaVe(cmnd);
				System.out.println(kq);
			}
			case 5 -> {
				System.out.println("So khach cho: " + ds.getDSGaCoKhachChoMuaVe());
				System.out.println("So ve da ban: " + ds.soVeDaBan());
				System.out.println("Tong doanh thu: " + df.format(ds.soTienThuVe()));
			}
			case 6 -> {

			}
			case 7 -> {
				ds.getDSGaCoKhachChoMuaVe().forEach(ga -> System.out.println(ga));
			}
			case 8 -> {
				ds.getDSGaCoKhachChoMuaVeVaSoVeTuongUng().entrySet().stream().forEach(entry -> {
					System.out.println("Ga: " + entry.getKey());
					System.out.println("So khach cho: " + entry.getValue());
				});
			}

			}
		} while (chon > 0);
	}

	private static KhachHangMuaVe nhapkhachang() {
		System.out.println("Nhap CMND: ");
		String cmnd = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		String hoten = sc.nextLine();
		System.out.println("Nhap ga den: ");
		String gaden = sc.nextLine();
		System.out.println("Nhap gia tien: ");
		double giatien = sc.nextDouble();
		return new KhachHangMuaVe(cmnd, hoten, gaden, giatien);
	}

}
