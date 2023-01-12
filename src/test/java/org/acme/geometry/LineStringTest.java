package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor() {
		LineString line = new LineString();
		Assert.assertEquals(0, line.getNumPoints());
	}
	
	@Test
	public void testGetNumPoints() {
		
		LineString line = GeometryFactory.createLineString();
		Assert.assertEquals(5, line.getNumPoints());
		
	}
	
	@Test
	public void testgetPointN() {
		LineString line = GeometryFactory.createLineString();
		Assert.assertEquals(2.0, line.getPointN(0).getCoordinate().getX(),EPSILON  );
	}
	
	@Test
	public void testgetType() {
		LineString line = GeometryFactory.createLineString();
		Assert.assertSame("ok","LineString",line.getType());
	}
	
	@Test
	public void testTranslate() {
		LineString line = GeometryFactory.createLineString();
		line.translate(1.0, 1.0);
		Assert.assertEquals(2.0, line.getPointN(0).getCoordinate().getX(),EPSILON);
	}
}
