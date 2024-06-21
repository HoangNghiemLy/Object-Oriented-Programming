package chuong3;

import java.text.DecimalFormat;

public abstract class HangHoa {
	protected final String maHang; 
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon){
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new IllegalArgumentException("Lỗi: mã hàng rỗng. Không tạo được đối tượng");
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang = "no name"; // Default value
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia > 0)
			this.donGia = donGia;
		else
			this.donGia = 0.0; // Default value
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon = 0;// Default value
	}

	@Override
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		return String.format("%10s %-20s%15s%15s", maHang, tenHang,
				fmt.format(donGia), soLuongTon);
	}

	public abstract double thueVAT();

	public abstract String danhGia();
}
