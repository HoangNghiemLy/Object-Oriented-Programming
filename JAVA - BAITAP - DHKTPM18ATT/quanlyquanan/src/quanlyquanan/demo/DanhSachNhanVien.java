/*
 * @ (#)  DanhSachNhanVien.java   2023-06    Dec 1, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlyquanan.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Dec 1, 2023
 * @time:		 9:23:58 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class DanhSachNhanVien {
	List<NhanVien> dsnv;
	
	public DanhSachNhanVien() {
		this.dsnv = new ArrayList<NhanVien>();
	}
	
	public List<NhanVien> getDsnv() {
		return dsnv;
	}

	public void setDsnv(List<NhanVien> dsnv) {
		this.dsnv = dsnv;
	}

	/*
	 * Tim kiem nhan vien khi biet ma so
	 */
	public NhanVien timKiemNhanVien(String maSo) {
		return dsnv.stream().filter(x -> x.getMaNV().equalsIgnoreCase(maSo))
				.findFirst()
				.orElse(null);
	}
	/*
	 * Them mot nhan vien khong trung ma
	 */
	public boolean themNhanVien(NhanVien nv) {
		if(timKiemNhanVien(nv.getMaNV())!=null)
			return false;
		return this.dsnv.add(nv);
	}
	/*
	 * Thong ke luong trung binh cua nhan vien theo tung loai
	 */
	public Map<String, Double> thongKeLuongTrungBinhNhanVienTungLoai(){
		Map<String, Double> tmp = dsnv.stream().collect(Collectors.groupingBy(x->x.getClass().getSimpleName().toString(),Collectors.averagingDouble(NhanVien::tinhTienLuong)));
		return tmp;
	}
	/*
	 * Loc danh sach nhan vien khong co thuong them
	 */
	
	public List<NhanVienBanHang> dsNhanVienKhongCoThuongThem(){
		return dsnv.stream()
				.filter(x -> x instanceof NhanVienBanHang)
				.map(p -> (NhanVienBanHang)p)
				.filter(x -> x.getDoanhSoBan()<20000000.0)
				.sorted(Comparator.comparing(NhanVienBanHang::getDoanhSoBan).reversed())
				.collect(Collectors.toList());
	}
	/*
	 * Danh sach nhan vien ban hang uu tu
	 */
	public List<NhanVienBanHang> dsNhanVienBanHangUuTu(){
		NhanVien tmp1 = dsnv.stream()
				.filter(x -> x instanceof NhanVienBanHang)
				.map(p -> (NhanVienBanHang)p)
				.max(Comparator.comparing(NhanVienBanHang::getDoanhSoBan)).get();
		return dsnv.stream()
				.filter(x -> x instanceof NhanVienBanHang)
				.map(p -> (NhanVienBanHang)p)
				.filter(x -> x.getDoanhSoBan()==((NhanVienBanHang)tmp1).getDoanhSoBan())
				.toList();
	}
	/*
	 * Cap nhat nhan vien van phong
	 */
	public boolean capNhatNhanVienVanPhong(String maSo, NhanVienVanPhong newInfor) {
		NhanVien tmp = timKiemNhanVien(maSo);
		if(tmp== null || tmp instanceof NhanVienBanHang)
			return false;
		tmp.setMaNV(newInfor.getMaNV());
		tmp.setHoTen(newInfor.getHoTen());
		tmp.setSdt(newInfor.getSdt());
		tmp.setLuongCB(newInfor.getLuongCB());
		((NhanVienVanPhong)tmp).setHeSoLuong(newInfor.getHeSoLuong());
		return true;	
	}
}
