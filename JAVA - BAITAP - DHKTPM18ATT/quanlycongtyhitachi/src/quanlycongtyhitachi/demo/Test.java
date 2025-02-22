/*
 * @ (#)  Test.java   2023-06    Nov 14, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtyhitachi.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 14, 2023
 * @time:		 9:53:04 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Test {
	public static void main(String[] args) {
		DanhSachNhanVien ds = new DanhSachNhanVien();
		
		ds.themNhanVien(new NhanVienBanHang("02", "Ly", "A", 510000, "09832313", "@@@", 5000.0));
		ds.themNhanVien(new NhanVienBanHang("03", "Ly", "B", 510000, "09832313", "@@@", 4000.0));
		ds.themNhanVien(new NhanVienBanHang("04", "Ly", "C", 510000, "09832313", "@@@", 58.500000));
		
		ds.themNhanVien(new NhanVienKiThuat("05", "Ly", "Nhi", 50000.0, "09321331", "@@@", false));
		ds.themNhanVien(new NhanVienKiThuat("06", "Ly", "Ba", 8000.0, "09321331", "@@@", true));
		ds.themNhanVien(new NhanVienKiThuat("07", "Ly", "Ca", 90000.0, "09321331", "@@@", false));
		ds.themNhanVien(new NhanVienKiThuat("08", "Ly", "Gia", 10000.0, "09321331", "@@@", true));
		
		ds.getDS().forEach(System.out::println);
		System.out.println();
		ds.xoaNhanVien("01");ds.getDS().forEach(System.out::println);

		
	}

}
