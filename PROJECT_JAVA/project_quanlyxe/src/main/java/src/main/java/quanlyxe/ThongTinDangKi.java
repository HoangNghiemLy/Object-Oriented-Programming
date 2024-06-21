package quanlyxe;

public class ThongTinDangKi {
	private String tenChuXe;
	private String loaiXe;
	private float dungTich;
	private double triGia;
	public ThongTinDangKi() {
		this("","",0.0f,0);
	}
	public ThongTinDangKi(String tenChuXe, String loaiXe, float dungTich, double triGia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}
	/**
	 * @return the tenChuXe
	 */
	public String getTenChuXe() {
		return tenChuXe;
	}
	/**
	 * @param tenChuXe the tenChuXe to set
	 */
	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}
	/**
	 * @return the loaiXe
	 */
	public String getLoaiXe() {
		return loaiXe;
	}
	/**
	 * @param loaiXe the loaiXe to set
	 */
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	/**
	 * @return the dungTich
	 */
	public float getDungTich() {
		return dungTich;
	}
	/**
	 * @param dungTich the dungTich to set
	 */
	public void setDungTich(float dungTich) {
		this.dungTich = dungTich;
	}
	/**
	 * @return the triGia
	 */
	public double getTriGia() {
		return triGia;
	}
	/**
	 * @param triGia the triGia to set
	 */
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public double thuePhaiNop() {
		if(this.dungTich<100)
			return triGia * (double)(1/100);
		else if(this.dungTich>= 100 && this.dungTich<=200)
			return triGia * (double)(3/100);
		return triGia * (double)(5/100);
	}
	@Override
	public String toString() {
		return String.format("%-20s%-15s%10.2f%20.2f%10.2f",tenChuXe,loaiXe,dungTich,triGia,thuePhaiNop());
	}
	
	

}
