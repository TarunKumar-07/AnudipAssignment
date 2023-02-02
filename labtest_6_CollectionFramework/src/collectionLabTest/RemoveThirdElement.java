package collectionLabTest;

import java.util.ArrayList;
import java.util.List;

// 2. Write a Java program to remove the third element from a array list.
public class RemoveThirdElement {

	public static void main(String[] args) {
		// creating array of Integer type
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);

		// printing array before reemoving
		System.out.println("Before removing");
		for (Object i : array) {
			System.out.println((Integer) i);
		}

		array.remove(2); // removing third element

		// printing array after removing third element
		System.out.println("After removing");
		for (Object i : array) {
			System.out.println((Integer) i);
		}
	}
}
