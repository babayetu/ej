package com.karlliu.ej;

import java.util.HashMap;
import java.util.Map;

public class Line9HashCode {
	public final class PhoneNumber {
		private final short areaCode;
		private final short prefix;
		private final short lineNumber;		
		private volatile int hashCode;
		
		public PhoneNumber(int areaCode, int prefix, int lineNumber) {
			rangeCheck(areaCode, 999, "area code");
			rangeCheck(prefix, 999, "prefix");
			rangeCheck(lineNumber, 9999, "line number");
			this.areaCode = (short) areaCode;
			this.prefix = (short) prefix;
			this.lineNumber = (short) lineNumber;
		}

		private void rangeCheck(int arg, int max, String name) {
			if (arg < 0 || arg > max) {
				throw new IllegalArgumentException(name + ":" + arg);
			}
		}

		@Override
		public boolean equals(Object o) {
			if (o==this) {
				return true;
			}
			if (!(o instanceof PhoneNumber)) {
				return false;
			}
			
			PhoneNumber pn = (PhoneNumber)o;
			return pn.lineNumber == lineNumber &&
				   pn.areaCode == areaCode &&
				   pn.prefix == prefix;
		}
		
		//break line 9, not override hashCode()
		
		//let's add it with a simple algrithm
		@Override
		public int hashCode() {
			int result = hashCode;
			
			if (result == 0) {
				result = 17;
				result = 31 * result + areaCode;
				result = 31 * result + prefix;
				result = 31 * result + lineNumber;
				hashCode = result;
			}
			return result;
		}
		
	}
	
	public static void main(String[] args) {
		Map<PhoneNumber, String> map = new HashMap<PhoneNumber, String>();
		Line9HashCode l9hc = new Line9HashCode();
		map.put(l9hc.new PhoneNumber(111, 222,3333),"Jenny");
		System.out.println(map.get(l9hc.new PhoneNumber(111, 222,3333)));
	}
}