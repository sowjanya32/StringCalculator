package com.string.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.string.calculator.main.StringCalculator;

class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.Add("");
		assertEquals(0, result);
	}
	
	@Test
	public void testOneNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.Add("1");
		assertEquals(1, result);
	}

}
