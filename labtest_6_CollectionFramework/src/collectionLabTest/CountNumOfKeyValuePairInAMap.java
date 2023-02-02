package collectionLabTest;

import java.util.HashMap;
import java.util.Map;

//6. Write a Java program to count the number of key-value (size) mappings in a map.
public class CountNumOfKeyValuePairInAMap {

	public static void main(String[] args) {
		// Creating Map and puting elements
		Map<Integer, String> kvmap = new HashMap<Integer, String>();
		kvmap.put(100, "Hindi");
		kvmap.put(101, "English");
		kvmap.put(102, "Java");
		kvmap.put(103, "SQL");
		kvmap.put(104, "Java Script");
		kvmap.put(105, "PHP");
		// Elements can traverse in any order
		System.out.println("Key -> Value");
		for (Map.Entry m : kvmap.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		// printing size of Map
		System.out.println("\n >>Size of Map is " + kvmap.size());

	}

}
