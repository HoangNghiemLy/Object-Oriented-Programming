/*
 * @ (#)  DanhSachPhongHoc.java   2023-06    Nov 20, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlyphonghoc.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 20, 2023
 * @time:		 9:30:07 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class DanhSachPhongHoc {
	private List<PhongHoc> dsph;

	/*
	 * constructor
	 */
	public DanhSachPhongHoc() {
		this.dsph = new ArrayList<PhongHoc>();
	}

	/*
	 * trả về danh sách phòng học
	 */
	public List<PhongHoc> getDS() {
		return dsph;
	}

	/*
	 * Tìm kiếm phòng học theo mã
	 */
	public PhongHoc timKiemPhongHocTheoMa(String maPhong) {
		return dsph.stream().filter(ph -> ph.getMaPhong().equalsIgnoreCase(maPhong)).findFirst().orElse(null);
	}

	/*
	 * Thêm phòng học
	 */
	public boolean themPhongHoc(PhongHoc ph) {
		if (ph == null && dsph.contains(ph))
			return false;
		return dsph.add(ph);
	}

	/*
	 * In danh sách phòng học đạt chuẩn toList() trả về danh sách
	 */
	public List<PhongHoc> inDanhSachPhongHocDatChuan() {
		return dsph.stream().filter(ph -> ph.datChuan()).collect(Collectors.toList());
	}

	/*
	 * Sắp xếp theo dãy nhà
	 */
	public void sapXepTheoDayNha() {
		dsph.sort(Comparator.comparing(PhongHoc::getDayNha));
	}

	/*
	 * Sắp xếp theo diện tích giảm dần
	 */
	public void sapXepTheoDienTich() {
		dsph.sort(Comparator.comparing(PhongHoc::getDienTich).reversed());
	}

	/*
	 * Sắp xếp theo bóng đèn tăng dần
	 */
	public void sapXepTheoBongDen() {
		dsph.sort(Comparator.comparing(PhongHoc::getSoBongDen));
	}

	/*
	 * Cập nhật số máy tính cho phòng máy tính khi biết mã phòng
	 */
	public boolean capNhatSoMayTinh(String maPhong, int soMayMoi) {
		PhongHoc ph = timKiemPhongHocTheoMa(maPhong);
		if (ph == null || !(ph instanceof PhongMayTinh))
			return false;
		if (soMayMoi <= 0)
			return false;
		PhongMayTinh temp = (PhongMayTinh) ph;
		temp.setSoMayTinh(soMayMoi);
		return true;
	}

	/*
	 * Xóa phòng học khi biết mã
	 */
	public boolean xoaPhongHoc(String maPhong) {
		PhongHoc ph = timKiemPhongHocTheoMa(maPhong);
		if (ph == null)
			return false;
		return dsph.remove(ph);
	}

	/*
	 * Tổng số phòng học
	 */
	public int getSoPhongHoc() {
		return dsph.size();
	}

	/*
	 * In danh sách phòng máy tính có 60 máy trở lên
	 */
	public List<PhongHoc> getDSPhongMayTinhCo60May(int soMay) {
		return dsph.stream().filter(ph -> (ph instanceof PhongMayTinh && ((PhongMayTinh) ph).getSoMayTinh() == soMay))
				.collect(Collectors.toList());
	}

}
