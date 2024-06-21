/*
 * @ (#)  NhanVienKiThuat.java   2023-06    Nov 14, 2023
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
 * @time:		 9:34:50 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class NhanVienKiThuat extends NhanVien {
	private boolean mucdohoanthanh;

	public NhanVienKiThuat(String manv, String honv, String tennv, double luongcb, String sdt, String email,
			boolean mucdohoanthanh) {
		super(manv, honv, tennv, luongcb, sdt, email);
		this.mucdohoanthanh = mucdohoanthanh;
	}

	@Override
	public double tinhTienLuongHangThang() {
		if (this.mucdohoanthanh == true)
			return super.getLuongcb() + super.getLuongcb() * 0.1;
		return super.getLuongcb();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + super.toString() + String.format("MucDoHoanThanh=%s", this.mucdohoanthanh);
	}

}
