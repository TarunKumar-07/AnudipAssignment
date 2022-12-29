package returnStringX;

import java.util.Scanner;
//Program to change character in 'X' in all positions except the last 4 positions
public class ReturnXcharString {

	public static void main(String[] args) {
		// Creating Scanner class object
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scan.nextLine();		// assigning value to str from user
		returnXstring(str);
		scan.close();
	}

	private static void returnXstring(String str) {
		/* there is no direct method in String Class to change char at any index
		 that's why taking a StringBuilder object */
		StringBuilder string = new StringBuilder(str);
		
		System.out.print("\n  Output : ");
		for (int i = 0; i < string.length()-4; i++) {
			string.setCharAt(i, 'X');		// using setCharAt() method
			
		}
		System.out.print(string);
	}

}
