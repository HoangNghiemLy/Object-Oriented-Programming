package bai5;

import java.util.Scanner;

public class TongNhieuPhanTu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Tính tổng từ 1 đến n");
		while (true) {
			System.out.println("\nNhập n (nhập 0 để kết thúc): ");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
		}
		System.out.println("Kết thúc chương trình");
		sc.close();
	}
}
