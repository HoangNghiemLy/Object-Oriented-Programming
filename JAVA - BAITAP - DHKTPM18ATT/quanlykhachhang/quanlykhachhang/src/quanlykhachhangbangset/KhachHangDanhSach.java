package quanlykhachhangbangset;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class KhachHangDanhSach {
	private Set<KhachHang> kh;
	
	public KhachHangDanhSach() {
		this.kh = new HashSet<KhachHang>();
	}
	
	public KhachHang timKiemKhachHang(String id) {
		for (KhachHang khachHang : kh) {
			if(khachHang!=null && khachHang.getMaKhachHang().equals(id)==true) {
				return khachHang;
			}
		}
		return null;
	}
	
	public Set<KhachHang> getKh() {
		return this.kh;
	}

	public void themKhachHang(KhachHang e) {
		this.kh.add(e);
	}
	
	public long tongSoLuongChoKhachHangViet() {
		return kh.stream()
		.filter(x -> x instanceof KhachHangVietNam)
		.collect(Collectors.counting());
		
	}
	
	public long tongSoLuongChoKhachHangNgoai() {
		return kh.stream()
				.filter(x -> x instanceof KhachHangNuocNgoai)
				.collect(Collectors.counting());
	}
	
	public double trungBinhThanhTienuaKhachHangNuocNgoai() {
		return this.kh.stream().filter(x -> x instanceof KhachHangNuocNgoai)
						.collect(Collectors.averagingDouble(KhachHang::thanhTien));
	}
	
	public Set<KhachHang> xuatCacHoaDonTheoThang() {
		return this.kh.stream()
					.filter(x -> x.getHoaDon().getYear() == 2013 && x.getHoaDon().getMonthValue()==9)
					.collect(Collectors.toSet());
	}
	
}
