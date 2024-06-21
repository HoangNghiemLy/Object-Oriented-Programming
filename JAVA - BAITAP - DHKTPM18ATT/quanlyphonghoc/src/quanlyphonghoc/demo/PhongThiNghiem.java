/*
 * @ (#)  PhỏngThiNghiem.java   2023-06    Nov 20, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlyphonghoc.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 20, 2023
 * @time:		 9:23:29 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;

	public PhongThiNghiem() {
		this("", "", 0.0, 0, "", 0, false);
	}

	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	@Override
	public String toString() {
		return super.toString() + "[tenChuyenNganh= " + chuyenNganh + ", sucChua=" + sucChua + ", bonRua=" + bonRua
				+ "]";
	}

	@Override
	public boolean datChuan() {
		return duAnhSang() && bonRua;
	}
}
