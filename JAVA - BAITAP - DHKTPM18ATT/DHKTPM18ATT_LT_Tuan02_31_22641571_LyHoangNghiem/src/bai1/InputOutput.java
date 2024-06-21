package bai1;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã số sinh viên: ");
		String mssv = scanner.nextLine();
		
		System.out.println("Nhập họ tên: ");
		String hoten = scanner.nextLine();
		
		System.out.println("Nhập khẩu hiệu: ");
		String khauhieu = scanner.nextLine();
		
		System.out.println("Nhập điểm trung bình: ");
		float diemtb = scanner.nextFloat();
		
		System.out.println("===Kết quả===");
		System.out.printf("Mã số sinh viên: %s;\n" +
				"Họ tên: %s;\n" + 
				"Khẩu hiệu: %s;\n" +
				"Điểm trung bình: %.2f;\n",
				mssv,hoten,khauhieu,diemtb);
		scanner.close();
	}
}
