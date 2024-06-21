package quanlybenhnhan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class DanhSachBenhNhan {
	private BenhNhan[] dsbn;
	private int n = 0;

	public DanhSachBenhNhan() {
		this(100);
	}

	public DanhSachBenhNhan(int sophantu) {
		if (sophantu <= 0)
			throw new IllegalArgumentException("So luong mang du kien phai lon hon 0");
		this.dsbn = new BenhNhan[sophantu];
		this.n = 0;
	}

	public BenhNhan search(String maso) {
		return Arrays.stream(dsbn, 0, n).filter(x -> x.getMaso().equalsIgnoreCase(maso)).findFirst().orElse(null);
	}
	/*
	 * Phuong thuc them mot benh nhan moi vao tap. Them thanh cong neu khong trung
	 * ma, neu mang day thi tang kich thuoc mang len gap doi
	 */

	public void ThemBenhNhan(BenhNhan bn) {
		if (search(bn.getMaso()) != null) {
			throw new IllegalArgumentException("Trung ma benh nhan");
		}
		if (this.dsbn.length == n) {
			int newLength = n * 2;
			dsbn = Arrays.copyOf(dsbn, newLength);
		}
		this.dsbn[this.n] = bn;
		this.n++;
	}

	/*
	 * Phuong thuc cap nhat so dien thoai khi biet ma so
	 */
	public void CapNhatSoDienThoai(String maso, String sodienthoaimoi) {
		BenhNhan tmp = search(maso);
		if (tmp == null) {
			throw new IllegalArgumentException("Khong tim thay ma so de cap nhat so dien thoai");
		}
		tmp.setSodienthoai(sodienthoaimoi);
	}

	/*
	 * Trich danh sach benh nhan nhi nho hon 12 thang tuoi, sap xeo theo ngay sinh
	 * giam dan
	 */
	// Phuong thuc tra ve thang sinh của em be
	private Long TraVeThangSinhCuaEmBe(LocalDate lc) {
		Long k = Math.abs(ChronoUnit.MONTHS.between(lc, LocalDate.now()));
		return k;
	}

	// Trich danh sach benh nhan nhi xep giam dan theo ngay sinh
	public BenhNhan[] TrichDanhSachBenhNhanNhi() {
		Long demSoBenhNhanNhi = Arrays.stream(dsbn, 0, n).filter(x -> TraVeThangSinhCuaEmBe(x.getNgaysinh()) <= 12)
				.count();
		BenhNhan[] tmp = Arrays.stream(dsbn, 0, n).filter(x -> TraVeThangSinhCuaEmBe(x.getNgaysinh()) <= 12)
				.toArray(BenhNhan[]::new);
		int n1 = demSoBenhNhanNhi.intValue();
		Arrays.sort(tmp, 0, n1, Comparator.comparing(BenhNhan::getNgaysinh).reversed());
		return tmp;
	}

	/*
	 * Thống kê có bao nhiêu bệnh nhân là người cao tuổi (từ 80 tuổi trở lên)
	 */
	// Phuong thuc tra ve tuoi benh nhan
	private Long TraVeTuoiBenhNhan(LocalDate lc) {
		Long k = Math.abs(ChronoUnit.YEARS.between(lc, LocalDate.now()));
		return k;
	}

	// Trich danh sach benh nhan là nguoi cao tuoi
	public Long TrichDanhSachBenhNhanCaoTuoi() {
		return Arrays.stream(dsbn, 0, n).filter(x -> TraVeTuoiBenhNhan(x.getNgaysinh()) >= 80).count();
	}

	/*
	 * Phương thức lấy danh sách bệnh nhân
	 */
	public BenhNhan[] getDSBN() {
		return Arrays.copyOf(dsbn, n);
	}

	/*
	 * Phuong thuc addAll
	 */
	public void addAll(BenhNhan[] dsbn) {
		for (BenhNhan benhNhan : dsbn) {
			ThemBenhNhan(benhNhan);
		}
	}
	/*
	 * Xoa benh nhan khi biet ma
	 */
	public void XoaBenhNhan(String maso) {
		if(search(maso)==null)
			throw new IllegalArgumentException("Khong tim thay ma benh nhan de xoa");
		this.dsbn = Arrays.stream(dsbn,0,n)
				.filter(x -> x.getMaso().equalsIgnoreCase(maso)==false)
				.toArray(BenhNhan[]::new);
	}
}
