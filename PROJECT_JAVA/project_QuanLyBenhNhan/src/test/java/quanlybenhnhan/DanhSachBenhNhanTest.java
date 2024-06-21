package quanlybenhnhan;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DanhSachBenhNhanTest {

	private DanhSachBenhNhan bn = new DanhSachBenhNhan();
	
	@BeforeEach
	void setUp() {
		bn = new DanhSachBenhNhan(10);
		BenhNhan[] f = {
				new BenhNhan("01", "Ly", "Nghiem", LocalDate.of(2023, 10, 18), "0585379771", GioiTinh.Nam),
				new BenhNhan("02", "Ly", "Nhi", LocalDate.of(1900, 06, 2), "0585379771", GioiTinh.Nam),
				new BenhNhan("03", "Nguyen", "A", LocalDate.of(2008, 06, 2), "0585379771", GioiTinh.Nam),
				new BenhNhan("04", "LE", "B", LocalDate.of(2023, 06, 2), "0585379771", GioiTinh.Nam),
				new BenhNhan("05", "Luu", "C", LocalDate.of(1940, 06, 2), "0585379771", GioiTinh.Nam),
				new BenhNhan("07", "Ly", "Nghiem", LocalDate.of(2023, 06, 1), "0585379771", GioiTinh.Nam),
		};
		bn.addAll(f);
		
	}
	@AfterEach
	void tearDown() {
		bn = null;
		
	}
	@Test
	void ThongKeBenhNhanGia() {
		assertEquals(2, bn.TrichDanhSachBenhNhanCaoTuoi());
	}

}
