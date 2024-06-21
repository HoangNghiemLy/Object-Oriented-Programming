package chuong3;

public class HangDienMay extends HangHoa {

	private int thoiGianBaoHanh;
	private int congSuat;

	public HangDienMay(String maHang, String tenHang, double donGia,
			int soLuongTon, int thoiGianBaoHanh, int congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		if (congSuat > 0)
			this.congSuat = congSuat;
		else
			this.congSuat = 0; // Default value
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if (thoiGianBaoHanh > 0)
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		else
			this.thoiGianBaoHanh = 0; // Default value
	}

	@Override
	public double thueVAT() {
		return 0.1 * donGia;
	}

	@Override
	public String danhGia() {
		return (soLuongTon < 3) ? "bán được" : "không đánh giá";
	}

	@Override
	public String toString() {
		String bh = thoiGianBaoHanh + " tháng";
		String cs = congSuat + "kw";
		return  super.toString() + String.format("%-16s%-20s", bh, cs);
	}

}
