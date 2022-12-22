package shape;
//Extending Square interface in class Rectangle
public class Rectangle extends Square{
	int width; // Declaring instance variable 
	public Rectangle(int length, int width) {
		// initializing value to length and width from user
		super(length); // calling parent class Square constructor
		this.width = width;
	}
	
	@Override
	public int area() { // overriding area() method of Square class
		return (super.length*width); //returning area of square
	}
	
}
