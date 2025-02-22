/*
 * @ (#)  NhanVien.java   2023-06    Nov 22, 2023
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
 * @time:		 12:39:28 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public abstract class NhanVien {
	protected String maSo;
	protected String hoTen;
	protected String sdt;
	protected double luongCB;

	public NhanVien() {
		this("", "", "", 0.0);
	}

	public NhanVien(String maSo, String hoTen, String sdt, double luongCB) {
		super();
//		if (this.maSo == null || this.maSo.isBlank())
//			throw new IllegalArgumentException("Ma so sai");
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.luongCB = luongCB;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		if (this.maSo == null || this.maSo.isBlank())
			throw new IllegalArgumentException("Ma so sai");
		this.maSo = maSo;
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

	public abstract double tinhTienLuong();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSo == null) ? 0 : maSo.hashCode());
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
		NhanVien other = (NhanVien) obj;
		if (maSo == null) {
			if (other.maSo != null)
				return false;
		} else if (!maSo.equals(other.maSo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [maSo=" + maSo + ", hoTen=" + hoTen + ", sdt=" + sdt + ", luongCB="
				+ luongCB + "]";
	}

}
