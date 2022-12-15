package member;
// main Class where we access the private properties of Employee and Manager classes
public class MemberMain {

	public static void main(String[] args) {
		// Instantiating Employee Class as e1 
		Employee e1 = new Employee("Tarun", "21", "123457890", "Ghaziabad, UP", "75,000", "Full Stack Java");
		e1.print();
		System.out.println("\n...............................................................................................\n");
		// Instantiating Manager Class as m1
		Manager m1 = new Manager("Ankit", "30", "4626236662", "Noida, UP", "50,000", "Software Department");
		m1.print();
	}

}
