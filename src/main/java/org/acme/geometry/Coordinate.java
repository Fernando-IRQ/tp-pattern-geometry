package org.acme.geometry;

public class Coordinate {
private final double x;
private final double y;

public Coordinate() {
	this.x = Double.NaN;
	this.y = Double.NaN;
};

public Coordinate(double x, double y) {
	this.x = x;
	this.y = y;
}

double getX() {
	return this.x;
	
}
double getY() {
	return this.y;
}

boolean isEmpty() {
	return Double.isNaN(x) || Double.isNaN(y);
}

}
