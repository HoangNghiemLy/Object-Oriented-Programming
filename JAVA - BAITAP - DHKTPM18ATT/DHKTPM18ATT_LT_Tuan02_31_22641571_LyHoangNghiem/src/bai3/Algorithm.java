package bai3;

public class Algorithm {
	/*
	 * Thuật toán giải pt bậc 2: ax^2 + bx +c = 0
	 * 
	 */
	//Xác định bài toán: 
	//Input: Hệ số a,b và c của phương trình bậc 2 ax^2 + bx + c = 0
	//Output: Nghiệm của phương trình (nếu có) hoặc thông báo rằng phương trình không có nghiệm thực
	
	/*
	 * Thuật toán
	 */
//      1.Nhập các hệ số a, b và c từ người dùng.
//	    2.Kiểm tra điều kiện hệ số a:
//			Nếu a = 0, in ra thông báo lỗi, mời nhập lại
//			Nếu a ≠ 0, tiếp tục bước 3.
//		3.Tính delta (Δ) theo công thức: Δ = b^2 - 4ac.
//		4.Kiểm tra giá trị của delta:
//			Nếu Δ > 0, có hai nghiệm phân biệt:
//				.Tính nghiệm thứ nhất x1 = (-b + √Δ) / (2a).
//				.Tính nghiệm thứ hai x2 = (-b - √Δ) / (2a).
//				.In ra nghiệm x1 và x2.
//			Nếu Δ = 0, có một nghiệm kép:
//				.Tính nghiệm x = -b / (2a).
//				.In ra nghiệm x.
//			.Nếu Δ < 0, phương trình không có nghiệm thực:
//				.In ra thông báo không có nghiệm.
//	
}
