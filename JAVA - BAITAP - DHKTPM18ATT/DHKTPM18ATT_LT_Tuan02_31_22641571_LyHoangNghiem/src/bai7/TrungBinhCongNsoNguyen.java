package bai7;

import java.util.Scanner;

public class TrungBinhCongNsoNguyen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử mảng: ");
		int n = sc.nextInt();
		int[] mangSoNguyen = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
			mangSoNguyen[i] = sc.nextInt();
		}
		double result = TrungBinhCongNsoNguyen.TrungBinh(mangSoNguyen);
		System.out.println("Trung bình cộng của mảng: " + result);
		sc.close();
	}

	public static double TrungBinh(int[] arr) {
		int sum = 0;
		for (int element : arr) {
			sum += element;
		}
		return (double) sum / arr.length;
	}
}
