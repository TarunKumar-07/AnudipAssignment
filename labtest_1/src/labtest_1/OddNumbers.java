package labtest_1;
import java.util.Scanner;
public class OddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Creating Scanner object
		
		//taking range of numbers as n
		int n;
		System.out.print("Enter the range: ");
		n =scan.nextInt();
		
		// calling oddnum() function
		oddnum(n);
		scan.close();
	}
	
	
	public static void oddnum(int n) {
		for(int i = 1; i < n; i++) {
			if(i%2 == 0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
	}
}
