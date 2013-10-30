package com.karlliu.ej;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class PointOnCircleTest 
{
	
	@Before
	public void setup() {
		
	}
	
	@Test
    public void testViolateLiskov()
    {
		CounterPoint cp = new CounterPoint(0,1);
		assertTrue(PointOnCircle.onUnitCircle(cp));		
    } 
}