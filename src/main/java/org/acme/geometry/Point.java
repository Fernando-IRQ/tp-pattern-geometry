package org.acme.geometry;

public class Point implements Geometry{

	private Coordinate coordinate;
	
	public Point() {
		this.coordinate = new Coordinate();
	}
	
	public Point(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public Coordinate getCoordinate() {
		return this.coordinate;
	}
	
	@Override
	public String getType() {
		return "Point";
	}
	
	@Override
	public boolean isEmpty() {
		return coordinate.isEmpty();
	}
	
	@Override
	public void translate(double dx, double dy) {
			
		this.coordinate = new Coordinate(dx+this.coordinate.getX(),dy+this.coordinate.getY());
		
	}
	
	@Override
	public Point clone(){
		return new Point(this.coordinate);
	}

	@Override
	public Envelope getEnvelope() {
		 Envelope envelope = new Envelope(coordinate, coordinate);
	        return envelope;
	}
	
	@Override
	public void accept(GeometryVisitor visitor) {
		
		visitor.visit(this);
		
	}
}
