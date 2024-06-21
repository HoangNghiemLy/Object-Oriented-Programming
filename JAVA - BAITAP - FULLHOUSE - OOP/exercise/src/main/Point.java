package main;

public class Point {
	public int x;
	public int y;
	public Point() {
		
	}
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return String.format("Point [x = %d, y = %d]", this.x,this.y);
	}
}
