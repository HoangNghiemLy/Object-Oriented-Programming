/*
 * @ (#)  NhanVien.java   2023-06    Dec 1, 2023
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
 * @time:		 9:12:45 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public abstract class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected String sdt;
	protected double luongCB;
	public NhanVien() {
		this("","","",0.0);
	}
	public NhanVien(String maNV, String hoTen, String sdt, double luongCB) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.luongCB = luongCB;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public double getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maNV == null) ? 0 : maNV.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		if (maNV == null) {
			if (other.maNV != null)
				return false;
		} else if (!maNV.equals(other.maNV))
			return false;
		return true;
	}
	public abstract double tinhTienLuong();
	@Override
	public String toString() {
		return getClass().getSimpleName() + "[maNV=" + maNV + ", hoTen=" + hoTen + ", sdt=" + sdt + ", luongCB=" + luongCB + "]";
	}	
}
