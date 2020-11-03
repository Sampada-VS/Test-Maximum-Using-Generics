package com.bridgelabz.maxgenerics;

import java.util.Comparator;
import java.util.List;

public class FindMaximum {
/*	T x,y,z;
	public FindMaximum (List <T> Array) {
		this.x=x;
		this.y=y;
		this.z=z;

	}
	public T maximum() {
		return FindMaximum.maximum(x,y,z);
	}*/
	public static <T extends Comparable<T>> T maximum (List <T> array) {
/*		T max=x;
		if(y.compareTo(max) > 0)
			max=y;
		if(z.compareTo(max) > 0)
			max=z;
		return max;
*/
		T findMax = array.stream().sorted(Comparator.<T>reverseOrder())
                .findFirst()
                .get();
		return findMax;
	}
		
}
