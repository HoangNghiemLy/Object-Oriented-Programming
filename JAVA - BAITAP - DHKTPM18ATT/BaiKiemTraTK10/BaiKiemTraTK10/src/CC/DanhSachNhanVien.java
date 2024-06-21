package CC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DanhSachNhanVien {
	List<NhanVien> danhSachNhanVien;
	
	public DanhSachNhanVien() {
		danhSachNhanVien = new ArrayList<NhanVien>();
	}
	
	private NhanVien timKiemNhanVien(String maSo) {
		return danhSachNhanVien.stream().filter(x -> x.getMaSo().equals(maSo)).findFirst()
					.orElse(null);
	}
	
	public void themNhanVien(NhanVien e) {
		if(timKiemNhanVien(e.getMaSo())!=null) throw new IllegalArgumentException("Trung ma nhan vien !!");
		this.danhSachNhanVien.add(e);
	}
	
	public Map<String, Double> thongKeLuongTrungBinh() {
		Map<String, Double> tmp = this.danhSachNhanVien.stream()
						.collect(Collectors.groupingBy(x -> x.getClass().toString(), Collectors.averagingDouble(NhanVien::thuNhap)));
		return tmp;
	}
	
	public List<NhanVienBanHang> layDSNhanVienBanHangKhongThuNhapThem() {
		return this.danhSachNhanVien.stream()
								.filter(x -> x instanceof NhanVienBanHang)
								.map(p -> (NhanVienBanHang)p)
								.filter(x -> x.getDoanhThu() < 20000000.0)
								.sorted(Comparator.comparing(NhanVienBanHang::getDoanhThu).reversed())
								.collect(Collectors.toList());
	}
	
	public List<NhanVienBanHang> getDSNhanVienUuTu(){
		NhanVien tmp1 = this.danhSachNhanVien.stream().filter(x -> x instanceof NhanVienBanHang)
														.map(p -> (NhanVienBanHang)p)
														.max(Comparator.comparing(NhanVienBanHang::getDoanhThu)).get();
		return this.danhSachNhanVien.stream().filter(x -> x instanceof NhanVienBanHang)
								.map(p -> (NhanVienBanHang)p)
								.filter(x -> x.getDoanhThu() == ((NhanVienBanHang)tmp1).getDoanhThu())
								.toList();
	}
	
	public void capNhatNhanVien(String maSo, NhanVienVanPhong newInFor) {
		NhanVien tmp = timKiemNhanVien(maSo);
		if(tmp==null || tmp instanceof NhanVienBanHang) throw new IllegalArgumentException("Khong tim thay nhan vien!!!");
		tmp.setHoVaTen(newInFor.getHoVaTen());
		tmp.setLuongCanBan(newInFor.getLuongCanBan());
		tmp.setMaSo(newInFor.getMaSo());
		((NhanVienVanPhong)tmp).setHeSoLuong(newInFor.getHeSoLuong());
		tmp.setSoDienThoai(newInFor.getSoDienThoai());
	}
	
	
}
