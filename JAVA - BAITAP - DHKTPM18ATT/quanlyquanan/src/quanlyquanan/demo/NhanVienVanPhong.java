/*
 * @ (#)  NhanVienKyThuat.java   2023-06    Dec 1, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlyquanan.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Dec 1, 2023
 * @time:		 9:20:34 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class NhanVienVanPhong extends NhanVien {
	private double heSoLuong;

	public NhanVienVanPhong(String maNV, String hoTen, String sdt, double luongCB, double heSoLuong) {
		super(maNV, hoTen, sdt, luongCB);
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public double tinhTienLuong() {
		return super.luongCB * this.heSoLuong;
	}

	@Override
	public String toString() {
		return super.toString() + "heSoLuong= " + this.heSoLuong;
	}

}
