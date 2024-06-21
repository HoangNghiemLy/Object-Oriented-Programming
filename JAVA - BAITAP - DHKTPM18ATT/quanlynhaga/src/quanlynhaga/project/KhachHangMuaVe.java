/*
 * @ (#)  KhachHangMuaVe.java   2023-06    Nov 16, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhaga.project;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 16, 2023
 * @time:		 9:23:53 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class KhachHangMuaVe {
	private String cmnd;
	private String hoten;
	private String gaden;
	private double giatien;

	public KhachHangMuaVe() {
		this("", "", "", 0.0);
	}

	public KhachHangMuaVe(String cmnd, String hoten, String gaden, double giatien) {
		super();
		this.cmnd = cmnd;
		this.hoten = hoten;
		this.gaden = gaden;
		this.giatien = giatien;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getGaden() {
		return gaden;
	}

	public void setGaden(String gaden) {
		this.gaden = gaden;
	}

	public double getGiatien() {
		return giatien;
	}

	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmnd == null) ? 0 : cmnd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		KhachHangMuaVe other = (KhachHangMuaVe) obj;
		if (cmnd == null) {
			if (other.cmnd != null)
				return false;
		} else if (!cmnd.equals(other.cmnd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KhachHangMuaVe [cmnd=" + cmnd + ", hoten=" + hoten + ", gaden=" + gaden + ", giatien=" + giatien + "]";
	}

}
