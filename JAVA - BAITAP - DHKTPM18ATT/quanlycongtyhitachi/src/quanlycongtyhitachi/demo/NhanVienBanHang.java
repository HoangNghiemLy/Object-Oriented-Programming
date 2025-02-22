/*
 * @ (#)  NhanVienBanHang.java   2023-06    Nov 14, 2023
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
 * @time:		 9:26:34 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class NhanVienBanHang extends NhanVien {
	private double doanhso;

	
	

	public NhanVienBanHang(String manv, String honv, String tennv, double luongcb, String sdt, String email,
			double doanhso) {
		super(manv, honv, tennv, luongcb, sdt, email);
		this.doanhso = doanhso;
	}

	@Override
	public double tinhTienLuongHangThang() {
		if (this.doanhso >= 50000000.0)
			return super.getLuongcb() + super.getLuongcb() + this.doanhso * (0.1);
		return super.getLuongcb();

	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+ super.toString() + String.format("DoanhSo=%f", this.doanhso);
	}

}
