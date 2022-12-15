package member;

public class Member {
	private String Name;
	private String Age;
	private String Ph_num;
	private String Address;
	private String Salary;
	
	// Default Constructor
	public Member() {}
	
	//Parameterized Constructor 
	public Member(String Name, String Age, String Ph_num, String Address, String Salary) {
		this.Name = Name;
		this.Age = Age;
		this.Ph_num = Ph_num;
		this.Address = Address;
		this.Salary = Salary;
	}
	
	// Getter for all properties because they all are private only accessible in same class  
	public String getName() {
		return Name;
	}
	public String getPh_num() {
		return Ph_num;
	}
	public String getAge() {
		return Age;
	}
	public String getAddress() {
		return Address;
	}
	public String getSalary() {
		return Salary;
	}
	
//	Method to print Salary of Every Member
	public void printSalary() {
		System.out.print(Salary);
	}
}
