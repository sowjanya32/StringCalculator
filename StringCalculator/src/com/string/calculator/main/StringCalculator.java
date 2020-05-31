package com.string.calculator.main;

public class StringCalculator {

	public int Add(String input) {
		int sum = 0;
		if(input.length() < 1)
			return sum;
		String[] splitString = input.split("[,\\n//;]+");
		for(String str : splitString) {
			if(str.length() > 0)
				sum = sum + Integer.parseInt(str);
		}
		return sum;
	}

}
