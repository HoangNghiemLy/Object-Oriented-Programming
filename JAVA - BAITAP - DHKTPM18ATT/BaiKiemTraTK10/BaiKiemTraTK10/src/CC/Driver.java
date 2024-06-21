package CC;

public class Driver {
	public static void main(String[] args) {
		DanhSachNhanVien mm = new DanhSachNhanVien();
		
		mm.themNhanVien(new NhanVienVanPhong("dfbed", "1", "345345", 1800000.0, 1.99));
		mm.themNhanVien(new NhanVienVanPhong("dfbed", "2", "345345", 1800000.0, 1.99));
		mm.themNhanVien(new NhanVienVanPhong("dfbed", "3", "345345", 1800000.0, 1.99));
		mm.themNhanVien(new NhanVienVanPhong("dfbed", "4", "345345", 5800000.0, 1.99));
		mm.themNhanVien(new NhanVienVanPhong("dfbed", "5", "345345", 7800000.0, 1.99));
		mm.themNhanVien(new NhanVienVanPhong("dfbed", "6", "345345", 800000.0, 1.99));
		mm.themNhanVien(new NhanVienVanPhong("dfbed", "7", "345345", 8800000.0, 1.99));
		mm.themNhanVien(new NhanVienBanHang("dfbed", "8", "345345", 2000000.0, 10000000));
		mm.themNhanVien(new NhanVienBanHang("dfbed", "9", "345345", 5000000.0, 10000000));
		mm.themNhanVien(new NhanVienBanHang("dfbed", "10", "345345", 1800000.0, 70000000));
		mm.themNhanVien(new NhanVienBanHang("dfbed", "11", "345345", 1800000.0, 10000000));
		mm.themNhanVien(new NhanVienBanHang("dfbed", "12", "345345", 1800000.0, 70000000));
		
		
		mm.thongKeLuongTrungBinh().entrySet().stream().forEach(System.out::println);
		System.out.println();
		mm.getDSNhanVienUuTu().stream().forEach(System.out::println);
		System.out.println();
		mm.layDSNhanVienBanHangKhongThuNhapThem().stream().forEach(System.out::println);
		System.out.println();
		
	}
}
