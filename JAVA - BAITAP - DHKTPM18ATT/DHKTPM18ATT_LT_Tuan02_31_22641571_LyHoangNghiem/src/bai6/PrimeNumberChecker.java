package bai6;

import java.util.Scanner;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("\nNhập một số nguyên (nhập số âm để kết thúc): ");
			int number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Chương trình đã kết thúc.");
				break;
			}
			if (isPrime(number)) {
				System.out.println(number + " là số nguyên tố.");
			} else {
				System.out.println(number + " không là số nguyên tố.");
			}
		}

		scanner.close();
	}

	// Phương thức kiểm tra xem một số có phải là số nguyên tố hay không
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
