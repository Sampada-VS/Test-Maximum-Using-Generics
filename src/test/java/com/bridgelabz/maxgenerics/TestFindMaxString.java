package com.bridgelabz.maxgenerics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestFindMaxString {

	@Test
	public void test_WhenMaxAtFirstPosition_thenReturnStringFromFirstPosition() {
		assertEquals("peach", FindMaximum.maximum(Arrays.asList("peach","apple","banana")));
	}
	@Test
	public void test_WhenMaxAtSecondPosition_thenReturnStringFromSecondPosition() {
		assertEquals("peach", FindMaximum.maximum(Arrays.asList("apple","peach","car")));
	}
	@Test
	public void test_WhenMaxAtThirdPosition_thenReturnStringFromThirdPosition() {
		assertEquals("peach", FindMaximum.maximum(Arrays.asList("apple","car","peach")));
	}

}

