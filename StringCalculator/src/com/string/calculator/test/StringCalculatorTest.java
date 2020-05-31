package com.string.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.string.calculator.main.StringCalculator;

class StringCalculatorTest {
	
	StringCalculator stringCalculator = new StringCalculator();

	@Test
	public void testEmptyString() {
		assertEquals(0, stringCalculator.Add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, stringCalculator.Add("1"));
	}
	
	@Test
	public void testTwoNumber() {
		assertEquals(6, stringCalculator.Add("1,5"));
	}

}
