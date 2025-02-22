package project_quanlysinhvien.demo;

import java.time.LocalDate;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		DanhSachSinhVien sv = new DanhSachSinhVien();
		SinhVien[] f = {
				new SinhVien("01", "ABC", LocalDate.of(2004, 6, 2), 5.5, GioiTinh.Nam, HeDaoTao.Chinh_Quy, "DHKTPM18ATT"),
				new SinhVien("02", "ABC", LocalDate.of(2004, 6, 2), 5, GioiTinh.Nam, HeDaoTao.Chinh_Quy, "DHHTTT18ATT"),
				new SinhVien("03", "ABC", LocalDate.of(2004, 6, 2), 6.5, GioiTinh.Nam, HeDaoTao.Chinh_Quy, "DHKHMT18ATT"),
				new SinhVien("04", "ABC", LocalDate.of(2004, 6, 2), 10, GioiTinh.Nam, HeDaoTao.Chinh_Quy, "DHKHDL18A"),
				new SinhVien("05", "ABC", LocalDate.of(2004, 6, 2), 9.5, GioiTinh.Nam, HeDaoTao.Chinh_Quy, "DHKTPM18ATT"),
		};
		sv.addAll(f);
		Arrays.stream(sv.getDSSV()).forEach(System.out::println);
	}

}
