package prestudiesWeek1;

import java.util.Scanner;

public class TextInputAndOutput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name + ", Welcome to the training!");
    }
}
