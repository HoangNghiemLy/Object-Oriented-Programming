package main;

public class Main {
	public static void main(String[] args) {
		Point A = new Point(1,1);
		Point B = new Point(1,4);
		Point C = new Point(5,1);
	
		Triangle t = new Triangle(A, B, C);
		System.out.println(t.isValid());
		System.out.println(t);
	}
}
