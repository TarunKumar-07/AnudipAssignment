package collectionLabTest;

import java.util.HashSet;
import java.util.Iterator;

// 4.Write a Java program to get the number of elements in a hashhhset.
public class NumberOfElementInHashSet {

	public static void main(String[] args) {
		// Creating HashSet and adding elements
		HashSet<String> hset = new HashSet<String>();
		hset.add("Tarun");
		hset.add("Ravi");
		hset.add("Vijay");
		hset.add("Raja");
		hset.add("Ajay"); // 4th
		hset.add("Harsh");
		hset.add("Vikash");
		hset.add("Akash");
		hset.add("Ajay"); // repeating 4th element, but it will be ignored

		// Traversing elements
		Iterator<String> itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// printing size ofhset
		System.out.println("\nSize of hset is " + hset.size());
	}

}
