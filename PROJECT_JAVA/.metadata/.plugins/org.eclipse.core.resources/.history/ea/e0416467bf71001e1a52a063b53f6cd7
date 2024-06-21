package project_quanlysinhvien.demo;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachSinhVien {
	private SinhVien[] dssv;
	private int n = 0;

	public DanhSachSinhVien() {
		this(100);
	}

	public DanhSachSinhVien(int sophantu) {
		if (sophantu <= 0)
			throw new IllegalArgumentException("So phan tu phai lon hon 0");
		this.dssv = new SinhVien[sophantu];
		this.n = 0;
	}

	/*
	 * Tim kiem theo mssv
	 */
	public SinhVien TimKiemTheoMSSV(String mssv) {
		return Arrays.stream(dssv, 0, n).filter(x -> x.getMssv().equalsIgnoreCase(mssv)).findFirst().orElse(null);
	}

	/*
	 * Them sinh vien vao danh sach. Neu trung ma thi bao loi Mang day thi tang kich
	 * thuoc mang len 1,5
	 */
	public void ThemMotSinhVien(SinhVien sv) {
		if (TimKiemTheoMSSV(sv.getMssv()) != null)
			throw new IllegalArgumentException("Trung ma sinh vien");
		if (dssv.length == n) {
			int newLength = (int) Math.ceil(n * 1.5);
			dssv = Arrays.copyOf(dssv, newLength);
		}
		this.dssv[this.n] = sv;
		this.n++;
	}

	/*
	 * Tra ve danh sach sinh vien
	 */
	public SinhVien[] getDSSV() {
		return Arrays.copyOf(dssv, n);
	}

	/*
	 * Tinh so luong sinh vien co trong ds
	 */
	public int getN() {
		return n;
	}

	/*
	 * Xoa sinh vien khi biet ma so
	 */
	public void XoaSinhVienKhiBietMa(String mssv) {
		if (TimKiemTheoMSSV(mssv) == null)
			return;
		this.dssv = Arrays.stream(dssv, 0, n).filter(x -> x.getMssv().equalsIgnoreCase(mssv)).toArray(SinhVien[]::new);
		this.n--;
	}

	/*
	 * Phuong thuc sap xep giam dan theo DTB
	 */
	public void SapXepGiamDanTheoDiemTB() {
		Arrays.sort(dssv, 0, n, Comparator.comparing(SinhVien::getDiemtb).reversed());
	}

	/*
	 * Phuong thuc addAll
	 */
	public void addAll(SinhVien[] sv) {
		for (SinhVien sinhVien : sv) {
			ThemMotSinhVien(sinhVien);
		}
	}

	/*
	 * Phuong thuc tra ve index khi biet mssv
	 */
	public int indexSV(String mssv) {
		for (int i = 0; i < n; i++) {
			if (dssv[i].getMssv().equalsIgnoreCase(mssv)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * Cap nhat sinh vien khi biet ma so
	 */
	public void CapNhatSinhVien(SinhVien sv) {
		int index = indexSV(sv.getMssv());
		if (index == -1)
			throw new IllegalArgumentException("Khong tim thay sinh vien de cap nhat");
		dssv[index] = sv;
	}

	/*
	 * Phuong thuc tra ve sinh vien khi nhap ten lop
	 */
	public SinhVien[] getDSSVTheoLop(String tenLopCanTim) {
		SinhVien[] dsKQ = new SinhVien[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			String tenLopSinhVien = dssv[i].getTenLop().toLowerCase();
			if (tenLopSinhVien.contains(tenLopCanTim.toLowerCase())) {
				dsKQ[count] = dssv[i];
				count++;
			}
		}
		Arrays.sort(dsKQ, 0, count, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
		return Arrays.copyOf(dsKQ, count);
	}

	/*
	 * Trich danh sach sinh vien co diem trung binh cao nhat
	 */
	public SinhVien[] getSVDiemTBCaoNhat() {
		double maxDiem = -1;
		for (int i = 0; i < n; i++) {
			if (dssv[i].getDiemtb() > maxDiem) {
				maxDiem = dssv[i].getDiemtb();
			}
		}
		SinhVien[] dsKQ = new SinhVien[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (dssv[i].getDiemtb() == maxDiem) {
				dsKQ[count] = dssv[i];
				count++;
			}
		}
		return Arrays.copyOf(dsKQ, count);
	}

	/*
	 * Cap nhat ten lop moi cho sinh vien
	 */
	public int CapNhatTenLopMoi(String tenLopCu, String tenLopMoi) {
		int soSinhVienDaCapNhat = 0;
		for (int i = 0; i < n; i++) {
			if (dssv[i].getTenLop().equalsIgnoreCase(tenLopCu)) {
				dssv[i].setTenLop(tenLopMoi);
				soSinhVienDaCapNhat++;
			}
		}
		return soSinhVienDaCapNhat;
	}
}
