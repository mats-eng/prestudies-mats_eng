package prestudiesWeek1;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Circumference (centimeter):");
        int circumference = sc.nextInt();
        System.out.println("Enter the height (centimeter):");
        int height = sc.nextInt();

        double radius = circumference / (2 * Math.PI);
        double floorSpace = Math.PI * Math.pow(radius, 2);
        double shellSurface = 2 * Math.PI * radius * height;
        double sheetMetalArea = floorSpace * 2 + shellSurface;
        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The area of the cylinder is " + sheetMetalArea + " square cm.");
        System.out.println("The volume of the cylinder is " + volume + " cubic cm.");
    }
}