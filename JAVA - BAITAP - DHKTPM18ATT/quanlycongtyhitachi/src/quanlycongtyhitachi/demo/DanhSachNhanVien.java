/*
 * @ (#)  DanhSachNhanVien.java   2023-06    Nov 14, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtyhitachi.demo;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 14, 2023
 * @time:		 9:43:43 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class DanhSachNhanVien {
	List<NhanVien> dsnv;

	public DanhSachNhanVien() {
		this.dsnv = new ArrayList<NhanVien>();
	}

	/*
	 * Tìm kiếm nhân viên theo mã
	 */
	public NhanVien timKiemNhanVienTheoMa(String ma) {
		return this.dsnv.stream().filter(p -> p.getManv().equalsIgnoreCase(ma)).findFirst().orElse(null);
	}

	/*
	 * Thêm nhân viên không trùng mã
	 */
	public boolean themNhanVien(NhanVien nv) {
		if (timKiemNhanVienTheoMa(nv.getManv()) != null)
			return false;
		return this.dsnv.add(nv);
	}

	/*
	 * Xóa nhân viên khi biết mã
	 */
	public boolean xoaNhanVien(String ma) {
		return this.dsnv.remove(timKiemNhanVienTheoMa(ma));
	}

	/*
	 * Trả về danh sách nhân viên
	 */
	public List<NhanVien> getDS() {
		return this.dsnv;
	}
}
