package org.acme.geometry;

public class WktWriter {

	public String writewkt(Geometry geometry){

		String w = "";
		if ( geometry instanceof Point ){
			Point p = (Point)geometry;
			if(p.isEmpty()){
				w = "EMPTY POINT";
			}
			else {
				w = "POINT(" + p.getCoordinate().getX() + " " + p.getCoordinate().getY() + ")";
			}
		} else if ( geometry instanceof LineString ){

			LineString lineString = (LineString)geometry;

			if(lineString.isEmpty()){
				w = "EMPTY LINESTRING";
			}
			else {
				w = "LINESTRING(";
				for (int i = 0; i < lineString.getNumPoints(); i++) {
					if (i != 0) {
						w += ",";
					}
					w += "" + lineString.getPointN(i).getCoordinate().getX() + " " + lineString.getPointN(i).getCoordinate().getY();
				}
				w += ")";
			}
		}else{
			throw new RuntimeException("geometry type not supported");
		}
		return w;
	}
}