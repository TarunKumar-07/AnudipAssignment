package collectionLabTest;

import java.util.Iterator;
import java.util.TreeSet;

// 5.Write a Java program to iterate through all elements in a tree set.
public class IterateAllElementOfTreeSet {

	public static void main(String[] args) {
		// Creating TreeSet and adding elements
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Dog");
		tset.add("Cat");
		tset.add("Rat");
		tset.add("Rabbit");
		tset.add("Fish");
		tset.add("Turtle");
		tset.add("Parrot");

		// traversing elements
		Iterator<String> itr = tset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
