package com.bridgelabz.maxgenerics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFindMaxString {

	static FindMaximum findmax;
	@BeforeClass
	public static void createObj() {
		findmax = new FindMaximum();
	}
	@AfterClass
	public static void nullObj() {
		findmax = null;
	}
	@Test
	public void test_WhenMaxAtFirstPosition_thenReturnStringFromFirstPosition() {
		assertEquals("banana", findmax.findMaxString(Arrays.asList("banana","apple","car")));
	}
	@Test
	public void test_WhenMaxAtSecondPosition_thenReturnStringFromSecondPosition() {
		assertEquals("banana", findmax.findMaxString(Arrays.asList("apple","banana","car")));
	}
	@Test
	public void test_WhenMaxAtThirdPosition_thenReturnStringFromThirdPosition() {
		assertEquals("banana", findmax.findMaxString(Arrays.asList("apple","car","banana")));
	}

}

