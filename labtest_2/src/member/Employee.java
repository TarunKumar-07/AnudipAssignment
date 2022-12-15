package member;

public class Employee extends Member {

	private String specialization;

// Default Constructor
	public Employee() {}
//Parameterized Constructor 
	public Employee(String Name, String Age, String Ph_num, String Address, String Salary, String specialization) {
	super(Name, Age, Ph_num, Address, Salary);
	this.specialization = specialization;
	}

	// Print Method to print data of Employee
	public void print() {
		System.out.println("Name of Employee : "+getName()); //using getter( getName() ) for private properties of Member Class
		System.out.println("Age of Employee : "+getAge());
		System.out.println("Ph Number of Employee : "+getPh_num());
		System.out.println("Address of Employee : "+getAddress());
		System.out.println("Salary of Employee : "+getSalary());
		System.out.println("Specialization of Employee : "+specialization);
	}

}
