package quanlykhachhangbangset;

import java.text.NumberFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Locale lc = new Locale("vi", "vn");
		NumberFormat noo = NumberFormat.getCurrencyInstance(lc);
		KhachHangDanhSach khds = new KhachHangDanhSach();
		khds = new KhachHangDanhSach();
		
		while(true) {
			System.out.println("1. Nhap khach hang.");
			System.out.println("2. xuat khach hang");
			System.out.println("3. In tong so luong khach hang theo loai");
			System.out.println("4. Tinh trung binh thanh tien cua khach hang nuoc ngoai.");
			System.out.println("5. xuat cac hoa don thang 9/2013");
			System.out.print("Nhap lua chon (chon 0 de thoat): ");
			int lua = sc.nextInt();
			sc.nextLine();
			if(lua == 1) {
				try {
					System.out.print("Nhap ma khach hang: ");
					String maKhachHang = sc.nextLine();
					System.out.print("Nhap ten: ");
					String hoTen = sc.nextLine();
					System.out.print("Nhap ngay");
					int ngay = sc.nextInt();
					System.out.print("Nhap thang");
					int thang = sc.nextInt();
					System.out.print("Nhap nam");
					int nam = sc.nextInt();
					LocalDate hoaDon = null;
					hoaDon = hoaDon.of(nam, thang, ngay);
					System.out.print("Nhap so luong: ");
					int soLuong = sc.nextInt();
					System.out.println("Nhap don gia: ");
					double donGia = sc.nextDouble();
					System.out.println("1. Khach hang viet nam");
					System.out.println("2. khach hang nuoc ngoai");
					System.out.print("Nhap lua chon: ");
					int k = sc.nextInt();
					sc.nextLine();
					if(k==1) {
						DoiTuongKhachHang dt =null;
						dt = dt.sinh_hoạt;
						System.out.println("Nhap dinh muc: ");
						int dinhMuc = sc.nextInt();
						KhachHangVietNam e = new KhachHangVietNam(maKhachHang, hoTen, hoaDon, soLuong, donGia, dt, dinhMuc);
						khds.themKhachHang(e);
					}
					else if(k==2) {
						System.out.print("Nhap quoc gia: ");
						String quocGia = sc.nextLine();
						
						KhachHangNuocNgoai s = new KhachHangNuocNgoai(maKhachHang, hoTen, hoaDon, soLuong, donGia, quocGia);
						khds.themKhachHang(s);
					}
					else {
						System.out.println("Khong hop le!!!");
					}
				}catch (IllegalArgumentException e) {
					System.out.println("loi nhap xuat");
				}catch(DateTimeException e) {
					System.out.println("Loi nhap xuat");
				}
			}
			else if(lua == 2) {
				khds.getKh().forEach(x -> System.out.println(x));
			}
			else if(lua == 3) {
				System.out.println("Khach hang viet nam: " + khds.tongSoLuongChoKhachHangViet());
				System.out.println("Khach hang nuoc ngoai: " + khds.tongSoLuongChoKhachHangNgoai());
			}
			else if(lua == 4) {
				System.out.println("Trung binh thanh tien: " + noo.format(khds.trungBinhThanhTienuaKhachHangNuocNgoai()));
			}
			else if(lua == 5) {
				khds.getKh().forEach(x -> System.out.println(x));
			}
			else if(lua == 0) {
				break;
			}
			else {
				System.out.println("Nhap kh hop le!!!");
			}
		}
	}
}
