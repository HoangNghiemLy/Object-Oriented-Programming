package CC;

public class NhanVienBanHang extends NhanVien{
	
	private double doanhThu;
	
	public NhanVienBanHang(String hoVaTen, String maSo, String soDienThoai, double luongCanBan, double doanhThu) {
		super(hoVaTen, maSo, soDienThoai, luongCanBan);
		if(doanhThu < 0) throw new IllegalArgumentException("Doanh thu nhap kh hop le !!!");
		this.doanhThu = doanhThu;
	}
	
	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		if(doanhThu < 0) throw new IllegalArgumentException("Doanh thu nhap kh hop le !!!");
		this.doanhThu = doanhThu;
	}

	@Override
	public double thuNhap() {
		if(doanhThu >= 20000000.0) return super.getLuongCanBan() + this.doanhThu*0.03;
		return super.getLuongCanBan();
	}

	@Override
	public String toString() {
		return "NhanVienBanHang [doanhThu=" + doanhThu + ", thuNhap()=" + thuNhap() + ", getHoVaTen()=" + getHoVaTen()
				+ ", getMaSo()=" + getMaSo() + ", getSoDienThoai()=" + getSoDienThoai() + ", getLuongCanBan()="
				+ getLuongCanBan() + "]";
	}

	
	
}
