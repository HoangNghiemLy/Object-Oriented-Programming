/*
 * @ (#)  May.java   2023-06    Aug 23, 2023
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
 * @time:		 4:14:37 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class May {
	private String tenMay;
	private String mauSac;
	private double doCao;
	public May(String tenMay, String mauSac, double doCao) {
		super();
		this.tenMay = tenMay;
		this.mauSac = mauSac;
		this.doCao = doCao;
	}
	public String getTenMay() {
		return tenMay;
	}
	public void setTenMay(String tenMay) {
		this.tenMay = tenMay;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public double getDoCao() {
		return doCao;
	}
	public void setDoCao(double doCao) {
		this.doCao = doCao;
	}
	public void diChuyen() {
		System.out.println("Mây "+ tenMay+" đang trôi bồng bềnh !!!");
	}
	@Override
	public String toString() {
		return "\nMây: " + tenMay + " \nMàu sắc:" + mauSac + "\nĐộ cao: " + doCao;
	}
	
}
