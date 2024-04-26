package prestudiesWeek2;

// NOT FINISHED YET


import java.util.Scanner;

public class Christmas_tree_extended {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int z;
        int i;
        int j;
        int k = 4;
        System.out.println("Enter the size of the tree : ");
        int n = sc.nextInt();

        for (j = n; j > 0; j--) {
            for (i = k; i > 0; i--) {
                System.out.print(" ");
            }
            for (z = counter; z > 0; z--) {
                System.out.print("*");
            }
            System.out.print("\n");
            k--;
            counter += 2;
        }
        // System.out.println("    *    ");
    }
}
