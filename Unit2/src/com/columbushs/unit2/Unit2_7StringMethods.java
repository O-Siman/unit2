package com.columbushs.unit2;

public class Unit2_7StringMethods {
	public void indexingTest() {
		String testingMethods1 = new String("applesauce");

		// Strings are an array of chars. Arrays are indexed starting from 0

		// indexOf method returns the location of where the
		// requested element in located in the array in an int

		System.out.println(testingMethods1.indexOf("l"));
		// Why is it that number?

		// If it doesn't find what you're looking for, indexOf will return -1

//		System.out.println(testingMethods1.indexOf("x"));

		// indexOf will only return the index number of the first instance.

//		String testingMethods2 = new String("I love applesauce lots");
//		System.out.println(testingMethods2.indexOf("l"));

		// Second parameter of indexOf is an int that tells you
		// after which part in the array to start looking

//		System.out.println(testingMethods2.indexOf("l",5));


		// To get all the positions you will need to use loops

//		int i = testingMethods2.indexOf("l");
//		while(i >= 0) {
//		     System.out.println(i);
//		     i = testingMethods2.indexOf("l", i+1);
//		}
	}

	public void substringTesting() {
		// Use substring when you need part of a string
		// you use substring(int from, int to)
		// or substring(int from) this ons starts where you tell it and goes to the end

		String subTest = "I love black cats";
		String part = subTest.substring(5, 10);
		System.out.println(part);
		// Does not include the 10th char which would be c

		String biggerPart = subTest.substring(5);
		System.out.println(biggerPart);

		// What if you want just one letter?
		String justLetter = subTest.substring(7, 8);
		System.out.println(justLetter);
	}

	public void lengthAndComparison() {

		// Length method returns an int with the length of your string
		String lengthTest = "I hate black cats";
		System.out.println(lengthTest.length());
		// Very useful for loops when going from the beginning to the end of something
		// length starts at 1 not 0 like array index

		String equalsTest1 = "time";
		String equalsTest2 = "time";
		String equalsTest3 = new String("time");
		boolean areTheyEqual = equalsTest1.equals(equalsTest2);
		System.out.println(areTheyEqual);
		// Different to ==, == checks memory addresses, .equals() checks content.
		boolean areTheyEqual2 = equalsTest1 == equalsTest3;
		System.out.println(areTheyEqual2);


		/*
		compareTo returns int
		returns <0 if less than
		returns 0 if equal to
		returns >0 if greater than
		The comparison is based on the Unicode value of each character in the strings.
		 */

		String str1 = "apple";
		String str2 = "apps";
		String str3 = "shift";
		String str4 = "app";
		String str5 = "apple";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));

		String ret1 = str1.substring(0, 2);
		String ret2 = str3.substring(str3.length() - 1);
		String result = ret2 + ret1;
		System.out.println(result.indexOf(ret2));
	}
}
