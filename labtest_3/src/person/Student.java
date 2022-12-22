package person;

// Extending Person class to Student class
public class Student extends Person{ 
	// static final instance variables with immutable values
	static final String InstituteName= "Anudip Foundation";
	static String RollNumber;
	static final String[] Subjects = {"Java","MySql","Angular","SoftSkills"};
	
	Student(String Name, int Age, String Mobile, String RollNumber) { // passing values to super class Person constructor
		super(Name, Age, Mobile);
		Student.RollNumber = RollNumber;
	}

//	creating  getSubjects method to get Subjects in string form
	public static String getSubjects() {
		String str = new String();
		for (int i = 0; i < Subjects.length; i++) {
			str = str.concat(Subjects[i]+", ");
		}
		return str;
	}
	@Override
	// overriding toString method of Person class
	public String toString() {
		// returning string 
		return super.toString()+"\nInstitute Name: "+InstituteName+"\nRoll No: "+RollNumber+"\nSubjects: "+getSubjects();
	}
}
