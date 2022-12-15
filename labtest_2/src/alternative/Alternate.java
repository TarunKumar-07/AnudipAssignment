package alternative;

public class Alternate {

	public static void main(String[] args) {
		//initializing array
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		//declaring array
		int arr2[] = new int[((arr1.length+1)/2)];
		
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr1[i+2];
			}
		// calling method addArray
		addArray(arr2);
	}
// addArray  method to add array elements
	public static void addArray(int arr[]) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a += arr[i];  
			System.out.println(arr[i]);
		}
		System.out.println("Sum is "+a);
	}
}
