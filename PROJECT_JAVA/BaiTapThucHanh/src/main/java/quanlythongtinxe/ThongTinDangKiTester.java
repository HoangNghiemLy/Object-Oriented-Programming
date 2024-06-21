package quanlythongtinxe;

import java.util.Scanner;

public class ThongTinDangKiTester {
	public static void main(String[] args) {
		ThongTinDangKi xe1 = new ThongTinDangKi();
		ThongTinDangKi xe2 = new ThongTinDangKi();
		ThongTinDangKi xe3 = new ThongTinDangKi();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("------Menu------");
			System.out.println("1. Nhap thong tin xe");
			System.out.println("2. Xuat thong tin xe");
			System.out.println("3. Thoat");
			System.out.println("Nhập lựa chọn: ");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1) {
				System.out.println("Nhap thong tin xe 1 ");
				System.out.println("Nhap ten chu xe: ");
				String tenChuXe = sc.nextLine();
				
				System.out.println("Nhap loai xe: ");
				String loaiXe = sc.nextLine();
				System.out.println("Nhap dung tich xe: ");
				float dungTich = sc.nextFloat();
				System.out.println("Nhap tri gia");
				double triGia = sc.nextDouble();
				xe1 = new ThongTinDangKi(tenChuXe, loaiXe, dungTich, triGia);
				sc.nextLine();
				
				System.out.println("Nhap thong tin xe 2 ");
				System.out.println("Nhap ten chu xe: ");
				tenChuXe = sc.nextLine();
				System.out.println("Nhap loai xe: ");
				loaiXe = sc.nextLine();
				System.out.println("Nhap dung tich xe: ");
				dungTich = sc.nextFloat();
				System.out.println("Nhap tri gia");
				triGia = sc.nextDouble();
				xe2 = new ThongTinDangKi(tenChuXe, loaiXe, dungTich, triGia);
				sc.nextLine();
				
				System.out.println("Nhap thong tin xe 3 ");
				System.out.println("Nhap ten chu xe: ");
				tenChuXe = sc.nextLine();
				System.out.println("Nhap loai xe: ");
				loaiXe = sc.nextLine();
				System.out.println("Nhap dung tich xe: ");
				dungTich = sc.nextFloat();
				System.out.println("Nhap tri gia");
				triGia = sc.nextDouble();
				xe3 = new ThongTinDangKi(tenChuXe, loaiXe, dungTich, triGia);
				sc.nextLine();
			}
			else if(n == 2 ) {
				System.out.println(String.format("%-25s%-20s%-20s%-20s%-20s\n","tenChuXe","loaiXe","dungTich","triGia","thuePhaiNop"));
				System.out.println(xe1.toString());
				System.out.println(xe2.toString());
				System.out.println(xe3.toString());
				break;
			}else if(n == 3) {
				System.out.println("Ket thuc chuong trinh");
				break;
			}
			else {
				System.out.println("Nhap khong hop le!");
			}
		}
	}
}
	
