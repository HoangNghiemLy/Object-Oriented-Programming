/*
 * @ (#)  NhanVienBanHang.java   2023-06    Nov 22, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanviennn.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 22, 2023
 * @time:		 12:42:52 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class NhanVienBanHang extends NhanVien {
	private double doanhSoBan;

	public NhanVienBanHang() {
		this("", "", "", 0.0, 0.0);
	}

	public NhanVienBanHang(String maSo, String hoTen, String sdt, double luongCB, double doanhSoBan) {
		super(maSo, hoTen, sdt, luongCB);
		if (this.doanhSoBan < 0)
			throw new IllegalArgumentException("Doanh so ban phai lon hon 0");
		this.doanhSoBan = doanhSoBan;
	}

	public double getDoanhSoBan() {
		return doanhSoBan;
	}

	public void setDoanhSoBan(double doanhSoBan) {
		if (this.doanhSoBan < 0)
			throw new IllegalArgumentException("Doanh so ban phai lon hon 0");
		this.doanhSoBan = doanhSoBan;
	}

	@Override
	public double tinhTienLuong() {
		if (this.doanhSoBan > 20000000.0)
			return super.luongCB + (this.doanhSoBan * 0.3);
		return super.luongCB;
	}

	@Override
	public String toString() {
		return super.toString() + "[doanhSoBan= " + doanhSoBan;
	}

}
