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
	public String findMaxString(List <String> stringArray) {
		return Collections.max(stringArray, new MaxString());
		
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
class MaxString implements Comparator<String> {
	public int compare (String o1,String o2) {
		return Integer.compare(o1.length(), o2.length());	
	}
}