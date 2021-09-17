package com.columbushs.unit2;

public class Unit2_8ExternalWrapperClasses {
	// Integer primitive data type vs objects.
	public void integerClass() {
		// Primitive data type
		int x = 12;
		System.out.println(x);

		// Integer object, wrapper class
		Integer intObject = new Integer(157);
		System.out.println(intObject);
		System.out.println(intObject.compareTo(159)); //1 if lower, 0 if the same, -1 if higher
		System.out.println(intObject.intValue());

		// Get a primitive from the object.
		int backToInt = intObject.intValue();
		System.out.println(backToInt);
	}

	// Double primitive data type vs objects.
	public void doubleClass() {
		// Primitive data type
		double decimals = 3.45;
		System.out.println(decimals);

		// Double object, wrapper class
		Double doubleObject = new Double(45.23);
		System.out.println(doubleObject);
		System.out.println(doubleObject.equals(23.5));

		// Get a primitive from the object.
		double backToDouble = doubleObject.doubleValue();
		System.out.println(backToDouble);
	}

	public void otherWrappers() {
		// Not needed for AP test but might be good to know in case you see them.

		// boolean - true or false
		boolean d = true;
		Boolean boolObj = new Boolean(false);

		// float is a smaller double, 32 bit instead of 64, primitive ends with an f
		float dec = 123.714f;
		Float decim2 = new Float(23.5634); // object doesnt neeed the f

		// char obj
		char letter = 'f';
		Character letterObj = new Character('g');
	}
}
