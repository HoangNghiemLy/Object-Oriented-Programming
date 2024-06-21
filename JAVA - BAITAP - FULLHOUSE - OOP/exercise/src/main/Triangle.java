package main;

public class Triangle {
	public Point A;
	public Point B;
	public Point C;
	
	public Triangle () {
		
	}
	public Triangle(Point A , Point B, Point C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	public double getAB() {
		return Math.sqrt(Math.pow(this.A.x - this.B.x,2)+Math.pow(this.A.y - this.B.y, 2));
	}
	public double getBC() {
		return Math.sqrt(Math.pow(this.B.x - this.C.x,2)+Math.pow(this.B.y - this.C.y, 2));
	}
	public double getAC() {
		return Math.sqrt(Math.pow(this.A.x - this.C.x,2)+Math.pow(this.A.y - this.C.y, 2));
	}
	public boolean isValid() {
//		Vector AB = new Vector(this.B.x - this.A.x,this.B.y - this.A.y);
//		Vector AC = new Vector(this.C.x - this.A.x, this.C.y - this.C.y);
		
		Vector AB = new Vector(this.A , this.B);
		Vector AC = new Vector(this.A, this.C);
//		if(AB.x * AC.y == AB.y * AC.x) {
//			return false;
//		}else {
//			return true;
//		}
		return AB.x * AC.y != AB.y * AC.x;
	}
	public double perimeter() {
		if(this.isValid()) {
			return this.getAB() +this.getAC() +this.getBC();
		}else {
			return 0;
		}
	}
	public double area() {
		if(this.isValid()) {
			double p = this.perimeter() / 2;
			return Math.sqrt(p*(p-this.getAB())*(p-this.getAC()*(p-this.getBC())));
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return String.format("Triangle [A=%s, B=%s, C=%s], [perimeter=%f, area=%f]",
				this.A.toString(),this.B.toString(),this.C.toString(),this.perimeter(),this.area());
	}
}
