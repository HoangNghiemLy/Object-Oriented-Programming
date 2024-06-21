/*
 * @ (#)  DanhSachKhachHang.java   2023-06    Feb 23, 2024
 *
 * Copyright (c) 2024  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlycongtydienluc.demo;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Feb 23, 2024
 * @time:		 4:56:29 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class QuanLyHoaDon {
	List<KhachHang> dsKhachHang;
	
	public QuanLyHoaDon() {
		dsKhachHang = new ArrayList<KhachHang>();
	}
	//tìm kiếm khách hàng theo mã
	public KhachHang timKiemKhacHang(String maSo) {
		return dsKhachHang.stream().filter(x -> x.getMaKH().equalsIgnoreCase(maSo))
				.findFirst()
				.orElse(null);
	}
	//thêm một khách hàng mới ko trùng mã
	public boolean themMotKhachHang(KhachHang kh) {
		if (timKiemKhacHang(kh.getMaKH())!=null) {
			return false;
		}
		return dsKhachHang.add(kh);
	}
	//tính tổng số lượng kw tiêu thụ của toàn bộ ds khách hàng
	public double tinhTongSoKWTieuThuCuaDS() {
		double tongKWTieuThu = dsKhachHang.stream().mapToDouble(KhachHang::getSoLuong).sum();
		return tongKWTieuThu;
	}
	//Tính tổng số tiền phải trả của khách hàng trong nước
	public double tinhTongSoTienCuaKHTrongNuoc() {
		double tongSoTienKHTrongNuoc = dsKhachHang.stream()
				.filter(KhachHang->KhachHang instanceof KhachHangVietNam)
				.mapToDouble(KhachHang::thanhTien)
				.sum();
		return tongSoTienKHTrongNuoc;
	}
	
	
	

}
