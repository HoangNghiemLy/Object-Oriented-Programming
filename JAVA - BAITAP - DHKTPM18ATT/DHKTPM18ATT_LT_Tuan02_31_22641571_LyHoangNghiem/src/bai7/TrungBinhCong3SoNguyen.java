package bai7;

import java.util.Scanner;

public class TrungBinhCong3SoNguyen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		System.out.println("Nhập b: ");
		int b = sc.nextInt();
		System.out.println("Nhập c: ");
		int c = sc.nextInt();
		System.out.println("Trung bình cộng 3 số " + a + ", " + b + " và " + c + " là: " + (float) (a + b + c) / 3);
		sc.close();
	}
}
