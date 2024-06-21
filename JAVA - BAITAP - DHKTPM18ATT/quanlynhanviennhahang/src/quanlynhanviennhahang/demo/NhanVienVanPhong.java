/*
 * @ (#)  NhanVienVanPhong.java   2023-06    Nov 21, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanviennhahang.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 21, 2023
 * @time:		 11:41:23 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class NhanVienVanPhong extends NhanVien {
	private double heSoLuong;

	public NhanVienVanPhong() {
		this("", "", "", 0.0, 0.0);
	}

	public NhanVienVanPhong(String maSo, String hoTen, String sdt, double luongCB, double heSoLuong) {
		super(maSo, hoTen, sdt, luongCB);
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		if (this.heSoLuong < 1.86 || this.heSoLuong > 8.96)
			throw new IllegalArgumentException("He So Luong Sai");
		this.heSoLuong = heSoLuong;
	}

	@Override
	public double tinhTienLuong() {
		return super.luongCB * this.heSoLuong;
	}

	@Override
	public String toString() {
		return super.toString() + "heSoLuong= " + heSoLuong;
	}

}
