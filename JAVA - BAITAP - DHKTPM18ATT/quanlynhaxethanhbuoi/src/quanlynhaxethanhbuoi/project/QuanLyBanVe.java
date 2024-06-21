/*
 * @ (#)  QuanLyBanVe.java   2023-06    Nov 17, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhaxethanhbuoi.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 17, 2023
 * @time:		 10:21:49 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class QuanLyBanVe {
	private Queue<KhachHangMuaVe> hangdoive;
	private List<KhachHangMuaVe> dsDaBanve;
	public QuanLyBanVe() {
		this.hangdoive = new LinkedList<KhachHangMuaVe>();
		this.dsDaBanve = new ArrayList<KhachHangMuaVe>();
	}
	/*
	 * Tìm khách hàng đợi vé khi biết cmnd
	 */
	public KhachHangMuaVe timKiemKhachHang(String cmnd) {
		return hangdoive.stream().filter(kh -> kh.getCmnd().equalsIgnoreCase(cmnd))
				.findFirst()
				.orElse(null);
	}
	/*
	 * Thêm một khách hàng mới vào hàng đợi mua vé
	 */
	public void themKhachHangVaoHangDoi(KhachHangMuaVe kh) {
		if(!hangdoive.contains(kh)&&!dsDaBanve.contains(kh))
			hangdoive.add(kh);
		else if(!hangdoive.contains(kh) && dsDaBanve.contains(kh)) { // khách hàng đã từng mua vé
			KhachHangMuaVe temp = dsDaBanve.get(dsDaBanve.indexOf(kh));
			kh.setHoten(temp.getHoten());
			hangdoive.add(temp);
		}
		else {// khách hàng đổi ý
			KhachHangMuaVe temp = timKiemKhachHang(kh.getCmnd());
			temp.setGaden(kh.getGaden());
			temp.setGiatien(kh.getGiatien());
		}
			
	}
	
	/*
	 * Bán vé cho một khách hàng. Bán cho người đăng kí trước
	 */
	public KhachHangMuaVe banVe() {
		KhachHangMuaVe kh = hangdoive.poll();
		if(kh!=null)
			dsDaBanve.add(kh);
		return kh;
	}
	
	/*
	 * Hiển thị danh sách hàng đợi mua vé
	 */
	public Queue<KhachHangMuaVe> getDSHangDoiMuaVe(){
		return hangdoive;
	}
	
	/*
	 * Hủy khách hàng ra khỏi danh sách (Khách hàng không mua vé nữa)
	 */
	public boolean huyKhachHang(String cmnd) {
		KhachHangMuaVe kh = timKiemKhachHang(cmnd);
		if(kh!=null)
			return hangdoive.remove(kh);
		return false;
	}
	/*
	 * Danh sách vé đã bán
	 */
	
	/*
	 * Số khách hàng chờ nhận vé 
	 */
	
	/*
	 * Số vé đã bán
	 */
	
	/*
	 * Tổng tiền thu về
	 */
	
	/*
	 * Tổng số khách đã mua
	 */
	
	/*
	 * Danh sách ga có khách chờ mua vé (không trùng)
	 */
	
	/*
	 * Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng
	 */
	

}
