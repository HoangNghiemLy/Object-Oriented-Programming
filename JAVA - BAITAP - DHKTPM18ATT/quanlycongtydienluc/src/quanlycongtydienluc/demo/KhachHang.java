/*
 * @ (#)  KhachHang.java   2023-06    Feb 21, 2024
 *
 * Copyright (c) 2024  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtydienluc.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Feb 21, 2024
 * @time:		 5:46:56 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public abstract class KhachHang {
	protected String maKH;
	protected String hoTen;
	protected LocalDate ngayHD;
	protected double soLuong;
	protected double donGia;
	public KhachHang() {
		this("","",LocalDate.now(),0.0,0.0);
	}
	public KhachHang(String maKH, String hoTen, LocalDate ngayHD, double soLuong, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayHD = ngayHD;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(LocalDate ngayHD) {
		this.ngayHD = ngayHD;
	}
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public abstract double thanhTien();
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		KhachHang other = (KhachHang) obj;
		if (maKH == null) {
			if (other.maKH != null)
				return false;
		} else if (!maKH.equals(other.maKH))
			return false;
		return true;
	}
	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", ngayHD=" + df.format(ngayHD) + ", soLuong=" + soLuong
				+ ", donGia=" + donGia + "]";
	}
	
	
	
	

}
