/*
 * @ (#)  QuanLyBanVe.java   2023-06    Nov 16, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhaga.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 16, 2023
 * @time:		 9:27:34 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class QuanLyBanVe {
	private Queue<KhachHangMuaVe> hangDoiVe;
	private List<KhachHangMuaVe> dsVeDaBan;

	public QuanLyBanVe() {
		this.dsVeDaBan = new ArrayList<>();
		this.hangDoiVe = new LinkedList<>();
	}

	/*
	 * Tìm khách hàng đợi vé khi biết cmnd
	 */
	public KhachHangMuaVe timKiemKhacHangDoiVe(String cmnd) {
		return hangDoiVe.stream().filter(kh -> kh.getCmnd().equalsIgnoreCase(cmnd)).findFirst().orElse(null);
	}

	/*
	 * Thêm một khách hàng mới vào hàng đợi mua vé
	 */
	public void themKhachHangMuaVe(KhachHangMuaVe kh) {
		if (!hangDoiVe.contains(kh) && !dsVeDaBan.contains(kh))
			hangDoiVe.add(kh);
		else if (!hangDoiVe.contains(kh) && dsVeDaBan.contains(kh)) {// khách hàng đã từng mua vé
			KhachHangMuaVe temp = dsVeDaBan.get(dsVeDaBan.indexOf(kh));
			kh.setHoten(temp.getHoten());
			hangDoiVe.add(temp);
		} else {// Khách hàng đổi ý
			KhachHangMuaVe temp = timKiemKhacHangDoiVe(kh.getCmnd());
			temp.setGaden(kh.getGaden());
			temp.setGiatien(kh.getGiatien());
		}
	}

	/*
	 * Bán một vé cho khách hàng. Bán cho người đăng kí trước
	 */
	public KhachHangMuaVe banVe() {
		KhachHangMuaVe kh = hangDoiVe.poll();
		if (kh != null)
			dsVeDaBan.add(kh);
		return kh;
	}

	/*
	 * Hiển thị danh sách khách hàng đợi mua vé
	 */
	public Queue<KhachHangMuaVe> getDSKHDoiMuaVe() {
		return hangDoiVe;
	}

	/*
	 * Hủy khách hàng ra khỏi danh sách (Khách hàng không mua vé nữa)
	 */
	public boolean huyKhachHangKhongMuaVe(String cmnd) {
		KhachHangMuaVe kh = timKiemKhacHangDoiVe(cmnd);
		if (kh != null)
			return hangDoiVe.remove(kh);
		return false;
	}

	/*
	 * Danh sách vé đã bán
	 */
	public List<KhachHangMuaVe> getDSVeDaBan() {
		return dsVeDaBan;
	}

	/*
	 * Số khách hàng nhờ nhận vé
	 */
	public int soKhachHangChoNhanVe() {
		return hangDoiVe.size();
	}

	/*
	 * Số vé đã bán
	 */
	public int soVeDaBan() {
		return dsVeDaBan.size();
	}

	/*
	 * Tổng số tiền thu về
	 */
	public double soTienThuVe() {
		return dsVeDaBan.stream().mapToDouble(KhachHangMuaVe::getGiatien).sum();
	}

	/*
	 * Tổng số khách đã mua
	 */
	public double getSoKhachDaMuaVe() {
		return dsVeDaBan.stream().map(KhachHangMuaVe::getCmnd).distinct().count();
	}

	/*
	 * Danh sách các ga có khách chờ mua vé (Không trùng)
	 */
	public Set<String> getDSGaCoKhachChoMuaVe() {
		return hangDoiVe.stream().map(kh -> kh.getGaden().toUpperCase()).collect(Collectors.toSet());
	}
	/*
	 * Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng
	 */
	public Map<String, Long> getDSGaCoKhachChoMuaVeVaSoVeTuongUng(){
		return hangDoiVe.stream().collect(Collectors.groupingBy(kh -> kh.getGaden().toUpperCase(),Collectors.counting()));
	}
}
