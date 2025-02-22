/*
 * @ (#)  ChuyenXeNgoaiThanh.java   2023-06    Jan 31, 2024
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
 * @time:		 9:54:02 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	public ChuyenXeNgoaiThanh() {
		this("","","",0.0,"",0);
	}
	public ChuyenXeNgoaiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgayDiDuoc) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	@Override
	public String toString() {
	
		return  super.toString() +"[Noi den= "+noiDen+"]"+ " [So ngay di duoc= "+soNgayDiDuoc+" ]";
	}

}
