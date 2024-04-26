package udemyExcercises;

import java.util.Scanner;
import java.util.Objects;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] array1 = new String[3];
        int i = 0;
        System.out.println("Enter your top five favorite foods:");
        while (true) {
            array1[i] = sc.nextLine();
            if (java.util.Arrays.stream(array1).noneMatch(Objects::isNull)) {
                break;
            }
            else if (array1[i].equals("0")) {
                System.out.println("Exit Code 0: Programm wird beendet.");
            }
            i++;
        }
        System.out.println("No more memory avialable. " +
                "Your favorite Food (so far):");
        for (String element : array1) {
            System.out.print(element);
            if (element.equals(array1[array1.length - 1])) {
                System.out.print(".");
                break;
            }
            System.out.print(", ");
        }
    }
}