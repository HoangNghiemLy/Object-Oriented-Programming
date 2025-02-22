package chuong3;

import java.text.DecimalFormat;

public abstract class HangHoa {
	protected final String maHang; 
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon){
		if (maHang != null && !maHang.isBlank()&& maHang.matches("[0-9]{5}"))// luon gom 5 ky so
//			if (maHang != null && !maHang.isBlank()&& maHang.matches("[a-zA-Z]{1,}")) // luon gom it nhat 1 chu cai ( khong chua so hoac ky tu dac biet)

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
		if (tenHang!= null && !tenHang.isBlank())
			this.tenHang = tenHang;
		else
			throw new IllegalArgumentException("Ten hang khong rong");  // Default value
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
