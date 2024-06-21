package quanlikhachhang;

public class SilverCustomer {
	
	private String id; // mã số khách hàng
	private double point; // điểm thưởng
	private double coefficientsPoint; // hệ số điểm thưởng 
	
	public SilverCustomer() {
		
	}
	public SilverCustomer(String id, double point, double coeficientsPoint) {
		this.id = id;
		this.point = point;
		this.coefficientsPoint = coeficientsPoint;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public double getCoefficientsPoint() {
		return coefficientsPoint;
	}
	public void setCoefficientsPoint(double coefficientsPoint) {
		this.coefficientsPoint = coefficientsPoint;
	}
	
	public double calculatePoint() {
		return this.point + this.point * this.coefficientsPoint;
	}
	@Override
	public String toString() {
		return String.format("SilverCustomer [id=%s, point=%f, coefficientPoints=%f",
				this.id,this.point,this.coefficientsPoint);
	}
	
	
	

}
