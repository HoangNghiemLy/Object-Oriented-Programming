package quanlykhachhangbangset;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class KhachHangNuocNgoai extends KhachHang{
	
	private String quocTich;
	Locale lc = new Locale("vi","vn");
	NumberFormat noo = NumberFormat.getCurrencyInstance(lc);
	
	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate hoaDon, int soLuong, double donGia,String quocTich) {
		super(maKhachHang, hoTen, hoaDon, soLuong, donGia);
		if(quocTich == null || quocTich.isBlank()==true) throw new IllegalArgumentException("Quoc tich kh dc bo trong");
		this.quocTich = quocTich;
	}

	@Override
	public double thanhTien() {
		return super.getSoLuong()*super.getDonGia();
	}

	public String getQuocTich() {
		return quocTich;
	}

	@Override
	public String toString() {
		return "KhachHangNuocNgoai [quocTich=" + quocTich + ", getMaKhachHang()=" + getMaKhachHang() + ", getHoTen()="
				+ getHoTen() + ", getHoaDon()=" + getHoaDon() + ", getSoLuong()=" + getSoLuong() + ", getDonGia()="
				+ getDonGia() + "Thanh tien: " + noo.format(thanhTien())+ "]";
	}

	public void setQuocTich(String quocTich) {
		if(quocTich == null || quocTich.isBlank()==true) throw new IllegalArgumentException("Quoc tich kh dc bo trong");
		this.quocTich = quocTich;
	}
	
}
