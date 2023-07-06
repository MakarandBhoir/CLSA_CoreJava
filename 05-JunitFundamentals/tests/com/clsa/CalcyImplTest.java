package com.clsa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcyImplTest {
	CalcyImpl obj;
	@Before
	public void setUp() {
		obj = new CalcyImpl();
	}
	
	@Test
	public void testSumShouldReturnSumOfNumbers() {
		int result = obj.sum(2, 4, 6, 8, 3);
		assertEquals(23, result);
		assertEquals(6, obj.sum(1, 2, 3));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSumShouldThrowIllegalArgumentsException() {
		obj.sum();
	}
	
	@After
	public void tearDown() {
		obj = null;
	}
	
	
}
