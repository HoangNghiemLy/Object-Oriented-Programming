/*
 * @ (#)  Exer04.java   2023-06    Aug 23, 2023
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
 * @date:    	 Aug 23, 2023
 * @time:		 4:54:26 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Exer04 {
	public static void main(String[] args) {
		int chiSoCu = 5689;
		int chiSoMoi = 6638;
		int tienDien = getTienDien(chiSoCu, chiSoMoi); // Tiền điện
		System.out.println("Tiền điện: " + tienDien);
	}

	public static int getTienDien(int chiSoCu, int chiSoMoi) {

		final double THUE = 0.1; // Thuế VAT

		int soKWh = chiSoMoi - chiSoCu; // Số kWh tiêu thụ
		int tienDien = getSoKWh(soKWh, 400, Integer.MAX_VALUE) * 3015 + getSoKWh(soKWh, 300, 400) * 2919
				+ getSoKWh(soKWh, 200, 300) * 2612 + getSoKWh(soKWh, 100, 200) * 2074 + getSoKWh(soKWh, 50, 100) * 1786
				+ getSoKWh(soKWh, 0, 50) * 1728;

		return tienDien + (int) Math.ceil(tienDien * THUE);
	}

	public static int getSoKWh(int soKWh, int soDau, int soCuoi) {

		if (soKWh < soDau)
			return 0;
		if (soKWh <= soCuoi)
			return soKWh - soDau;

		return soCuoi - soDau;
	}
}
