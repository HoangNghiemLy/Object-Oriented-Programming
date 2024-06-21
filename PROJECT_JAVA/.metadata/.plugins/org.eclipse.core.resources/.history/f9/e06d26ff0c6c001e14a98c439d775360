package chuong3;

import java.util.Arrays;

public class DanhSachHangHoa {
	private HangHoa[] dshh;
	private int n = 0;

	/**
	 * Khởi tạo danh sách HangHoa
	 */
	public DanhSachHangHoa() {
		this(10);
	}

	public DanhSachHangHoa(int soPhanTu) {
		if(soPhanTu <= 0)
			throw new IllegalArgumentException("Số phần tử > 0");
		
		dshh = new HangHoa[soPhanTu];
	}

	/**
	 * Thêm một hàng hóa bất kỳ vào ds
	 * 
	 * @param tp
	 *            hàng cần thêm
	 */
	public void them(HangHoa hh) {
		HangHoa temp = timHanghoa(hh.getMaHang());
		if(temp != null)
			throw new IllegalArgumentException("Trùng mã hàng");
		
		if(dshh.length == n) {
//			throw new IllegalArgumentException("Mảng đầy");
			int newLength = dshh.length * 2;
			dshh = Arrays.copyOf(dshh, newLength);
		}
		
		dshh [n++] = hh;
	}

	/**
	 * Lấy toàn bộ ds
	 */
	public HangHoa[] getDshh() {
		return Arrays.copyOf(dshh, n);
	}

	/**
	 * Tìm kiếm hàng hóa khi biết mã hàng
	 * 
	 * @param maHang
	 *            là mã hàng cần tìm
	 * @return null nếu maHang không tồn tại, ngược lại
	 * @return hàng hóa tìm được
	 */
	public HangHoa timHanghoa(String maHang) {
//		for (HangHoa h : dshh) {
//			if (h.getMaHang().equalsIgnoreCase(maHang))
//				return h;
//		}
//		return null;
		
		return Arrays.stream(dshh, 0, n)
		.filter(hh -> hh.getMaHang().equalsIgnoreCase(maHang))
		.findFirst()
		.orElse(null);
	}

	/**
	 * Xóa hàng khi biết mã hàng
	 * 
	 * @param maHang
	 *            là mã hàng mà cần xóa
	 * @return true nếu xóa thành công, ngược lại
	 * @return false
	 */
	public boolean xoaHangHoa(String maHang) {
		HangHoa hh = timHanghoa(maHang);
		if(hh != null) {
			
			HangHoa[] temp = Arrays.stream(dshh, 0, n)
			.filter(x -> !x.getMaHang().equalsIgnoreCase(maHang))
			.toArray(x -> new HangHoa[x]);
			
			n --;
			
			dshh = Arrays.copyOf(temp, temp.length + 1);
		}
		return false;
	}

	/**
	 * Sắp xếp hàng hóa theo tên hàng tăng dần
	 */
	public void sapXepTheoTenHang() {
		
	}

	/**
	 * Sắp xếp hàng hóa theo số lượng tồn giảm dần
	 */
	public void sapXepTheoSLTon() {
	}

	/**
	 * Tìm các hàng thực phẩm khó bán
	 */
	public HangHoa[] getDSHangTPKhoBan() {
		return null;
	}

	/**
	 * Xuất các hàng sành sứ bán chậm
	 */
	public HangHoa[]  getDSHangSanhSuBanCham() {
		return null;
	}

	/**
	 * Sửa đơn giá của một mặt hàng
	 * 
	 * @param maHang
	 *            mã hàng cần sửa
	 * @param donGia_new
	 *            đơn giá mới
	 * @return true nếu sửa được
	 */
	public boolean capNhatDonGia(String maHang, double donGia_new) {
		
		return false;
	}
}
