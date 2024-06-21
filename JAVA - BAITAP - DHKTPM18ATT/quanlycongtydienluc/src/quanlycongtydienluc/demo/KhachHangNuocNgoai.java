/*
 * @ (#)  KhachHangNuocNgoai.java   2023-06    Feb 21, 2024
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
 * @time:		 5:59:59 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;
	
	public KhachHangNuocNgoai() {
		this("","",LocalDate.now(),0.0,0.0,"");
	}
	public KhachHangNuocNgoai(String maKH, String hoTen, LocalDate ngayHD, double soLuong, double donGia,
			String quocTich) {
		super(maKH, hoTen, ngayHD, soLuong, donGia);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	@Override
	public double thanhTien() {
		return super.soLuong * super.donGia;
	}

	@Override
	public String toString() {
		return "KhachHangNuocNgoai [quocTich=" + quocTich + ", thanhTien()=" + thanhTien() + "]";
	}
	
	

}
