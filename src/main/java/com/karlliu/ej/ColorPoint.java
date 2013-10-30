package com.karlliu.ej;

import java.awt.Color;

public class ColorPoint extends Point {
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}



	//Broken - violate transitive
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
		{
			return false;
		}
		
		if (!(obj instanceof ColorPoint))
		{
			return obj.equals(this);
		}		
		
		return super.equals(obj) && ((ColorPoint)obj).color == color;
	}
	
	
}