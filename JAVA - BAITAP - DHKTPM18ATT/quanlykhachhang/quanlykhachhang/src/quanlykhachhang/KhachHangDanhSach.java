package quanlykhachhang;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KhachHangDanhSach {
	private KhachHang[] kh;
	int n;
	
	public KhachHangDanhSach() {
		this.kh = new KhachHang[10];
		this.n = 0;
	}
	
	public KhachHang timKiemKhachHang(String id) {
		for (KhachHang khachHang : kh) {
			if(khachHang!=null && khachHang.getMaKhachHang().equals(id)==true) {
				return khachHang;
			}
		}
		return null;
	}
	
	public KhachHang[] getKh() {
		return Arrays.copyOf(this.kh, n);
	}

	public void themKhachHang(KhachHang e) {
		if(timKiemKhachHang(e.getMaKhachHang())!=null) throw new IllegalArgumentException("trung ma");
		this.kh[n] = e;
		n++;
	}
	
	public KhachHangDanhSach(int k) {
		this.kh = new KhachHang[k];
		this.n = 0;
	}
	
	public int tongSoLuongChoKhachHangViet() {
		int dem = 0;
		for (KhachHang khachHang : kh) {
			if(khachHang instanceof KhachHangVietNam) {
				++dem;
			}
		}
		return dem;
	}
	
	public int tongSoLuongChoKhachHangNgoai() {
		int dem = 0;
		for (KhachHang khachHang : kh) {
			if(khachHang instanceof KhachHangNuocNgoai) {
				++dem;
			}
		}
		return dem;
	}
	
	public double trungBinhThanhTienuaKhachHangNuocNgoai() {
		return Arrays.stream(kh, 0, n).filter(x -> x instanceof KhachHangNuocNgoai).collect(Collectors.averagingDouble(KhachHang::thanhTien));
	}
	
	public KhachHang[] xuatCacHoaDonTheoThang() {
		return Arrays.stream(kh, 0, n).filter(x -> x.getHoaDon().getMonthValue() == 9 && x.getHoaDon().getYear()==2013)
				.toArray(tmp -> new KhachHang[tmp]);
	}
	
}
