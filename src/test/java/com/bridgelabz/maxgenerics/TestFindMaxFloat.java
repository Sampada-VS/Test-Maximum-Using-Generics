package com.bridgelabz.maxgenerics;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFindMaxFloat {

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
		assertEquals((Float)14.5f, findmax.findMaxFloat(Arrays.asList(14.5f,8f,9f)));
	}
	@Test
	public void test_WhenMaxAtSecondPosition_thenReturnNumberFromSecondPosition() {
		assertEquals((Float)28.9f, findmax.findMaxFloat(Arrays.asList(14f,28.9f,9f)));
	}
	@Test
	public void test_WhenMaxAtThirdPosition_thenReturnNumberFromThirdPosition() {
		assertEquals((Float)19.3f, findmax.findMaxFloat(Arrays.asList(14.1f,8.2f,19.3f)));
	}

}
