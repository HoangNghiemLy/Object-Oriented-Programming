/*
 * @ (#)  KhachHangVietNam.java   2023-06    Feb 21, 2024
 *
 * Copyright (c) 2024  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtydienluc.demo;

import java.time.LocalDate;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Feb 21, 2024
 * @time:		 5:49:58 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class KhachHangVietNam extends KhachHang{
	private DoiTuongKhachHang doiTuong;
	private double dinhMuc;
	
	public KhachHangVietNam() {
		this("","",LocalDate.now(),0.0,0.0,DoiTuongKhachHang.Sinh_Hoat,0.0);
	}
	public KhachHangVietNam(String maKH, String hoTen, LocalDate ngayHD, double soLuong, double donGia,
			DoiTuongKhachHang doiTuong, double dinhMuc) {
		super(maKH, hoTen, ngayHD, soLuong, donGia);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}
	public DoiTuongKhachHang getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(DoiTuongKhachHang doiTuong) {
		this.doiTuong = doiTuong;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	@Override
	public double thanhTien() {
		if (super.soLuong <= this.dinhMuc) {
			return super.soLuong * super.donGia;
		}else
			return super.soLuong * super.donGia *this.dinhMuc + (super.soLuong - this.dinhMuc) * super.donGia *2.5;
		
	}
	@Override
	public String toString() {
		return "KhachHangVietNam [doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + ", thanhTien()=" + thanhTien() + "]";
	}
	
	
}
