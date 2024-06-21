/*
 * @ (#)  PhongLyThuyet.java   2023-06    Nov 20, 2023
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
 * @time:		 9:01:55 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class PhongLyThuyet extends PhongHoc {
	private boolean mayChieu;

	public PhongLyThuyet() {
		this("", "", 0.0, 0, false);
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	@Override
	public String toString() {
		return super.toString() + "[mayChieu = " + mayChieu+"]";
	}

	@Override
	public boolean datChuan() {
		return duAnhSang() && mayChieu;
	}

}
