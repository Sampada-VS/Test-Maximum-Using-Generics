package com.bridgelabz.maxgenerics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMaximum {
	public Integer findMaxInteger(List <Integer> intArray) {
		return Collections.max(intArray, new MaxInteger());
		
	}
	public Float findMaxFloat(List <Float> floatArray) {
		return Collections.max(floatArray, new MaxFloat());
		
	}
}
class MaxInteger implements Comparator<Integer> {
	public int compare (Integer o1,Integer o2) {
		return o1.compareTo(o2);	
	}
}
class MaxFloat implements Comparator<Float> {
	public int compare (Float o1,Float o2) {
		return o1.compareTo(o2);	
	}
}