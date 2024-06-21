package CC;

public abstract class NhanVien {
	
	private String hoVaTen;
	private String maSo;
	private String soDienThoai;
	private double luongCanBan;
	
	public NhanVien(String hoVaTen, String maSo, String soDienThoai, double luongCanBan) {
		this.hoVaTen = hoVaTen;
		this.maSo = maSo;
		this.soDienThoai = soDienThoai;
		this.luongCanBan = luongCanBan;
	}
	
	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public double getLuongCanBan() {
		return luongCanBan;
	}
	
	public void setLuongCanBan(double luongCanBan) {
		this.luongCanBan = luongCanBan;
	}
	
	public abstract double thuNhap();

	@Override
	public String toString() {
		return "NhanVien [hoVaTen=" + hoVaTen + ", maSo=" + maSo + ", soDienThoai=" + soDienThoai + ", luongCanBan="
				+ luongCanBan + "]";
	}
	
	
}
