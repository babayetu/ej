package com.karlliu.ej;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class ColorPointTest 
{
	
	@Before
	public void setup() {
		
	}
	
	@Test
    public void testViolateSymmetry()
    {
        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1,2,Color.RED);
        assertTrue(p.equals(cp));
        assertTrue(cp.equals(p));
    }
	
	@Test
    public void testViolateTransitive()
    {
        ColorPoint cp1 = new ColorPoint(1,2,Color.RED);
        Point p2 = new Point(1,2);
        ColorPoint cp3 = new ColorPoint(1,2,Color.BLUE);
        assertTrue(cp1.equals(p2));
        assertTrue(p2.equals(cp3));
        assertTrue(cp1.equals(cp3));
    }	
 
}