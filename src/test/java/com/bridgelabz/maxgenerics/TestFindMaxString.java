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
		assertEquals("peach", findmax.maximum(Arrays.asList("peach","apple","banana")));
	}
	@Test
	public void test_WhenMaxAtSecondPosition_thenReturnStringFromSecondPosition() {
		assertEquals("peach", findmax.maximum(Arrays.asList("apple","peach","car")));
	}
	@Test
	public void test_WhenMaxAtThirdPosition_thenReturnStringFromThirdPosition() {
		assertEquals("peach", findmax.maximum(Arrays.asList("apple","car","peach")));
	}

}

