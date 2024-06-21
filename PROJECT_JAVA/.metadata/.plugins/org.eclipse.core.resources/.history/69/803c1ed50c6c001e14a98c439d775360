package chuong3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat, ngayHetHan;

	public HangThucPham(String maHang, String tenHang, double donGia,
			int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat,
			LocalDate ngayHetHan)  {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		LocalDate homNay = LocalDate.now();
		if (ngaySanXuat.isBefore(homNay))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = homNay; // Default value
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = ngaySanXuat;// Default value
	}

	@Override
	public double thueVAT() {
		return 0.05 * donGia;
	}

	/**
	 * 
	 * @return true nếu hàng bị hết hạn (có ngày hết hạn trước ngày hiện tại)
	 */
	private boolean hetHan() {
		if (ngayHetHan.isBefore(LocalDate.now()))
			return true;
		return false;
	}

	@Override
	public String danhGia() {
		return (soLuongTon > 0 && hetHan()) ? "Khó bán" : "Không đánh giá";
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return  super.toString() + String.format("%-16s%-20s%-20s", 
				dtf.format(ngaySanXuat), dtf.format(ngayHetHan), nhaCungCap);
	}
}
