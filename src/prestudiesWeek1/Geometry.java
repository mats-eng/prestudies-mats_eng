package prestudiesWeek1;

import java.util.Locale;
import java.util.Scanner;

public class Geometry {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the value a:");
        String inputA = s.nextLine();
        double a = Double.parseDouble(inputA);

        System.out.println("Please enter the value b:");
        String inputB = s.nextLine();
        double b = Double.parseDouble(inputB);

        double rectangleArea = a*b;
        double rectanglePerimeter = a+b;

        double rightTriangleArea = (a*b)/2;
        double rightTrianglePerimeter = a+b+Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The area of the Rectangle is: "+ rectangleArea);
        System.out.println("The perimeter of the Rectangle is: " + rectanglePerimeter);

        System.out.println("The area of the right triangle is: " + rightTriangleArea);
        System.out.format(Locale.ENGLISH,"The perimeter of the right triangle is: %.2f", rightTrianglePerimeter);
    }
}

