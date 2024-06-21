package bai8;

public class Algorithm1_13 {
	/*
	 * Thuật toán tính số năm cần để tài khoản ngân hàng bị cạn kiệt dựa trên các điều kiện đã cho:
	 */
//	Input: Số dư ban đầu 10000, lãi suất hàng năm 6% , số tiền rút hàng tháng 500
//	Output: Số năm cần để tài khoản cạn kiệt
/*
 * Thuật toán:
 */
//	1. khởi tạo tài khoản, lãi suất , số tiền rút hàng tháng, tháng=0
// 2. Trong khi số dư > 0 
//      . Tính tiền lãi cho tháng hiện tại = tài khoản * lãi suất
//    	.Cộng tiền lãi vào số dư  = tài khoản + tài khoản * lãi suất
//   	.Rút 500 đô = tài khoản -500
//		. Tăng tháng lên 1 đơn vị
// 3. Tính số năm = tháng /12
//    Chia lấy tháng còn dư = tháng % 12
//4. In kết quả hiển thị năm và tháng cạn kiệt tiền
}
