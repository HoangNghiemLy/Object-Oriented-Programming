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
			ds.them(new HangDienMay("01", "Tủ lạnh 123lít", 5000000, 10, 12,
					2000));
			ds.them(new HangDienMay("02", "Bếp điện từ Sunhouse", 600000, 10,
					12, 2100));
			ds.them(new HangDienMay("03", "Bếp hồng ngoại", 550000, 15, 24,
					2000));
			ds.them(new HangSanhSu("04", "Chén bông Đào", 15000, 100,
					"Minh Long 1", LocalDate.of(2018, 10, 5)));
			ds.them(new HangSanhSu("05", "Tô bông Đào", 18000, 0,
					"Minh Long 1", LocalDate.of(2018, 01, 24)));
			ds.them(new HangThucPham("06", "Gạo nàng thơm", 17000, 1000,
					"Safico", LocalDate.of(2018, 01, 01), LocalDate.of(2019,
							03, 01)));
			int chon;
			boolean flag = true;
			do {
				System.out.println("===Chức năng=== " + "\n1. Thêm hàng hóa"
						+ "\n2. Xuất toàn bộ danh sách hàng hóa"
						+ "\n3. Xuất danh sách từng loại hàng hóa"
						+ "\n4. Tìm kiếm khi biết mã hàng"
						+ "\n5. Sắp tăng dần theo tên hàng"
						+ "\n6. Sắp giảm dần theo số lượng tồn"
						+ "\n7. Xuất các hàng thực phẩm khó bán"
						+ "\n8. Xuất các hàng sành sứ bán chậm"
						+ "\n9. Xóa hàng hóa" + "\n10. Sửa đơn giá"
						+ "\n Các trường hợp khác thoát chương trình"
						+ "\n===Mời bạn chọn===");
				chon = sc.nextInt();
				switch (chon) {
				case 1:
					sc.nextLine();
					System.out.println("Nhập mã hàng: ");
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
