package com.gmail.ozerianskyy;

public class Square extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;
	private double ab;
	private double bc;
	private double cd;
	private double da;
	private double perimetr;
	private double area;

	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public void calculateSides() {
		double aX = a.getX();
		double aY = a.getY();
		double bX = b.getX();
		double bY = b.getY();
		double cX = c.getX();
		double cY = c.getY();
		double dX = d.getX();
		double dY = d.getY();

		ab = Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
		bc = Math.sqrt(Math.pow(bX - cX, 2) + Math.pow(bY - cY, 2));
		cd = Math.sqrt(Math.pow(cX - dX, 2) + Math.pow(cY - dY, 2));
		da = Math.sqrt(Math.pow(dX - aX, 2) + Math.pow(dY - aY, 2));

	}

	public double getPerimetr() {
		calculateSides();
		if (ab == bc && bc == cd && cd == da && da == ab) {

			perimetr = ab + bc + cd + da;
		} else {
			System.out.println("not a square");
			perimetr = 0;
		}
		return perimetr;
	}

	public double getArea() {
		calculateSides();
		if (perimetr > 0) {
			area = Math.pow(perimetr / 4, 2);
		} else {
			System.out.println("not a square");
			area = 0;
		}
		return area;
	}

}
