package labtest_1;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in); // Creating Scanner object
		// Creating three variables a, b & c
		int a,b,c;
		System.out.print("Enter the value a: "); //a for first value
		a =scan.nextInt();
		System.out.print("Enter the value b: "); //b for second value
		b =scan.nextInt();
		System.out.print("Enter the value c: "); //c for third value
		c =scan.nextInt();
		
		// calling greater() function
		a = greater(a,b,c);
		System.out.println("--> Greatest number is "+a+".");
		
		scan.close();
	}
	public static int greater(int a, int b, int c) {
									//(21,12,3)   	  (1,12,3)		  	(1,2,3)
		if(a>b) { 					// 21					12					2
			if(a>c) {				// 21
				return a;			//return 21							
			}else {
				return c;
			}
		}else if(b>c) { 			//                     12            	 	3
			return b;				//						return 12	
		}else {
			return c;				//											return 3
		}
	}
}
