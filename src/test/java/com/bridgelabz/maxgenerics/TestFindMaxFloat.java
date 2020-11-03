package com.bridgelabz.maxgenerics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestFindMaxFloat {

	@Test
	public void test_WhenMaxAtFirstPosition_thenReturnFloatNumberFromFirstPosition() {
		assertEquals((Float)14.5f, FindMaximum.maximum(Arrays.asList(14.5f,8f,9f)));
	}
	@Test
	public void test_WhenMaxAtSecondPosition_thenReturnFloatNumberFromSecondPosition() {
		assertEquals((Float)28.9f, FindMaximum.maximum(Arrays.asList(14f,28.9f,9f)));
	}
	@Test
	public void test_WhenMaxAtThirdPosition_thenReturnFloatNumberFromThirdPosition() {
		assertEquals((Float)19.3f, FindMaximum.maximum(Arrays.asList(14.1f,8.2f,19.3f)));
	}

}
