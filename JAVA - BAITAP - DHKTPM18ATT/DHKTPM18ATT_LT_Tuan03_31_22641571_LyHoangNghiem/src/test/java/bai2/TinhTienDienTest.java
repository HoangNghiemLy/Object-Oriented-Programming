/*
 * @ (#)  TinhTienDienTest.java   2023-06    Aug 22, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package bai2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 22, 2023
 * @time:		 10:52:22 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

class TinhTienDienTest {

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
		"7298, 6638, 1892110",
		"6638, 5689, 2850579",
		"5689, 5640, 93140",
		"5640, 5467, 359813",
		"5647, 5647, 0",
		"5467, 5417, 95040",
	})
	void testTinhTienDien(int chiSoMoi, int chiSoCu, double expected) {
		double actual = TinhTienDien.tinhTienDien(chiSoMoi, chiSoCu);
		assertEquals(expected, actual);
	}
}
