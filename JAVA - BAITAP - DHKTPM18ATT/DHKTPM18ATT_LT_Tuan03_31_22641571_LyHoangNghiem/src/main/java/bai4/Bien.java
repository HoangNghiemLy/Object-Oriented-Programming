/*
 * @ (#)  Bien.java   2023-06    Aug 23, 2023
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
 * @time:		 4:05:03 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Bien {
	private String ten;
	private String mauSac;
	private double doAm;
	public Bien(String ten, String mauSac, double doAm) {
		super();
		this.ten = ten;
		this.mauSac = mauSac;
		this.doAm = doAm;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public double getDoAm() {
		return doAm;
	}
	public void setDoAm(double doAm) {
		this.doAm = doAm;
	}
	public void lapLanh() {
		System.out.println("Biển "+ ten + " đang lấp lánh!!!");
	}
	@Override
	public String toString() {
		return "Biển: " + ten + " \nMàu sắc: " + mauSac + " \nĐộ ẩm: " + doAm ;
	}
	
}
