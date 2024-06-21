/*
 * @ (#)  PhongMayTinh.java   2023-06    Nov 20, 2023
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
 * @time:		 9:12:30 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class PhongMayTinh extends PhongHoc{
	private int soLuongMayTinh;
	public PhongMayTinh() {
		this("","",0.0,0,0);
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soLuongMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soLuongMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soLuongMayTinh = soMayTinh;
	}
	@Override
	public String toString() {
		return super.toString()+"[soLuongMayTinh="+soLuongMayTinh+"]";
	}

	@Override
	public boolean datChuan() {
		return duAnhSang() && dienTich/1.5 >=soLuongMayTinh;
				
	}
	

}
