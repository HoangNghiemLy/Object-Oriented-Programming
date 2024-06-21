/*
 * @ (#)  TinhTienDien.java   2023-06    Aug 22, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package bai2;

import java.util.Scanner;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 22, 2023
 * @time:		 10:27:32 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class TinhTienDien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chỉ số cũ(KWh): ");
		int chiSoCu = sc.nextInt();
		System.out.println("Nhập chỉ số mới(KWh): ");
		int chiSoMoi = sc.nextInt();
		int luongDienTieuThu = chiSoMoi - chiSoCu;
		double tongTienDien = tinhTienDien(chiSoMoi, chiSoCu);
		System.out.println("Lượng điện tiêu thụ: " + luongDienTieuThu + " KWh");
		System.out.println("Tổng tiền điện: " + tongTienDien + " VND");
		sc.close();
	}

	public static double tinhTienDien(int chiSoMoi, int chiSoCu) {
		int luongDien = chiSoMoi - chiSoCu;
		double tongTien = 0;
		if (luongDien <= 50) {
			tongTien = luongDien * 1728;
		} else if (luongDien <= 100) {
			tongTien = 50 * 1728 + (luongDien - 50) * 1786;
		} else if (luongDien <= 200) {
			tongTien = 50 * 1728 + 50 * 1786 + (luongDien - 100) * 2074;
		} else if (luongDien <= 300) {
			tongTien = 50 * 1728 + 50 * 1786 + 100 * 2074 + (luongDien - 200) * 2612;
		} else if (luongDien <= 400) {
			tongTien = 50 * 1728 + 50 * 1786 + 100 * 2074 + 100 * 2612 + (luongDien - 300) * 2919;
		} else {
			tongTien = 50 * 1728 + 50 * 1786 + 100 * 2074 + 100 * 2612 + 100 * 2919 + (luongDien - 400) * 3015;
		}
		tongTien = tongTien + tongTien*((double)10/100);
		tongTien = Math.round(tongTien);
		return tongTien;
	}
}
