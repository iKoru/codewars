package com.ikoru;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindUniqueTest {
	private double precision = 0.0000000000001;

	@Test
	public void sampleTestCases() {
		assertEquals(1.0, FindUnique.findUnique(new double[] { 0, 1, 0 }), precision);
		assertEquals(2.0, FindUnique.findUnique(new double[] { 1, 1, 1, 2, 1, 1 }), precision);
	}

	@Test
	public void testCases2(){
		FindUnique.findUnique(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
		FindUnique.findUnique(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
	}
}