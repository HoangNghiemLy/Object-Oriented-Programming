package chuong3.test;

import java.time.LocalDate;

import chuong3.DanhSachHangHoa;
import chuong3.HangDienMay;
import chuong3.HangSanhSu;
import chuong3.HangThucPham;

public class TestNgaySanXuat {
	public static void main(String[] args) {
		DanhSachHangHoa ds = new DanhSachHangHoa();

		ds.them(new HangDienMay("01", "Tu lanh 123 lit", 5000000, 10, 12,
				2000));
		ds.them(new HangDienMay("02", "Bep dien tu Sunhouse", 600000, 10,
				12, 2100));
		ds.them(new HangDienMay("03", "Bep hong ngoai", 550000, 15, 24,
				2000));
		ds.them(new HangSanhSu("04", "Chen bong dao", 15000, 100,
				"Minh Long 1", LocalDate.of(2018, 10, 5)));
		ds.them(new HangSanhSu("05", "To bong dao", 18000, 0,
				"Minh Long 1", LocalDate.of(2018, 01, 24)));
		ds.them(new HangThucPham("06", "Gao nang thom", 17000, 1000,
				"Safico", LocalDate.of(2018, 01, 01), LocalDate.of(2019,
						03, 01)));
	}
}
