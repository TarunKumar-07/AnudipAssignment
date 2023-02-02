package collectionLabTest;
//3. Write a Java program of swap elements in two array list.

import java.util.ArrayList;
import java.util.List;

public class SwapElementOfTwoArrayList {
	public static void main(String[] args) {
		List<String> colorList = new ArrayList<String>();
		colorList.add("Red"); // adding elements in array-list
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Orange");

		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Blue Berry");
		fruitList.add("Grapes");
		fruitList.add("Mango");
		fruitList.add("Orange");

		// printing colorList
		System.out.println(">>>fruitList before swaping");
		for (int i = 0; i < colorList.size(); i++) {
			System.out.println(colorList.get(i));
		}

		// printing fruitList
		System.out.println("\n>>>fruitList before swaping");
		for (int i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}

		swapArrayList(colorList, fruitList);
	}

	public static void swapArrayList(List a, List b) {
		System.out.println("--------------------------------------------------");
		String temp1 = "", temp2 = "";
		for (int i = 0; i < a.size(); i++) {
			temp1 = (String) a.get(i);
			temp2 = (String) b.get(i);
			a.set(i, (Object) temp2);
			b.set(i, (Object) temp1);
		}

		// printing colorList
		System.out.println("\n>>>fruitList after swaping");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		// printing fruitList
		System.out.println("\n>>>fruitList after swaping");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
