package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WktWiterTest {
    @Test
    public void testWriter1(){
        Geometry g = GeometryFactory.createPoint();
        WktWriter writer = new WktWriter();
        Assert.assertEquals("POINT(3.0 7.0)", writer.writewkt(g));
    }
    @Test
    public void testWriter2(){
        Geometry g = new Point();
        WktWriter writer = new WktWriter();
        Assert.assertSame("EMPTY POINT", writer.writewkt(g));
    }
    @Test
    public void testWriter3(){
        Geometry g = GeometryFactory.createLineString();
        WktWriter writer = new WktWriter();
        Assert.assertEquals("LINESTRING(1.0 1.0,2.0 2.0,3.0 3.0,4.0 4.0,5.0 5.0)", writer.writewkt(g));
    }
    @Test
    public void testWriter4(){
        Geometry g = new LineString();
        WktWriter writer = new WktWriter();
        Assert.assertSame("EMPTY LINESTRING", writer.writewkt(g));
    }
}