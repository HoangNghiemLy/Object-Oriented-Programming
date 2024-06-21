/*
 * @ (#)  DanhSachNhanVien.java   2023-06    Nov 21, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanviennhahang.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 21, 2023
 * @time:		 11:44:07 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class DanhSachNhanVien {
	private List<NhanVien> dsnv;

	public DanhSachNhanVien() {
		this.dsnv = new ArrayList<NhanVien>();
	}

	/*
	 * Tim Kiem nhan vien khi biet ma so
	 */
	public NhanVien timKiemNhanVienTheoMa(String ma) {
		return dsnv.stream().filter(nv -> nv.getMaSo().equalsIgnoreCase(ma)).findFirst().orElse(null);
	}

	/*
	 * Them nhan vien
	 */
	public boolean themNhanVien(NhanVien nv) {
		if (timKiemNhanVienTheoMa(nv.getMaSo()) != null)
			throw new IllegalArgumentException("Trung ma nhan vien");
		return dsnv.add(nv);
	}

	/*
	 * Thong ke trung binh luong nhan vien
	 */
	public Map<String, Double> thongKeLuongTrungBinh() {
		Map<String, Double> tmp = dsnv.stream().collect(Collectors.groupingBy(x -> x.getClass().toString(),
				Collectors.averagingDouble(NhanVien::tinhTienLuong)));
		return tmp;
	}

	/*
	 * Danh Sach nhan vien ban hang khong co thu nhap tang them
	 */
	public List<NhanVienBanHang> getDSNVKhongCoThuNhapThem() {
		return dsnv.stream().filter(x -> x instanceof NhanVienBanHang).map(p -> (NhanVienBanHang) p)
				.filter(x -> x.getDoanhSoBan() < 20000000.0)
				.sorted(Comparator.comparing(NhanVienBanHang::getDoanhSoBan).reversed()).collect(Collectors.toList());

	}

	/*
	 * Danh sach nhan vien ban hang co doanh so lon nhat
	 */
	public List<NhanVienBanHang> getDSNVCoDoanhSoLonNhat() {
		NhanVien tmp1 = dsnv.stream().filter(x -> x instanceof NhanVienBanHang).map(p -> (NhanVienBanHang) p)
				.max(Comparator.comparing(NhanVienBanHang::getDoanhSoBan)).get();
		return dsnv.stream().filter(x -> x instanceof NhanVienBanHang).map(p -> (NhanVienBanHang) p)
				.filter(x -> x.getDoanhSoBan() == ((NhanVienBanHang) tmp1).getDoanhSoBan()).toList();

	}

	/*
	 * Cap Nhat thong tin nhan vien van phong khi biet ma so
	 */
	public boolean capNhatNhanVienVanPhong(String maSo, NhanVienVanPhong newInfor) {
		NhanVien t = timKiemNhanVienTheoMa(maSo);
		if (t == null || t instanceof NhanVienBanHang)
			return false;
		t.setMaSo(newInfor.getMaSo());
		t.setHoTen(newInfor.getHoTen());
		t.setSdt(newInfor.getSdt());
		t.setLuongCB(newInfor.getLuongCB());
		((NhanVienVanPhong) t).setHeSoLuong(newInfor.getHeSoLuong());
		return true;
	}
	/*
	 * Tra ve danh sach nhan vien
	 */
	public List<NhanVien> getDS() {
		return dsnv;
	}
}
