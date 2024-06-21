/*
 * @ (#)  Calculator.java   2023-06    Aug 21, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package bai1;

import java.util.InputMismatchException;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 21, 2023
 * @time:		 10:30:05 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Calculator {
	public static int sum(int... numbers) {
		int total = 0;
		for(int num : numbers) {
			total += num;
		}
		return total;
	}
	public static float div(int a, int b){
		if(b == 0) {
			throw new InputMismatchException("Cannot divided by zero");
		}else {
			return (float)a/b;
		}
	}
}
