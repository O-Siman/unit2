package com.columbushs.unit2;

public class Unit2_6ExternalStrings {

	public void literalsAndStringObjects() {
		// Difference between string @literal and String objects.
		String literal1 = "Bob Smith";
		String objectInstance1 = new String("John Weston");
		String objectInstance2 = new String(literal1);

		System.out.println(literal1);
		System.out.println(objectInstance1);
		System.out.println(objectInstance2);

	}

	public void concatenatingStrings() {
		// + joins, 
		// += joins and redefines
		String literal1 = "Bob Smith";
		String objectInstance1 = new String("John Weston ");
		int bobsAge = 57;
		int johnsAge = 17;
		// Here, we can add the int and it is recast as a string
		String bobInfo = literal1 + " is " + bobsAge;
		// objectInstance1 = objectInstance1 + johnsAge;
		objectInstance1 += johnsAge;

		System.out.println(bobInfo);
		System.out.println(objectInstance1);
	}

	public void escapeSequences() {
		/* escape sequences start with a backslash -> \
		 \" prints a double quote
		 \\ prints backslash
		 \n inserts a new line. Like System.out.println
		 */

		String literal1 = "Bob Smith";
		String objectInstance1 = new String("John Weston");
		// If I want to print something out in double quotes
		System.out.println("\"" + literal1 + "\"");

		// If I want to print something out in backslashes
		System.out.println("\\" + literal1 + "\\");

		// If I want to add more lines besides println
		System.out.println(objectInstance1 + "\n" + "\n" + "\n" + "\n");
		System.out.println(literal1);
	}

}
