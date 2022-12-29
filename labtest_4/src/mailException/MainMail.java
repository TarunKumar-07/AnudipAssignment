package mailException;
// Creating custom InvalidMailIdException and throw  for not getting correct email id from user.
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainMail {

	public static void main(String[] args) {
		// Creating Scanner class object
		Scanner scan = new Scanner(System.in);
		 boolean flag = true;		
		 while(flag) {
		 System.out.print("Enter Email : ");
		 String mail = scan.next(); //assigning email from user
		 
		 try {
			 if(!Pattern.matches("([a-zA-Z]+)([0-9]*)@(.+)[.](.+)", mail)) {		 //if not match throw exception
			   throw new InvalidMailException(">>>> Invalid Mail expected '@' & '.'");
			 }
			 else {
				 System.out.println("Valid"); //print valid mail
				flag = false; //exit the loop
			}
		 }catch(InvalidMailException ime){
			 System.out.println(ime.getMessage());
		 }
		 }
		 scan.close();
	}

}
