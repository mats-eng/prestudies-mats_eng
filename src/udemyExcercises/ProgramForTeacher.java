package udemyExcercises;

import java.util.Scanner;

public class ProgramForTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Students took the exam?");
        int numberOfStudents = sc.nextInt();
        System.out.println("Maximum achievable score in the exam:");
        int maximumScore = sc.nextInt();

        int[] studentScores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " Score:");
            studentScores[i] = sc.nextInt();
            while (studentScores[i] > maximumScore || studentScores[i] < 0 ) {
                System.out.println("Invalid Input. The maximum achievable " +
                        "score in the exam is " + maximumScore + ". Please try again.");
                System.out.println("Student " + (i + 1) + " Score:");
                studentScores[i] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < studentScores.length; i++) {
            sum += studentScores[i];
        }
        double scoreAverage = (double) sum / numberOfStudents;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " Score:" + studentScores[i]);
        }
        System.out.println("Score Average:" + scoreAverage);
    }
}