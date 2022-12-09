package labtest_1;
import java.util.Scanner; // Importing Scanner class
public class Oerations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Creating Scanner object
		// Creating three variables a, b & o
		int a,b,o;
		System.out.print("Enter the value a: "); //a for first value
		a =scan.nextInt();
		System.out.print("Enter the value b: "); //b for second value
		b =scan.nextInt();
		// o for option
		System.out.print("(1 for add | 2 for sub | 3 for multi | 4 for divi)\nEnter the value o: ");
		o =scan.nextInt();
		
		operation(a,b,o); //calling the function
		scan.close(); // closing scan object

	}
	
	public static void operation(int a, int b, int o) {
		// 'a' for first value, 'b' for second value & 'o' for option
		switch (o) { 				//checking the selected option
		case 1: {
			System.out.println("--> Addition of "+a+" + "+b+" is "+(a+b)+".");
			break;
		}
		case 2: {
			System.out.println("--> Subtraction of "+a+" - "+b+" is "+(a-b)+".");
			break;
		}
		case 3: {
			System.out.println("--> Multiplication of "+a+" * "+b+" is "+(a*b)+".");
			break;
		}
		case 4: {
			System.out.println("--> Division of "+a+" / "+b+" is "+(a/b)+".");
			break;
		}
		default: // for unmatched values of 'o'
			System.out.println("Invalid Option selected..., Try Again");
		}
	}
}
