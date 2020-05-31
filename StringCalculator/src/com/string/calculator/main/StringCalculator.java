package com.string.calculator.main;

public class StringCalculator {

	public int Add(String input) {
		int sum = 0;
		if(input.length() < 1)
			return sum;
		String[] splitString = input.split(",");
		for(String str : splitString) {
			sum = sum + Integer.parseInt(str);
		}
		return sum;
	}

}
