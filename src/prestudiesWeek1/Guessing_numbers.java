package prestudiesWeek1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guessing_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int i = 0;
        int guess;

        do {
            i += 1;
            System.out.println("Guess the right number (The number is between 1 and 100):");
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Sorry, your number is too high!");
            } else if (guess < randomNumber) {
                System.out.println("Sorry, your number is too low!");
            }
        } while (guess != randomNumber) ;
        System.out.println("Congratulations! You guessed the right number!");
    }
}

