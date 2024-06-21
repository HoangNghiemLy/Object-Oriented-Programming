package quanlySinhvien1;

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


	public long getMssv() {
		return mssv;
	}


	public void setMssv(long mssv) {
		this.mssv = mssv;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}


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
