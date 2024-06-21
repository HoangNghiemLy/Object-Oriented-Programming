package iuh.fit.se;

public class Sinhvien {
	private long mssv;
	private String hoTen;
	private float diemLT;
	private float diemTH;

	public Sinhvien() {
		this(0l, "", 0.0f, 0.0f);
	}

	public Sinhvien(long mssv, String hoTen, float diemLT, float diemTH) {
		super();
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	/**
	 * @return the mssv
	 */
	public long getMssv() {
		return mssv;
	}

	/**
	 * @param mssv the mssv to set
	 */
	public void setMssv(long mssv) {
		this.mssv = mssv;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the diemLT
	 */
	public float getDiemLT() {
		return diemLT;
	}

	/**
	 * @param diemLT the diemLT to set
	 */
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	/**
	 * @return the diemTH
	 */
	public float getDiemTH() {
		return diemTH;
	}

	/**
	 * @param diemTH the diemTH to set
	 */
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	public float getDiemTB() {
		return (diemLT + diemTH) / 2.0f;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-20s%10.2f%10.2f%10.2f", mssv, hoTen, diemLT, diemTH, getDiemTB());
	}
}
