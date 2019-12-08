package com.ikoru;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SuperMarketQueueTest {
	@Test
	public void testNormalCondition() {
		assertEquals(9, SuperMarketQueue.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
		assertEquals(12, SuperMarketQueue.solveSuperMarketQueue(new int[] { 5, 3, 4}, 1));
		assertEquals(10, SuperMarketQueue.solveSuperMarketQueue(new int[] { 10, 2, 3, 3}, 2));
		assertEquals(12, SuperMarketQueue.solveSuperMarketQueue(new int[] { 2, 3, 10}, 2));
	}

	@Test
	public void testEmptyArray() {
		assertEquals(0, SuperMarketQueue.solveSuperMarketQueue(new int[] {}, 1));
	}

	@Test
	public void testSingleTillManyCustomers() {
		assertEquals(15, SuperMarketQueue.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
	}

}