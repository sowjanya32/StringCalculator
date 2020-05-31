package com.string.calculator.main;

public class StringCalculator {

	public int Add(String input)   {
		int sum = 0, number = 0;
		if(input.length() < 1)
			return sum;
		String[] splitString = input.split("[,\\n//;]+");
		for(String str : splitString) {
			if(str.length() > 0) {
				number = Integer.parseInt(str);
				if(number < 0) {
					throw new IllegalArgumentException("negatives not allowed and the negative number is : " + number);
				}
			}
			sum = sum + number;
		}
		return sum;
	}

}
