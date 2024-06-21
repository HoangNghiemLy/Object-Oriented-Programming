package CC;

public class NhanVienVanPhong extends NhanVien{
	private double heSoLuong;

	public NhanVienVanPhong(String hoVaTen, String maSo, String soDienThoai, double luongCanBan, double heSoLuong) {
		super(hoVaTen, maSo, soDienThoai, luongCanBan);
		if(heSoLuong < 1.86 || heSoLuong > 8.69) throw new IllegalArgumentException("He so luong khong hop le!!!");
		this.heSoLuong = heSoLuong;
	}
	
	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		if(heSoLuong < 1.86 || heSoLuong > 8.69) throw new IllegalArgumentException("He so luong khong hop le!!!");
		this.heSoLuong = heSoLuong;
	}

	@Override
	public double thuNhap() {
		if(this.getLuongCanBan()==1800000) return super.getLuongCanBan()*this.heSoLuong;
		return super.getLuongCanBan();
	}

	@Override
	public String toString() {
		return "NhanVienVanPhong [heSoLuong=" + heSoLuong + ", thuNhap()=" + thuNhap() + ", getHoVaTen()="
				+ getHoVaTen() + ", getMaSo()=" + getMaSo() + ", getSoDienThoai()=" + getSoDienThoai()
				+ ", getLuongCanBan()=" + getLuongCanBan() + "]";
	}
	
	
	
	
}
