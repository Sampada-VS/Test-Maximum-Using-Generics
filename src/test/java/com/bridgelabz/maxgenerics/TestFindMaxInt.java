package com.bridgelabz.maxgenerics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFindMaxInt {

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
	public void test_WhenMaxAtFirstPosition_thenReturnNumberFromFirstPosition() {
		assertEquals((Integer)14, findmax.findMaxInteger(Arrays.asList(14,8,9)));
	}
	@Test
	public void test_WhenMaxAtSecondPosition_thenReturnNumberFromSecondPosition() {
		assertEquals((Integer)28, findmax.findMaxInteger(Arrays.asList(14,28,9)));
	}
	@Test
	public void test_WhenMaxAtThirdPosition_thenReturnNumberFromThirdPosition() {
		assertEquals((Integer)19, findmax.findMaxInteger(Arrays.asList(14,8,19)));
	}

}