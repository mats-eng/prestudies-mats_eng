package udemyExcercises;

import java.util.Scanner;

public class Guessing_Numbers_Backwards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numerical Range for the game. The floor of the range should be:");
        int numericalRangeMin = Integer.parseInt(sc.nextLine());
        System.out.println("The ceil should be:");
        int numericalRangeMax = Integer.parseInt(sc.nextLine());
        int numberOfGuesses = 0;
        System.out.println("Think of a number from " + numericalRangeMin + " to " + numericalRangeMax + ". I will guess your number," +
                "\nbut I need you to tell me whether I should go higher or lower after each attempt.");
        while (true) {
            numberOfGuesses++;
            int machineAttempt = (int) Math.round((double)(numericalRangeMin + numericalRangeMax) / 2);
            System.out.println("My Guess: " + machineAttempt + ". Should i go higher or go lower"+
                    "\nor did i found your number :-)?");
            String UserInput = sc.nextLine();
            if (UserInput.equals("yes")) {
                System.out.println("I only needed " + numberOfGuesses + " attempts to guess your number. 8-)" );
                break;
            } else if (UserInput.equals("higher")) {
                numericalRangeMin = machineAttempt;
            } else if (UserInput.equals("lower")) {
                numericalRangeMax = machineAttempt;
            } else {
                System.out.println("Hint: Only enter \"yes\",\"higher\" or \"lower\".");
                numberOfGuesses--;
            }

        }

    }
}
