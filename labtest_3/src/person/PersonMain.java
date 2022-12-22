package person;
// creating PersonMain class to call methods of Person and Student class
public class PersonMain {

	public static void main(String[] args) { // main() method
		// Instantiating student object s1
		Student s1 = new Student("Tarun Kumar",21,"1234567890","AF1234");
		System.out.println(s1.toString()); // calling toString() method
		
		System.out.println("\n.......................................................................................\n");
		
		// Instantiating student object s2
		Student s2 = new Student("Mohit Bisht",20,"1234111112","AF1235");
		System.out.println(s2.toString()); // calling toString() method
	}

}
