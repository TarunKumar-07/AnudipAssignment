package person;
// creating Person class
public class Person {
	// declaring instance variable
	String Name;
	int Age;
	String Mobile;
	
	Person(){}
	Person(String Name,int Age,String Mobile){
//		initializing values to instance variables from user
		this.Name = Name;
		this.Age = Age;
		this.Mobile = Mobile;
	}
	
	@Override
	// toString for Person class 
	public String toString() {
		return "Name: "+Name+"\nAge: "+Age+"\nMobile: "+Mobile; //returning string
	}
}
