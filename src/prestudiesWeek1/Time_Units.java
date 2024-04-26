package prestudiesWeek1;

import java.util.Scanner;

public class Time_Units {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time in Seconds: ");
        int seconds = scanner.nextInt();

        // Seconds
        if (seconds < 60) {
            System.out.println(seconds + " seconds");
        }

        // Minutes
        else if (seconds >= 60 && seconds < 3600) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            System.out.println(minutes + " minutes and " + remainingSeconds + " seconds.");
        }

        // Hours
        else if (seconds >= 3600 && seconds < 86400) {
            int hours = seconds / 3600;
            int remainingMinutes = (seconds % 3600) / 60;
            int remainingSeconds = seconds % 60;
            System.out.println(hours + " hours and " + remainingMinutes + " minutes and " + remainingSeconds + " seconds.");
        }

        // Days
        else if (seconds >= 86400 && seconds < 31536000) {
            int days = seconds / 86400;
            int remainingSeconds = seconds % 86400;
            int remainingHours = remainingSeconds / 3600;
            remainingSeconds %= 3600;
            int remainingMinutes = remainingSeconds / 60;
            remainingSeconds %= 60;
            System.out.println(days + " days and " + remainingHours + " hours and " + remainingMinutes + " minutes and " + remainingSeconds + " seconds.");
        }

        // Years
        else if (seconds >= 31536000) {
            int years = seconds / 31536000;
            int remainingSeconds = seconds % 31536000;
            int remainingDays = remainingSeconds / 86400;
            remainingSeconds %= 86400;
            int remainingHours = remainingSeconds / 3600;
            remainingSeconds %= 3600;
            int remainingMinutes = remainingSeconds / 60;
            remainingSeconds %= 60;
            System.out.println(years + " years and " + remainingDays + " days and " + remainingHours + " hours and " + remainingMinutes + " minutes and " + remainingSeconds + " seconds.");
        }
    }
}
