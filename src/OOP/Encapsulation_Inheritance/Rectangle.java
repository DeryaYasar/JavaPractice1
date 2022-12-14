package OOP.Encapsulation_Inheritance;

import java.util.Scanner;

public class Rectangle {

        public String name;
        public double length;
        public double width;

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                name  +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}



        /*
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter the length of rectangle");
    length=scan.nextDouble();
    System.out.println(" Enter the width of rectangle");
    width=scan.nextDouble();

    area=area(length,width);
    price=area*unitPrice;
  //  perimeter(length,width);
        System.out.println("price = " + price);


}
    public static double area(double length, double width){
      double area=length*width;
        return area;
    }

    public static void perimeter(double length, double width){
        double perimeter = 2 * (length + width);
        System.out.println("perimeter = " + perimeter);
    }

}

} */