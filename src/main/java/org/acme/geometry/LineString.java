package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry {

	private List<Point> points;
	
	public LineString () {
		this.points = new ArrayList<>();
	}
	
	public LineString(List<Point> points) {
		
	}
	public int getNumPoints() {
		return 0;
		
	}
	
	public Point getPointN(int n) {
		return null;
		
	}
	
	@Override
	public String getType() {
		return "LineString";
	}
}
