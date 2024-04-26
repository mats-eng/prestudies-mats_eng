package prestudiesWeek1;

import java.util.Scanner;

public class Triangle_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How large should the triangle be?");
        int triangleSize = sc.nextInt();
        System.out.println("How many triangles would you like to generate?");
        int triangleCount = sc.nextInt();

        int i = 0;

        if (triangleSize <= 0) {
            System.out.println("No triangles generated! The size should be above 0.");
        }
        else {
            for (int j = 0; j < triangleCount; j++){
                int k = 0;
                while (k < triangleSize + 1) {
                    while (i < k) {
                        System.out.print("*");
                        i++;
                    }
                    i = 0;
                    System.out.print("\n");
                    k++;
                }
            }
        }
    }
}