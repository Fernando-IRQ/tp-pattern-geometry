package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertTrue(Double.isNaN(c.getX()));
		Assert.assertTrue(Double.isNaN(c.getY()));
	}
	
	@Test
	public void testCoordinate() {
		Coordinate c = new Coordinate(3.0,7.0);
		Assert.assertEquals(3.0,c.getX(),EPSILON);
		Assert.assertEquals(7.0,c.getY(),EPSILON);
	}

	@Test
	public void testisEmpty() {
		Coordinate c = new Coordinate();
		Assert.assertTrue(c.isEmpty());
	}
	
	
}
