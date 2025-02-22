/*
 * @ (#)  Exer04Test.java   2023-06    Aug 24, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package bai2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 24, 2023
 * @time:		 9:25:51 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

class Exer04Test {

	@Test
	public void testGetTienDien() {
		int chiSoCu = 5689;
		int chiSoMoi = 7809;
		double actual = 6734200.0;
		double expected = Exer04.getTienDien(chiSoCu, chiSoMoi);
		assertEquals(expected, actual);
		
	}
}
