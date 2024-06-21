package chuong3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class HangHoaDriver {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DanhSachHangHoa ds = new DanhSachHangHoa();
		try {
			ds.them(new HangDienMay("00001", "Tu lanh 123 lit", 5000000, 10, 12,
					2000));
			ds.them(new HangDienMay("00002", "Bep dien tu Sunhouse", 600000, 10,
					12, 2100));
			ds.them(new HangDienMay("00003", "Bep hong ngoai", 550000, 15, 24,
					2000));
			ds.them(new HangSanhSu("00004", "Chen bong dao", 15000, 100,
					"Minh Long 1", LocalDate.of(2018, 10, 5)));
			ds.them(new HangSanhSu("00005", "To bong dao", 18000, 0,
					"Minh Long 1", LocalDate.of(2018, 01, 24)));
			ds.them(new HangThucPham("00006", "Gao nang thom", 17000, 1000,
					"Safico", LocalDate.of(2018, 01, 01), LocalDate.of(2019,
							03, 01)));
			int chon;
			boolean flag = true;
			do {
				System.out.println("===Chuc nang=== " + "\n1. Them hang hoa"
						+ "\n2. Xuat toan bo danh sach hang hoa"
						+ "\n3. Xuat danh sach tung loai hang hoa"
						+ "\n4. Tim kiem khi biet ma hang hoa"
						+ "\n5. Sap xep tang dan theo ten hang"
						+ "\n6. Sap xep giam dan theo so luong ton"
						+ "\n7. Xuat cac hang thuc pham kho ban"
						+ "\n8. Xuat cac hang sanh su ban cham"
						+ "\n9. Xoa hang hoa" + "\n10. Sua don gia"
						+ "\n Cac truong hop khac thoat chuong trinh"
						+ "\n===Moi ban chon===");
				chon = sc.nextInt();
				switch (chon) {
				case 1:
					sc.nextLine();
					System.out.println("Nhap ma hang: ");
					String maHang = sc.nextLine();

					// Kiểm tra trùng mã
					if (ds.timHanghoa(maHang) != null)
						System.out.println("Mã hàng này đã tồn tại. Vui lòng chọn nhập lại.");
					else {
						HangHoa hh = nhapHangHoa(maHang);
						ds.them(hh);
					}
					break;
				case 2:
					Arrays.stream(ds.getDshh()).forEach(hh -> System.out.println(hh));
					break;
				case 3:
					break;
				case 4:
					sc.nextLine();
					System.out.println("Nhập mã hàng cần tìm: ");
					maHang = sc.nextLine();
					HangHoa h = ds.timHanghoa(maHang);
					if (h != null)
						System.out.println(h);
					else
						System.out.println("Không tìm thấy mã hàng: " + maHang);
					break;
				case 5:
					ds.sapXepTheoTenHang();
					break;
				case 6:
					ds.sapXepTheoSLTon();
					break;
				case 7:
					Arrays.stream(ds.getDSHangTPKhoBan())
					.forEach(x -> System.out.println(x));
					break;
				case 8:
					break;
				case 9:
					sc.nextLine();
					System.out.println("Nhập mã hàng cần xóa: ");
					String mh = sc.nextLine();
					if (ds.xoaHangHoa(mh))
						System.out.println("Đã xóa xong");
					else
						System.out.println("Không xóa được");
					break;
				case 10:
					System.out.println("Nhập mã hàng cần sửa: ");
					mh = sc.nextLine();
					System.out.println("Nhập đơn giá mới: ");
					double dg = sc.nextDouble();
					if (ds.capNhatDonGia(mh, dg))
						System.out.println("Đã sửa xong");
					else
						System.out.println("Không sửa được");
					break;
				default: // Thoát vòng lặp do while
					flag = false;
					break;
				}
			} while (flag);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static HangHoa nhapHangHoa(String maHang) {
		int loaiHang;
		HangHoa hh = null;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			System.out.println("Nhập tên hàng: ");
			String tenHang = sc.nextLine();
			System.out.println("Nhập đơn giá: ");
			double donGia = sc.nextDouble();
			System.out.println("Nhập số lượng tồn: ");
			int soLuongTon = sc.nextInt();
			do {
				System.out.println("Chọn loại hàng:" + "\n1. Hàng thực phẩm "
						+ "\n2. Hàng điện máy" + "\n3. Hàng sành sứ");
				loaiHang = sc.nextInt();
				switch (loaiHang) {
				case 1:
					System.out.println("Nhập ngày sản xuất(dd/MM/yyyy): ");
					String s1 = sc.nextLine();
					LocalDate ngsx = LocalDate.parse(s1, dtf);

					System.out.println("Nhập ngày hết hạn(dd/MM/yyyy): ");
					String s2 = sc.nextLine();
					LocalDate nghh = LocalDate.parse(s2, dtf);

					System.out.println("Nhập tên nhà cung cấp: ");
					String nhacc = sc.nextLine();

					hh = new HangThucPham(maHang, tenHang, donGia, soLuongTon,
							nhacc, ngsx, nghh);
					break;
				case 2:
					System.out.println("Nhập thời gian bảo hành: ");
					int thoiGianBH = sc.nextInt();
					System.out.println("Nhập số công suất: ");
					int congSuat = sc.nextInt();
					hh = new HangDienMay(maHang, tenHang, donGia, soLuongTon,
							thoiGianBH, congSuat);
					break;
				case 3:
					System.out.println("Nhập nhà sản xuất: ");
					String nhaSanXuat = sc.nextLine();
					System.out.println("Nhập ngày nhập kho (dd/MM/yyyy): ");
					String s = sc.nextLine();
					dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate ngnk = LocalDate.parse(s, dtf);
					hh = new HangSanhSu(maHang, tenHang, donGia, soLuongTon,
							nhaSanXuat, ngnk);
					break;
				}
			} while (!(loaiHang >= 1 && loaiHang <= 3));
		} catch (Exception ex) {
			System.out.println("Bạn nhập không tương thích với định dạng.");
			System.out.println("Mời nhập lại!");
		}
		return hh;
	}
}
