package com.example.array;

public class FindMinArray {

	public static void main(String[] args) {

		int[] numbers = { 12, 5, 8, 1, 13 };

		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}

		}

		System.out.println("min= " + min);
	}

}
