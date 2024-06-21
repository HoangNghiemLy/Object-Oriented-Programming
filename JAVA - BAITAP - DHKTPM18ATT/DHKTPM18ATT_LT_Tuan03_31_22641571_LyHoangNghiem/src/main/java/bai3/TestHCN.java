/*
 * @ (#)  Test.java   2023-06    Aug 21, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package bai3;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 21, 2023
 * @time:		 11:27:22 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class TestHCN {
	public static void main(String[] args) {
		HinhChuNhat hinh1 = new HinhChuNhat(5, 10);
		HinhChuNhat hinh2 = new HinhChuNhat(7, 15);
		HinhChuNhat hinh3 = new HinhChuNhat(3, 8);

		System.out.println("Hinh 1: " + hinh1);
		System.out.println("Hinh 2: " + hinh2);
		System.out.println("Hinh 3: " + hinh3);
	}
}
