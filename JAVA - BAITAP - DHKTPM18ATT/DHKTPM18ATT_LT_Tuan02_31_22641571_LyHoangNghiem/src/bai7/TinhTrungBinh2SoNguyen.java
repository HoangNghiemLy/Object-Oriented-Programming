package bai7;

import java.util.Scanner;

public class TinhTrungBinh2SoNguyen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		System.out.println("Nhập b: ");
		int b = sc.nextInt();
		System.out.println("Trung bình cộng của "+a+" và "+b+" là: "+(float)(a+b)/2);
		sc.close();
	}

}
