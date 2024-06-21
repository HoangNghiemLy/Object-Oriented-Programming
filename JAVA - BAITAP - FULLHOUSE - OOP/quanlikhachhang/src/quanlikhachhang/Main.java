package quanlikhachhang;

public class Main {
	public static void main(String[] args) {
		SilverCustomer c = new SilverCustomer("01", 300, 0.18);
		System.out.println(c.calculatePoint());
		c = new GoldCustomer("01", 300, 0.18, 0.28);
		System.out.println(c.calculatePoint());
	}

}
