package com.columbushs.unit2;

public class Unit2_5ExternalAverages {
	// Create a method that takes in two numbers, calculates average and
	// returns a double
	public double averageCalc(double num1, double num2) {
		// Create variable to store the result
		double average = (num1 + num2) / 2;
		// Return the variable
		return average;
	}

	public double averageCalc(double num1, double num2, double num3) {
		// Create variable to store the result
		double average = (num1 + num2 + num3) / 3;
		// Return the variable
		return average;
	}

	public double averageCalc(double... b) {
		int size = b.length;
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + b[i];
		}

		double average = sum / b.length;
		return average;
	}
}
