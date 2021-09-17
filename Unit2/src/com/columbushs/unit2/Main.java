package com.columbushs.unit2;

public class Main {
	public static void main(String[] args) {
//		Unit2_1External externalInstance1 = new Unit2_1External("John",46,3.7);
//		
//		Unit2_1External externalInstance2 = new Unit2_1External("Bob", 0);
//		
//		externalInstance1.printName();
//		externalInstance2.printName();
//		System.out.println(externalInstance1.constName);

		Unit2_3ExternalMessage writingMessage = new Unit2_3ExternalMessage("Juan", "Ignacio");
//		writingMessage.writeMessage()
//		writingMessage.changeWriterToSteve();
//		writingMessage.writeMessage();

		Unit2_4ExternalFrog frogInstance = new Unit2_4ExternalFrog();
//		frogInstance.frog();
//		frogInstance.frog(13);
//		frogInstance.frog("left", 3);

		Unit2_5ExternalAverages averages = new Unit2_5ExternalAverages();
		/*
		Create a variable to store the return
		The variable you create to store your return must be the same
		type as the return
		*/
//		double average = averages.averageCalc(3,7,4,5,8,3,9,12);

		/*
		If you put in ints they will be cast as double since
		the method accepts doubles
		*/
//		System.out.println(average);

		Unit2_6ExternalStrings stringStuff = new Unit2_6ExternalStrings();
//		stringStuff.litteralsAndObjectStrings();
//		stringStuff.concatinatingStrings();
		stringStuff.escapeSequences();

		Unit2_7StringMethods moreStringStuff = new Unit2_7StringMethods();
//		moreStringStuff.indexingTest();
//		moreStringStuff.substringTesting();
//		moreStringStuff.lengthAndComparison();

		Unit2_8ExternalWrapperClasses wrappers = new Unit2_8ExternalWrapperClasses();
//		wrappers.integerClass();
//		wrappers.doubleClass();

		Unit2_9MathClass mathStuff = new Unit2_9MathClass();
//		mathStuff.mathClassTesting();
	}
}
