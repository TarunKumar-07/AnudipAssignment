package collectionLabTest;

import java.util.ArrayList;
import java.util.List;

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
public class CreateArrayList {
	// execution starts here
	public static void main(String[] args) {
		ColorList(); // calling function
	}

	// creating a function who prints a list of Colors
	public static void ColorList() {
		// creating a list of <String> type
		List<String> colorList = new ArrayList<String>();
		colorList.add("Red"); // adding elements in array-list
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Pink");
		colorList.add("Purple");
		colorList.add("Black");
		colorList.add("White");

		// printing array-list using foreach loop
		for (Object color : colorList) {
			System.out.println((String) color); // typecasting object to string
		}
	}
}
