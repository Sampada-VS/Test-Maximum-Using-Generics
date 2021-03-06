package com.bridgelabz.maxgenerics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestFindMaxInt {

	@Test
	public void test_WhenMaxAtFirstPosition_thenReturnIntegerNumberFromFirstPosition() {
		assertEquals((Integer)14, FindMaximum.maximum(Arrays.asList(14,8,9)));
	}
	@Test
	public void test_WhenMaxAtSecondPosition_thenReturnIntegerNumberFromSecondPosition() {
		assertEquals((Integer)28, FindMaximum.maximum(Arrays.asList(14,28,9)));
	}
	@Test
	public void test_WhenMaxAtThirdPosition_thenReturnIntegerNumberFromThirdPosition() {
		assertEquals((Integer)19, FindMaximum.maximum(Arrays.asList(14,8,19)));
	}

}