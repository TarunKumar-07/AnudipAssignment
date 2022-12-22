package shape;
// Implementing Shape interface in class Square
public class Square implements Shape {
	int length; // Declaring instance variable 
	public Square(int length) {
		// initializing value to length from user
 		this.length = length;
	}
	@Override
	public int area() { // overriding area() method of Shape interface
		
		return length*length; //returning area of square
	}

}
