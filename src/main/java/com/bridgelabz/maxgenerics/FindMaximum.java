package com.bridgelabz.maxgenerics;

import java.util.List;

public class FindMaximum {
	public static <T extends Comparable<T>> T maximum (List <T> Array) {
		T max=Array.get(0);
		if(Array.get(1).compareTo(max) > 0)
			max=Array.get(1);
		if(Array.get(2).compareTo(max) > 0)
			max=Array.get(2);
		return max;
	}
}
