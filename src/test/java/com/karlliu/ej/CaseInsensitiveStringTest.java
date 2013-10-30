package com.karlliu.ej;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CaseInsensitiveStringTest 
{
	private final String LOWCASE = "polish";
	private final String HIGHCASE = "POLISH";
	private final String FIRSTHIGHCASE = "Polish";
	private final CaseInsensitiveString cis = new CaseInsensitiveString(FIRSTHIGHCASE);
	
	@Before
	public void setup() {
		
	}
	
	@Test
    public void testStringCompare()
    {
        assertTrue( cis.equals(LOWCASE));
    }
    
	@Test
    public void testStringReverseCompare()
    {
        assertTrue( LOWCASE.equals(cis));
    }    
}
