package question1;

/**
 * Question 1
 * Create the following shapes...Make sure you have
 * methods to calculate the area and perimeter of each shape
 */

public class ShapeTester {
    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square.calculatePerimeter());
        System.out.println(square.calculateArea());
        
        Triangle triangle = new Triangle(10,10, 20,10);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
    }

}
