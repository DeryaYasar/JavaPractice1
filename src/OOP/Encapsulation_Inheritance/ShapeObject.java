package OOP.Encapsulation_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObject {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("rec1",4,4);
        Rectangle rectangle2 = new Rectangle("rec2",4,6);
        Rectangle rectangle3 = new Rectangle("rec3",5,7);


        Square square1 = new Square(5);
        Square square2 = new Square(6);
        Square square3 = new Square(7);

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(2);


        Rectangle[] rectangleArray = {rectangle1,rectangle2,rectangle3};
        Square[] squareArray={square1,square2,square3};
        Circle[] circleArray={circle1,circle2,circle3};

        System.out.println("rectangleArray = " + Arrays.toString(rectangleArray));
        ArrayList<Rectangle> rectangles= new ArrayList<Rectangle> (Arrays.asList(rectangleArray));
        System.out.println("rectangles = " + rectangles);
        String[] rectangleName  = {rectangle1.name, rectangle2.name, rectangle3.name};
        System.out.println("rectangleName = " + Arrays.toString(rectangleName));
    }


}
