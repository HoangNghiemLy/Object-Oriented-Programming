/*
 * @ (#)  CalculatorTest.java   2023-06    Aug 21, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package bai1;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 21, 2023
 * @time:		 11:38:17 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

class CalculatorTest {

	@Test
	void testSum() {
		int actual = Calculator.sum(1, 2);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@ParameterizedTest(name = "{0} / {1} = {2}")
	@CsvSource({ 
		"5, 2, 2.5", 
		"0, 3, 0.0", 
		"1, 3, 0.333333334",
		"1, 0, 0",

	})
	void testDiv(int a, int b, float expected) {
		float actual = Calculator.div(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testDivException() {
		Exception exception = assertThrows(InputMismatchException.class, () -> {
			Calculator.div(5, 0);
		});
		String expected = "Cannot divided by zero";
		assertEquals(expected, exception.getMessage());
	}
}


