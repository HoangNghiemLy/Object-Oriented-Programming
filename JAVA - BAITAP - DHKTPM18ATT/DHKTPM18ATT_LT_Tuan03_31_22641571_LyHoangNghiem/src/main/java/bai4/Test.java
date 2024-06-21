/*
 * @ (#)  Test.java   2023-06    Aug 23, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package bai4;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 23, 2023
 * @time:		 4:11:32 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Test {
	public static void main(String[] args) {
		Bien bien = new Bien("Tân Thành", "nâu phù sa", 15.5);
		May may = new May("Mây hoàng hôn", "cam", 1500.15);

		System.out.println("Thông tin biển:\n ");
		System.out.println(bien);
		bien.lapLanh();
		System.out.println("\nThông tin mây: ");
		System.out.println(may);
		may.diChuyen();
	}
}
