package com.bridgelabz.maxgenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMaximum {
	public static void main(String[] args) {
		List<Integer> intArray = Arrays.asList(13,4,8);
		System.out.println("Max Integer :"+Collections.max(intArray, new MaxInteger()));
		
	}
}
class MaxInteger implements Comparator<Integer> {
	public int compare (Integer o1,Integer o2) {
		return o1.compareTo(o2);	}
}