/*
 * @ (#)  Circle.java   2023-06    Oct 9, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package generic.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Oct 9, 2023
 * @time:		 6:20:59 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Circle <T extends Number>{ //T: type, E: Element,  K:Key , V:Value, N:Number ,
	private T radius;
	
	public Circle(T radius) {
		super();
		this.radius=radius;
	}
	public T getRadius() {
		return radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
