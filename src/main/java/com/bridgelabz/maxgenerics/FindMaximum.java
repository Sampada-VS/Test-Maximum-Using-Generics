package com.bridgelabz.maxgenerics;

import java.util.Comparator;
import java.util.List;

public class FindMaximum {

	public static <T extends Comparable<T>> T maximum (List <T> array) {

		T findMax = array.stream().sorted(Comparator.<T>reverseOrder())
                .findFirst()
                .get();
		printMax(array,findMax);
		return findMax;
	}

	public static <T> void printMax (List <T> array,T findMax) {
		System.out.println("Max of"+array+" is :"+findMax);
	}
		
}
