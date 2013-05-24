package com.xebia.refactoring.bad;

@SuppressWarnings("unused")
class Circle {

	private double xCord;
	private double yCord;
	private double radius;

	Circle(double x, double y, double radius) {
		this.xCord = x;
		this.yCord = y;
		this.radius = radius;
	}
}