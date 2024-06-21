package main;

public class Vector {
	public int x;
	public int y;
	public Vector() {
		
	}
	public Vector(Point P1, Point P2) {
		this.x = P2.x - P1.x;
		this.y = P2.y - P1.y;
	}
}
