/*
 * @ (#)  ChuyenXeNoiThanh.java   2023-06    Jan 31, 2024
 *
 * Copyright (c) 2024  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtydulich.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Jan 31, 2024
 * @time:		 9:41:15 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class ChuyenXeNoiThanh extends ChuyenXe {
	private double soKm;
	private int soChuyen;
	public ChuyenXeNoiThanh() {
		this("","","",0.0,0.0,0);
	}
	public ChuyenXeNoiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, double doanhThu, double soKm,
			int soChuyen) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.soKm = soKm;
		this.soChuyen = soChuyen;
	}
	
	public double getSoKm() {
		return soKm;
	}

	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}

	public int getSoChuyen() {
		return soChuyen;
	}

	public void setSoChuyen(int soChuyen) {
		this.soChuyen = soChuyen;
	}

	@Override
	public String toString() {
		return super.toString() + "[so km= "+soKm+"]"+ " [So chuyen= "+soChuyen+"]";
	}
}
