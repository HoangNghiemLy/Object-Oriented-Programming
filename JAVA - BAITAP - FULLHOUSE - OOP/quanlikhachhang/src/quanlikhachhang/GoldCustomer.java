package quanlikhachhang;

public class GoldCustomer extends SilverCustomer{
	
	private double bonusRate; // tỉ lệ thưởng thêm

	public GoldCustomer(double bonusRate) {
		super();
		this.bonusRate = bonusRate;
	}

	public GoldCustomer(String id, double point, double coeficientsPoint, double bonusRate) {
		super(id, point, coeficientsPoint);
		this.bonusRate = bonusRate;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
	
	// phương thức tính điểm cho khách hàng hạng vàng
	public double calculatePoint() {
		return super.calculatePoint() + super.calculatePoint() * this.bonusRate;
	}

	@Override
	public String toString() {
		return String.format("GoldCustomer [id=%s, point=%f, coefficientsPoint=%f, bonusRate=%f",
				super.getId(),super.getPoint(),super.getCoefficientsPoint(),this.bonusRate);
	}
	
	

}
