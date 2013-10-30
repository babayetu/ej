package com.karlliu.ej;

import java.util.*;

public class PointOnCircle {
	private static final Set<Point> unitCircle;
	static {
		unitCircle = new HashSet<Point>();
		unitCircle.add(new Point(1,0));
		unitCircle.add(new Point(0,1));
		unitCircle.add(new Point(-1,0));
		unitCircle.add(new Point(0,-1));		
	}
	
	public static boolean onUnitCircle(Point p) {
		return unitCircle.contains(p);
	}
}