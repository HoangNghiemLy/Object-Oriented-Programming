package bai2;

import java.util.Scanner;

public class GiaiPTBac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===Giải phương trình bậc nhất===");
		System.out.println("Nhập hệ số a: ");
		float a = sc.nextFloat();
		System.out.println("Nhập số tự do b: ");
		float b = sc.nextFloat();
		float x;
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			x = -b / a;
			System.out.println("Phương trình có nghiệm x= " + x);
		}
		sc.close();
	}
}
