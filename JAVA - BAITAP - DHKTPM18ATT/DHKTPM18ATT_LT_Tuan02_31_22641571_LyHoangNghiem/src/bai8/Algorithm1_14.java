package bai8;

public class Algorithm1_14 {
	/*
	 * Thuật toán tìm ĐK dừng của thuật toán:
	 */
//	Input: Số dư ban đầu , lãi suất hàng năm  , số tiền rút hàng tháng 
//	Output: Số năm cần để tài khoản cạn kiệt hoặc tài khoản dừng lại
/*
 * Thuật toán:
 */
//	1. khởi tạo tài khoản, lãi suất , số tiền rút hàng tháng, tháng = 0, năm = 0
//		tạo biến check = tiền trong TK *(1+lãi/100) - tiền rút
//	2. Kiểm tra ĐK
//		. check > số tiền rút => tài khoản không cạn kiệt vì tiền lãi cao hơn tiền rút
// 2. Trong khi số dư > 0 tài khoản còn tiền
//      . Tính tiền lãi  = tiền tài khoản *(1+ lãi suất/100)
//   	. Tiền tài khoản  = tài khoản - tiền rút
//		. Tăng tháng lên 1 đơn vị
//		Nếu tiền tài khoản <=0 => break;
// 3. Tính số năm = tháng /12
//    Chia lấy tháng còn dư = tháng % 12
//4. In kết quả hiển thị năm và tháng cạn kiệt tiền

}
