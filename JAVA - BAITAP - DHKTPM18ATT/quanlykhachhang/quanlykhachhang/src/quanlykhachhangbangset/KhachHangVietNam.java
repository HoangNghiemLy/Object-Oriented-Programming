package quanlykhachhangbangset;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class KhachHangVietNam extends KhachHang{
	Locale lc = new Locale("vi","vn");
	NumberFormat noo = NumberFormat.getCurrencyInstance(lc);
	private DoiTuongKhachHang dt;
	private int dinhMuc;
	
	public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate hoaDon, int soLuong, double donGia, DoiTuongKhachHang dt, int dinhMuc) {
		super(maKhachHang, hoTen, hoaDon, soLuong, donGia);
		if(dinhMuc<0) throw new IllegalArgumentException("Dinh muc phai lon hon 0");
		this.dt = dt;
		this.dinhMuc = dinhMuc;
	}

	@Override
	public String toString() {
		return "KhachHangVietNam [dt=" + dt + ", dinhMuc=" + dinhMuc + ", getMaKhachHang()=" + getMaKhachHang()
				+ ", getHoTen()=" + getHoTen() + ", getHoaDon()=" + getHoaDon() + ", getSoLuong()=" + getSoLuong()
				+ ", getDonGia()=" + getDonGia() + "Thanh tien: " + noo.format(thanhTien())+ "]";
	}

	@Override
	public double thanhTien() {
		if(super.getSoLuong()<= this.dinhMuc) return super.getSoLuong()*super.getDonGia();
		return super.getDonGia()*this.dinhMuc + (super.getSoLuong()-this.dinhMuc)*super.getDonGia()*2.5;
	}

	public DoiTuongKhachHang getDt() {
		return dt;
	}

	public void setDt(DoiTuongKhachHang dt) {
		this.dt = dt;
	}

	public int getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(int dinhMuc) {
		if(dinhMuc<0) throw new IllegalArgumentException("Dinh muc phai lon hon 0");
		this.dinhMuc = dinhMuc;
	}
	
	
	
}
