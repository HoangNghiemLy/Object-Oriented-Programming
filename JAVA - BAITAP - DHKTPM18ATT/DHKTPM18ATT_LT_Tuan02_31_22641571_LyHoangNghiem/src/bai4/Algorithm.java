package bai4;

public class Algorithm {
	/*
	 * Thuật toán tính tiền điện
	 */
	//Input: Số điện tiêu thụ (kWh)
	//Output: Tiền điện phải trả dựa trên hệ số giá và mức tiêu thụ 
	/*
	 * Thuật toán
	 */
	// 1. Nhập chỉ số cũ (kWh), nhập chỉ số mới(kWh)
	// 2. Tính lượng điện tiêu thụ = chỉ số mới - chỉ số cũ
	// 		.Nếu 0<= lượng điện tiêu thụ <= 50 thì số tiền điện theo bậc 1 = lượng điện tiêu thụ * 1.678
	//		.Nếu 51<= lượng điện tiêu thụ <= 100 thì số tiền điện theo bậc 2 = tiền điện bậc 1 + lượng điện tiêu thụ -50 * 1.734
	//		.Nếu 101<= lượng điện tiêu thụ <= 200 thì số tiền điện theo bậc 3 = tiền điện bậc 1+ tiền điệc bậc 2+ lượng điện tiêu thụ -100 * 2.014
	//		.Nếu 201<= lượng điện tiêu thụ <= 300 thì số tiền điện bậc 4 = tiền điện bậc 1+ tiền điện bậc 2 + tiền điện bậc 3-lượng điện tiêu thụ-200 * 2.536
	// 		.Nếu 301<= lượng điện tiêu thụ <= 400 thì số tiền điện bậc 5 = tiền điện bậc 1+ tiền điện bậc 2+ tiền điện bậc 3+ tiền điện bậc 4+lượng điện tiêu thụ -300 * 2.834
	// 		.Nếu lượng điện tiêu thụ > 401 thì số tiền điện bậc 6 = tổng 5 tiền điện ở trên + lượng điện tiêu thụ -400* 2.927
	// 3. In ra số tiền điện
}
