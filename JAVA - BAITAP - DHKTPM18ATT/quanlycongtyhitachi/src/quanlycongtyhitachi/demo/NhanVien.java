/*
 * @ (#)  NhanVien.java   2023-06    Nov 14, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtyhitachi.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 14, 2023
 * @time:		 9:14:53 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public abstract class NhanVien {
	private String manv;
	private String honv;
	private String tennv;
	private double luongcb;
	private String sdt;
	private String email;

	public NhanVien() {
		this("", "", "", 0.0, "","");
	}
	



	public NhanVien(String manv, String honv, String tennv, double luongcb, String sdt, String email) {
		super();
		this.manv = manv;
		this.honv = honv;
		this.tennv = tennv;
		this.luongcb = luongcb;
		this.sdt = sdt;
		this.email = email;
	}
	
	





	public String getManv() {
		return manv;
	}




	public void setManv(String manv) {
		this.manv = manv;
	}




	public String getHonv() {
		return honv;
	}




	public void setHonv(String honv) {
		this.honv = honv;
	}




	public String getTennv() {
		return tennv;
	}




	public void setTennv(String tennv) {
		this.tennv = tennv;
	}




	public double getLuongcb() {
		return luongcb;
	}




	public void setLuongcb(double luongcb) {
		this.luongcb = luongcb;
	}




	public String getSdt() {
		return sdt;
	}




	public void setSdt(String sdt) {
		this.sdt = sdt;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public abstract double tinhTienLuongHangThang();




	@Override
	public String toString() {
		return "NhanVien [manv=" + manv + ", honv=" + honv + ", tennv=" + tennv + ", luongcb=" + luongcb + ", sdt="
				+ sdt + ", email=" + email + "]";
	}
	
	
}
