package member;

public class Manager extends Member {
	private String department;
	// Default Constructor
	public Manager() {}
	
	//Parameterized Constructor 
	public Manager(String Name, String Age, String Ph_num, String Address, String Salary, String specialization) {
		super(Name, Age, Ph_num, Address, Salary);
		this.department = specialization;
	}

	// Print Method to print data of Manager
	public void print() {
		System.out.println("Name of Manager : "+getName()); //using getter( getName() ) for private properties of Member Class
		System.out.println("Age of Manager : "+getAge());
		System.out.println("Ph Number of Manager : "+getPh_num());
		System.out.println("Address of Manager : "+getAddress());
		System.out.println("Salary of Manager : "+getSalary());
		System.out.println("Department of Manager : "+department);
	}

}
