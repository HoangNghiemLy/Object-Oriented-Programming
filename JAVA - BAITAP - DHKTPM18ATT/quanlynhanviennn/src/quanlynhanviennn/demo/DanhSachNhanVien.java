/*
 * @ (#)  DanhSachNhanVien.java   2023-06    Nov 22, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanviennn.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 22, 2023
 * @time:		 12:50:47 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class DanhSachNhanVien {
	private List<NhanVien> dsnv;

	public DanhSachNhanVien() {
		this.dsnv = new ArrayList<NhanVien>();
	}

	/*
	 * Tim kiem nhan vien theo ma so
	 */
	public NhanVien timKiemNhanVien(String ma) {
		return dsnv.stream().filter(p -> p.getMaSo().equalsIgnoreCase(ma)).findFirst().orElse(null);
	}

	/*
	 * Them mot nhan vien
	 */
	public boolean themMotNhanVien(NhanVien nv) {
		if (timKiemNhanVien(nv.getMaSo()) != null)
			return false;
		return dsnv.add(nv);
	}

	/*
	 * Thong ke luong trung binh cua nhan vien
	 */
	public Map<String, Double> thongKeLuongTrungBinh() {
		Map<String, Double> tmp = this.dsnv.stream().collect(Collectors.groupingBy(x -> x.getClass().toString(),
				Collectors.averagingDouble(NhanVien::tinhTienLuong)));
		return tmp;
	}

	/*
	 * Danh sach cac nhan vien khong co thu nhap tang them
	 */
	public List<NhanVienBanHang> getDSNVKhongCoThuNhapTangThem() {
		return this.dsnv.stream().filter(x -> x instanceof NhanVienBanHang).map(p -> (NhanVienBanHang) p)
				.filter(x -> x.getDoanhSoBan() < 20000000.0)
				.sorted(Comparator.comparing(NhanVienBanHang::getDoanhSoBan).reversed()).collect(Collectors.toList());
	}

	/*
	 * Cac nhan vien ban hang co doanh so lon nhat
	 */
	public List<NhanVienBanHang> getDSNVBanHangCoDoanhSoLonNhat() {
		NhanVien tmp = this.dsnv.stream().filter(x -> x instanceof NhanVienBanHang).map(p -> (NhanVienBanHang) p)
				.max(Comparator.comparing(NhanVienBanHang::getDoanhSoBan)).get();
		return this.dsnv.stream().filter(x -> x instanceof NhanVienBanHang).map(p -> (NhanVienBanHang) p)
				.filter(x -> x.getDoanhSoBan() == ((NhanVienBanHang) tmp).getDoanhSoBan()).collect(Collectors.toList());
	}

	/*
	 * Cap nhat thong tin cua nhan vien van phong khi biet ma so
	 */
	public boolean capNhatThongTinNhanVienVanPhong(String ma, NhanVienVanPhong nv) {
		NhanVien tmp = timKiemNhanVien(ma);
		if (tmp == null || tmp instanceof NhanVienBanHang)
			return false;
		tmp.setMaSo(nv.getMaSo());
		tmp.setHoTen(nv.getHoTen());
		tmp.setSdt(nv.getSdt());
		tmp.setLuongCB(nv.getLuongCB());
		((NhanVienVanPhong) tmp).setHeSoLuong(nv.getHeSoLuong());
		return true;
	}
	/*
	 * Lay danh sach nhan vien
	 */
	public List<NhanVien> getDSNV(){
		return dsnv;
	}

}
