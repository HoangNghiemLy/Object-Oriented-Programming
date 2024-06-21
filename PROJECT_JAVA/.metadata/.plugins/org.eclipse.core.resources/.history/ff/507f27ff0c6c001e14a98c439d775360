package chuong3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa {

	private String nhaSanXuat;
	private LocalDate ngayNhapKho;

	public HangSanhSu(String maHang, String tenHang, double donGia,
			int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho)
			 {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		LocalDate homNay = LocalDate.now();
		if (ngayNhapKho.isBefore(homNay))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho = homNay; // Default value
	}

	@Override
	public double thueVAT() {
		return 0.1 * donGia;
	}

	@Override
	public String danhGia() {
		LocalDate homNay = LocalDate.now();
		long soNgay = ChronoUnit.DAYS.between(homNay, ngayNhapKho);
		return (soLuongTon > 50 && soNgay > 10) ? "bán chậm" : "không đánh giá";
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() +  String.format("%-16s%-20s", nhaSanXuat,
				dtf.format(ngayNhapKho));
	}
}
