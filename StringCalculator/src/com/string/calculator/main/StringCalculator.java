package com.string.calculator.main;

import java.util.ArrayList;

public class StringCalculator {

	public int Add(String input)   {
		int sum = 0, number = 0, negativeCount = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		if(input.length() < 1)
			return sum;
		String[] splitString = input.split("[,\\n//;]+");
		for(String str : splitString) {
			if(str.length() > 0) {
				number = Integer.parseInt(str);
				if(number < 0) {
					negativeCount++;
					arrayList.add(number);
				}
				if(number > 1000) {
					number = 0;
				}
			}
			sum = sum + number;
		}
		if(negativeCount == arrayList.size() && arrayList.size() > 0) {
			throw new IllegalArgumentException("negatives not allowed and the negative numbers  : " + arrayList);
		}
		return sum;
	}

}
