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
		Assert.assertEquals(1.0, line.getPointN(0).getCoordinate().getX(),EPSILON  );
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
		Assert.assertEquals(1.0, line.getPointN(0).getCoordinate().getX(),EPSILON);
	}
	
	  @Test
	    public void testGetEnveloppe(){
	        LineString ls = GeometryFactory.createLineString();
	        Envelope env = ls.getEnvelope();
	        Assert.assertEquals(1.0, env.getXmin(), EPSILON);
	        Assert.assertEquals(5.0, env.getXmax(), EPSILON);
	        Assert.assertEquals(1.0, env.getYmin(), EPSILON);
	        Assert.assertEquals(5.0, env.getYmax(), EPSILON);
	    }
}
