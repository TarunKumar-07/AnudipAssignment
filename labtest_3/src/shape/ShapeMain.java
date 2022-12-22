package shape;

public class ShapeMain {

	public static void main(String[] args) {
		// instantiating Square and Rectangle objects 
		Square sq1 = new Square(7);
		System.out.println(" Area of Square is "+sq1.area()+"."); //calling area() method of class Square
		
		Rectangle rec1 = new Rectangle(7, 3);
		System.out.println("\n Area of Rectangle is "+rec1.area()+"."); //calling area() method of class Rectangle
	}

}
