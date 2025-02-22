package quanlybenhnhan;

import java.time.LocalDate;

public class BenhNhan {
	private String maso;
	private String ho;
	private String ten;
	private LocalDate ngaysinh;
	private String sodienthoai;
	private GioiTinh gioitinh;

	public BenhNhan() {
		this("", "", "", LocalDate.now(), "", null);
	}

	public BenhNhan(String maso, String ho, String ten, LocalDate ngaysinh, String sodienthoai, GioiTinh gioitinh) {
		if (maso.trim().equals("") == true || maso.isBlank())
			throw new IllegalArgumentException("Ma so benh nhan loi");
		this.maso = maso;
		this.ho = ho;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		if (sodienthoai.length() < 10 || sodienthoai == null)
			throw new IllegalArgumentException("So dien thoai phai luon 10 ky tu");
		this.sodienthoai = sodienthoai;
		this.gioitinh = gioitinh;
	}

	public String getMaso() {
		return maso;
	}

	public void setMaso(String maso) {
		if (maso.trim().equals("") == true || maso.isBlank())
			throw new IllegalArgumentException("Ma so benh nhan loi");
		this.maso = maso;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		if (sodienthoai.length() < 10 || sodienthoai == null)
			throw new IllegalArgumentException("So dien thoai phai luon 10 ky tu");
		this.sodienthoai = sodienthoai;
	}

	public GioiTinh getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(GioiTinh gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Override
	public String toString() {
		return String
				.format("BenhNhan [maSo=%s, hoBenhNhan=%s, tenbenhNhan=%s, ngaySinh=%s, soDienThoai=%s, GioiTinh=%s ",
						this.maso, this.ho, this.ten, this.ngaysinh.getDayOfMonth() + "/"
								+ this.ngaysinh.getMonthValue() + "/" + this.ngaysinh.getYear(),
						this.sodienthoai, this.gioitinh);
	}
}
