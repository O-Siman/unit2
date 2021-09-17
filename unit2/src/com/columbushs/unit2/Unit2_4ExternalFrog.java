package com.columbushs.unit2;

public class Unit2_4ExternalFrog {
	/*
	A frog can move forward a number of hops or a predefined
	number of hops if it is not specified. A frog can also move
	either to the left or right given a number of hops. Make
	a class that prints out the frog's movements given the
	inputs.
	 */

	public void frog(int hops) {
		System.out.println("The frog has moved forward " + hops + " hops.");
	}

	public void frog() {
		System.out.println("The frog has moved forward 5 hops.");
	}

	public void frog(String direction, int hops) {
		System.out.println("The frog has moved " + direction + " " + hops + " hops.");
	}

}
