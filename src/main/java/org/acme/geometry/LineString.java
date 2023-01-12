package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry {

	private List<Point> points;
	
	public LineString () {
		this.points = new ArrayList<>();
	}
	
	public LineString(List<Point> points) {
		this.points = points;
	}
	
	public int getNumPoints() {
		return points.size();
		
	}
	
	public Point getPointN(int n) {
		return points.get(n);
	}
	
	@Override
	public String getType() {
		return "LineString";
	}

	@Override
	public boolean isEmpty() {
		return points.isEmpty();
	}

	@Override
	public void translate(double dx, double dy) {
		for(Point point : points) {
			point = new Point(new Coordinate(dx + point.getCoordinate().getX(),dy + point.getCoordinate().getY()));
		}
	}
	
	@Override
	public LineString clone(){
		
		List<Point> newPoints = new ArrayList<>();
		// clone de chaque points
		
		for(Point point : this.points) {
			newPoints.add(point.clone());
		}
		
		LineString newLinestring = new LineString(newPoints);
						
		return newLinestring;
	}
}
