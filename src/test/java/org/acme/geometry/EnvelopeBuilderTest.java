package org.acme.geometry;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.acme.geometry.CoordinateTest.EPSILON;

public class EnvelopeBuilderTest {
    @Test
    public void testInsert(){
    	
        EnvelopeBuilder envelopeB = new EnvelopeBuilder();
        envelopeB.insert(new Coordinate(1.0,5.0));
        
        Assert.assertEquals(1.0, envelopeB.getxVals().get(0), EPSILON);
        Assert.assertEquals(5.0, envelopeB.getyVals().get(0), EPSILON);

    }
    @Test
    public void testBuild(){
    	
        EnvelopeBuilder envelopeB = new EnvelopeBuilder();
        
        envelopeB.insert(new Coordinate(1.0,3.0));
        envelopeB.insert(new Coordinate(-1.0,1.0));
        
        Envelope env = envelopeB.build();
        Boolean bool = env.isEmpty();
        
        Assert.assertEquals(-1.0,env.getXmin(),EPSILON);
        Assert.assertEquals(1.0,env.getYmin(),EPSILON);
        Assert.assertEquals(1.0,env.getXmax(),EPSILON);
        Assert.assertEquals(3.0,env.getYmax(),EPSILON);
        Assert.assertFalse(bool);
    }

    @Test
    public void testDefaultConstructorEnveloppe(){
    	
        Envelope env = new Envelope();
        Assert.assertTrue(env.isEmpty());
    }

}