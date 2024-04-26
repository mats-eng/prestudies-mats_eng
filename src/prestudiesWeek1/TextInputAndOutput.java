package prestudiesWeek1;

import java.util.ArrayList;
import java.util.Scanner;

public class TextInputAndOutput {
    public static void main(String[] args) {
        ArrayList<TextInputAndOutput> customers = new ArrayList<TextInputAndOutput>();
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your Name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name + ", Welcome to the training!");
    }
}
