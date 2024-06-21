/*
 * @ (#)  HinhChuNhat.java   2023-06    Aug 21, 2023
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
 * @time:		 11:11:15 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class HinhChuNhat {
	private double chieuDai;// chiều dài 
	private double chieuRong;// chiều rộng 
	
	//Constructors
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	//Getters and Setters
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	//Methods
	public double tinhChuVi() {
		return 2* (chieuDai + chieuRong);
	}
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}

	@Override
	public String toString() {
		return "Hinh Chu Nhat [Chieu Dai = " + chieuDai + ", Chieu Rong = " + chieuRong + ", Chu Vi = " + tinhChuVi()
				+ ", Dien Tich = " + tinhDienTich() + "]";
	}
	
	
	
	
	
	
	
	
	

}
