package quanlykhachhang;

import java.time.LocalDate;

public abstract class KhachHang {
	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", hoaDon=" + hoaDon + ", soLuong="
				+ soLuong + ", donGia=" + donGia + "]";
	}


	private String maKhachHang;
	private String hoTen;
	private LocalDate hoaDon;
	private int soLuong;
	private double donGia;
	
	public KhachHang() {
		this("","",null,0,0.0);
	}
	
	public KhachHang(String maKhachHang, String hoTen, LocalDate hoaDon, int soLuong, double donGia) {
		if(maKhachHang==null || maKhachHang.isBlank()==true) throw new IllegalArgumentException("Ma khach hang kh dc bo trong");
		if(hoTen==null || hoTen.isBlank()==true) throw new IllegalArgumentException("Teen kh dc null");
		if(soLuong < 0) throw new IllegalArgumentException("Dien tieu thu phai lon hon 0");
		if(donGia <= 0) throw new IllegalArgumentException("Don gia lon hon 0");
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		if(maKhachHang==null || maKhachHang.isBlank()==true) throw new IllegalArgumentException("Ma khach hang kh dc bo trong");
		this.maKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if(hoTen==null || hoTen.isBlank()==true) throw new IllegalArgumentException("Teen kh dc null");

		this.hoTen = hoTen;
	}

	public LocalDate getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(LocalDate hoaDon) {
		this.hoaDon = hoaDon;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if(soLuong < 0) throw new IllegalArgumentException("Dien tieu thu phai lon hon 0");

		this.soLuong = soLuong;
	}

	public double getDonGia() {
		if(donGia <= 0) throw new IllegalArgumentException("Don gia lon hon 0");
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	
	public abstract double thanhTien();
	
	
}
